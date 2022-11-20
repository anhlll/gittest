/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.DomainModels.CuaHang;
import du_an_mau.ViewModels.CuaHangViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface CuaHangService {

    public ArrayList<CuaHang> getList();

    public ArrayList<CuaHangViewModel> getList2();

    public Boolean insert(CuaHangViewModel ch);

    public Boolean update(String id, CuaHangViewModel ch);

    public Boolean delete(String id);
}
