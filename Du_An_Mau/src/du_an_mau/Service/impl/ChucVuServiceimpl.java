/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Service.impl;

import du_an_mau.DomainModels.ChucVu;
import du_an_mau.Repository.ChucVuRepo;
import du_an_mau.Service.ChucVuService;
import du_an_mau.ViewModels.ChucVuViewModel;


import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ChucVuServiceimpl implements ChucVuService {

    private ChucVuRepo cvr = new ChucVuRepo();

    @Override
    public ArrayList<ChucVu> getList() {
        return cvr.getCBB();
    }

    @Override
    public ArrayList<ChucVuViewModel> getList2() {
        return cvr.getFormdb();
    }

    @Override
    public Boolean insert(ChucVuViewModel cv) {
        return cvr.insert(cv);
    }

    @Override
    public Boolean update(String id, ChucVuViewModel cv) {
        return cvr.update(id, cv);
    }

    @Override
    public Boolean delete(String id) {
        return cvr.delete(id);
    }

    

    

    
}
