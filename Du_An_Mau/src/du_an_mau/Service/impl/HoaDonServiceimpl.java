/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Service.impl;

import du_an_mau.DomainModels.HoaDon;
import du_an_mau.Repository.HoaDonRepository;
import du_an_mau.Service.HoaDonService;
import du_an_mau.ViewModels.HoaDonViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class HoaDonServiceimpl implements HoaDonService {

    private HoaDonRepository hdr = new HoaDonRepository();

    @Override
    public ArrayList<HoaDonViewModel> getList() {
        return hdr.getFormdb();
    }

    @Override
    public Boolean insertHD(HoaDonViewModel hd) {
        return hdr.insertHD(hd);
    }

    @Override
    public Boolean update(String id, HoaDonViewModel kh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
