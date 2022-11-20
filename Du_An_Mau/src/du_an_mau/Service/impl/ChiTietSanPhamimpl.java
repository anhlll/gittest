/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Service.impl;

import du_an_mau.DomainModels.SanPham;
import du_an_mau.Repository.ChiTietSanPhamRepository;
import du_an_mau.Service.ChiTietSanPhamService;
import du_an_mau.ViewModels.ChiTietSanPhamViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ChiTietSanPhamimpl implements ChiTietSanPhamService {

    private ChiTietSanPhamRepository ctspr = new ChiTietSanPhamRepository();

    @Override
    public ArrayList<ChiTietSanPhamViewModel> getList() {
        return ctspr.getFormdb();
    }

    @Override
    public Boolean insert(ChiTietSanPhamViewModel ctsp) {
        return ctspr.insert(ctsp);
    }

    @Override
    public Boolean update(String id, ChiTietSanPhamViewModel ctsp) {
        return ctspr.update(id, ctsp);
    }

    @Override
    public Boolean delete(String id) {
        return ctspr.delete(id);
    }

    @Override
    public ArrayList<SanPham> getListcbb() {
        return ctspr.getCBB();
    }

//    @Override
//    public ArrayList<SanPham> getListcbbten() {
//        return ctspr.getCBBten();
//    }

}
