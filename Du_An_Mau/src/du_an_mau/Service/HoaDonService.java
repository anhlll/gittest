/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.DomainModels.HoaDon;
import du_an_mau.ViewModels.HoaDonViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface HoaDonService {

    public ArrayList<HoaDonViewModel> getList();

    public Boolean insertHD(HoaDonViewModel hd);

    public Boolean update(String id, HoaDonViewModel kh);

    public Boolean delete(String id);
}
