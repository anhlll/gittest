/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Service.impl;

import du_an_mau.Repository.NhanVienRepository;
import du_an_mau.Service.NhanVienService;
import du_an_mau.ViewModels.NhanVienViewModels;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class NhanVienServiceimpl implements NhanVienService {

    private NhanVienRepository nvr = new NhanVienRepository();

    @Override
    public ArrayList<NhanVienViewModels> getList() {
        return nvr.getFormdb();
    }

    @Override
    public Boolean insert(NhanVienViewModels nv) {
        return nvr.insert(nv);
    }

    @Override
    public Boolean update(String id, NhanVienViewModels nv) {
        return nvr.update(id, nv);
    }

    @Override
    public Boolean delete(String id) {
        return nvr.delete(id);
    }

//    @Override
//    public ArrayList<NhanVienViewModels> getTT() {
//        return nvr.gettt();
//    }

}
