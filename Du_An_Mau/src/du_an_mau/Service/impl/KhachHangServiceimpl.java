/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Service.impl;

import du_an_mau.DomainModels.KhachHang;
import du_an_mau.Repository.KhachHangRepo;
import du_an_mau.Service.KhachHangService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class KhachHangServiceimpl implements KhachHangService {

    private KhachHangRepo khr = new KhachHangRepo();

    @Override
    public ArrayList<KhachHang> getList() {
        return khr.getFormdb();
    }

    @Override
    public Boolean insert(KhachHang kh) {
        return khr.insert(kh);
    }

    @Override
    public Boolean update(String id, KhachHang kh) {
        return khr.update(id, kh);
    }

    @Override
    public Boolean delete(String id) {
        return khr.delete(id);
    }

}
