/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Service.impl;

import du_an_mau.DomainModels.CuaHang;
import du_an_mau.Repository.CuaHangRepo;
import du_an_mau.Service.CuaHangService;
import du_an_mau.ViewModels.CuaHangViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CuaHangServiceimpl implements CuaHangService {

    private CuaHangRepo chr = new CuaHangRepo();

    @Override
    public ArrayList<CuaHang> getList() {
        return chr.getCBB();
    }

    @Override
    public ArrayList<CuaHangViewModel> getList2() {
        return chr.getFormdb();
    }

    @Override
    public Boolean insert(CuaHangViewModel ch) {
        return chr.insert(ch);
    }

    @Override
    public Boolean update(String id, CuaHangViewModel ch) {
        return chr.update(id, ch);
    }

    @Override
    public Boolean delete(String id) {
        return chr.delete(id);
    }

}
