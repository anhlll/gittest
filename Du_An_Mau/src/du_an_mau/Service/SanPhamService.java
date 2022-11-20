/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.DomainModels.SanPham;
import du_an_mau.ViewModels.SanPhamViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface SanPhamService {
    public ArrayList<SanPhamViewModel> getList();

    public Boolean insert(SanPhamViewModel sp);

    public Boolean update(String id, SanPhamViewModel sp);

    public Boolean delete(String id);

    public ArrayList<SanPham> getListcbb();
    
//    public ArrayList<SanPham> getListcbbten();
}
