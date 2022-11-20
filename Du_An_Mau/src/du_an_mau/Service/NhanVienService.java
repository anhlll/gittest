/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.ViewModels.NhanVienViewModels;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface NhanVienService {

    public ArrayList<NhanVienViewModels> getList();

    public Boolean insert(NhanVienViewModels nv);

    public Boolean update(String id, NhanVienViewModels nv);

    public Boolean delete(String id);
    
//    public ArrayList<NhanVienViewModels> getTT();
}
