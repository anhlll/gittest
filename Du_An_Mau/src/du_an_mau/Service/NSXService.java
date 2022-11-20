/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.DomainModels.NSX;
import du_an_mau.ViewModels.NSXViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface NSXService {

    public ArrayList<NSX> getList();

    public ArrayList<NSXViewModel> getList2();

    public Boolean insert(NSXViewModel nsx);

    public Boolean update(String id, NSXViewModel msx);

    public Boolean delete(String id);
}
