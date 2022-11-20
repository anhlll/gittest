/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Service.impl;

import du_an_mau.DomainModels.DongSP;
import du_an_mau.Repository.DongSPRe;
import du_an_mau.Service.DongSPService;
import du_an_mau.ViewModels.DongSPViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DongSPServiceimpl implements DongSPService {

    private DongSPRe dspr = new DongSPRe();

    @Override
    public ArrayList<DongSP> getList() {
        return dspr.getCBB();
    }
    @Override
    public ArrayList<DongSPViewModel> getList2() {
        return dspr.getFormdb();
    }

    @Override
    public Boolean insert(DongSPViewModel dsp) {
        return dspr.insert(dsp);
    }

    @Override
    public Boolean update(String id, DongSPViewModel dsp) {
        return dspr.update(id, dsp);
    }

    @Override
    public Boolean delete(String id) {
        return dspr.delete(id);
    }

}
