/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.ViewModels.ChiTietHoaDonViewModels;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface HoaDonChiTietService {

    public ArrayList<ChiTietHoaDonViewModels> getList();

    public Boolean insertHD(ChiTietHoaDonViewModels hd);

    public Boolean update(String id, ChiTietHoaDonViewModels kh);

    public Boolean delete(String id);
}
