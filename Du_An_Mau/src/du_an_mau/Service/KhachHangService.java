/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.DomainModels.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface KhachHangService {

    public ArrayList<KhachHang> getList();

    public Boolean insert(KhachHang kh);

    public Boolean update(String id, KhachHang kh);

    public Boolean delete(String id);
}
