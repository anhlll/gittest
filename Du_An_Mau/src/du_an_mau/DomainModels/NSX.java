/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.DomainModels;

/**
 *
 * @author ASUS
 */
public class NSX {
    private String id;
    private String mansx;
    private String tennsx;

    public NSX() {
    }

    public NSX(String id, String mansx, String tennsx) {
        this.id = id;
        this.mansx = mansx;
        this.tennsx = tennsx;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMansx() {
        return mansx;
    }

    public void setMansx(String mansx) {
        this.mansx = mansx;
    }

    public String getTennsx() {
        return tennsx;
    }

    public void setTennsx(String tennsx) {
        this.tennsx = tennsx;
    }

    @Override
    public String toString() {
        return  mansx + '-' +tennsx;
    }
    
    
}
