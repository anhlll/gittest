/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.DomainModels.ChucVu;
import du_an_mau.ViewModels.ChucVuViewModel;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface ChucVuService {

    public ArrayList<ChucVu> getList();

    public ArrayList<ChucVuViewModel> getList2();

    public Boolean insert(ChucVuViewModel cv);

    public Boolean update(String id, ChucVuViewModel cv);

    public Boolean delete(String id);
}
