/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.DomainModels;

/**
 *
 * @author ASUS
 */
public class SanPham {
    private String id;
    private String masp;
    private String tensp;

    public SanPham() {
    }

    public SanPham(String id, String masp, String tensp) {
        this.id = id;
        this.masp = masp;
        this.tensp = tensp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    @Override
    public String toString() {
        return masp + '-' +tensp  ;
    }

    

   

   
    
}
