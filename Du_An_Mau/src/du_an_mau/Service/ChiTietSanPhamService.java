
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.DomainModels.SanPham;
import du_an_mau.ViewModels.ChiTietSanPhamViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface ChiTietSanPhamService {

    public ArrayList<ChiTietSanPhamViewModel> getList();

    public Boolean insert(ChiTietSanPhamViewModel ctsp);

    public Boolean update(String id, ChiTietSanPhamViewModel ctsp);

    public Boolean delete(String id);

    public ArrayList<SanPham> getListcbb();

//    public ArrayList<SanPham> getListcbbten();
}
