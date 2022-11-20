/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.DomainModels.DongSP;
import du_an_mau.ViewModels.DongSPViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface DongSPService {

    public ArrayList<DongSP> getList();

    public ArrayList<DongSPViewModel> getList2();

    public Boolean insert(DongSPViewModel dsp);

    public Boolean update(String id, DongSPViewModel dsp);

    public Boolean delete(String id);
}
