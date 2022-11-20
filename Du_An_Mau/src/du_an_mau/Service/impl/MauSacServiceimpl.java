/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Service.impl;

import du_an_mau.DomainModels.MauSac;
import du_an_mau.Repository.MauSacRe;
import du_an_mau.Service.MauSacService;
import du_an_mau.ViewModels.MauSacViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MauSacServiceimpl implements MauSacService {

    private MauSacRe msr = new MauSacRe();

    @Override
    public ArrayList<MauSac> getList() {
        return msr.getCBB();
    }
    @Override
    public ArrayList<MauSacViewModel> getList2() {
        return msr.getFormdb();
    }

    @Override
    public Boolean insert(MauSacViewModel ms) {
        return msr.insert(ms);
    }

    @Override
    public Boolean update(String id, MauSacViewModel ms) {
        return msr.update(id, ms);
    }

    @Override
    public Boolean delete(String id) {
        return msr.delete(id);
    }

}
