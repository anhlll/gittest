/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Service.impl;

import du_an_mau.DomainModels.NSX;
import du_an_mau.Repository.NSXRe;
import du_an_mau.Service.NSXService;
import du_an_mau.ViewModels.NSXViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class NSXServiceimpl implements NSXService {

    private NSXRe nsxr = new NSXRe();

    @Override
    public ArrayList<NSX> getList() {
        return nsxr.getCBB();
    }
    @Override
    public ArrayList<NSXViewModel> getList2() {
        return nsxr.getFormdb();
    }

    @Override
    public Boolean insert(NSXViewModel nsx) {
        return nsxr.insert(nsx);
    }

    @Override
    public Boolean update(String id, NSXViewModel msx) {
        return nsxr.update(id, msx);
    }

    @Override
    public Boolean delete(String id) {
        return nsxr.delete(id);
    }

}
