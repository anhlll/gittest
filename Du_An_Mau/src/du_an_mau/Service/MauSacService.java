/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package du_an_mau.Service;

import du_an_mau.DomainModels.MauSac;
import du_an_mau.ViewModels.MauSacViewModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface MauSacService {

    public ArrayList<MauSac> getList();
    
    public ArrayList<MauSacViewModel> getList2();

    public Boolean insert(MauSacViewModel ms);

    public Boolean update(String id, MauSacViewModel ms);

    public Boolean delete(String id);
}
