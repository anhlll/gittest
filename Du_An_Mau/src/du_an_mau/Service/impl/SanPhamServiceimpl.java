/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Service.impl;

import du_an_mau.DomainModels.SanPham;
import du_an_mau.Repository.SanPhamRepository;
import du_an_mau.Service.SanPhamService;
import du_an_mau.ViewModels.SanPhamViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class SanPhamServiceimpl implements SanPhamService{
    private SanPhamRepository spr = new SanPhamRepository();
    @Override
    public ArrayList<SanPhamViewModel> getList() {
        return spr.getFormdb();
    }

    @Override
    public Boolean insert(SanPhamViewModel sp) {
        return spr.insert(sp);
    }

    @Override
    public Boolean update(String id, SanPhamViewModel sp) {
        return spr.update(id, sp);
    }

    @Override
    public Boolean delete(String id) {
        return spr.delete(id);
    }

    @Override
    public ArrayList<SanPham> getListcbb() {
        return spr.getCBB();
    }

//    @Override
//    public ArrayList<SanPham> getListcbbten() {
//        return spr.getCBBten();
//    }
    
}
