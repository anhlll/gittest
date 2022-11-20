/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.DomainModels;

/**
 *
 * @author ASUS
 */
public class GioHangChiTiet {

    private GioHang idgh;
    private ChiTietSanPham idctsp;
    private int sl;
    private double dongia;
    private double dongiakhigiam;

    public GioHangChiTiet() {
    }

    public GioHangChiTiet(GioHang idgh, ChiTietSanPham idctsp, int sl, double dongia, double dongiakhigiam) {
        this.idgh = idgh;
        this.idctsp = idctsp;
        this.sl = sl;
        this.dongia = dongia;
        this.dongiakhigiam = dongiakhigiam;
    }

    public GioHang getIdgh() {
        return idgh;
    }

    public void setIdgh(GioHang idgh) {
        this.idgh = idgh;
    }

    public ChiTietSanPham getIdctsp() {
        return idctsp;
    }

    public void setIdctsp(ChiTietSanPham idctsp) {
        this.idctsp = idctsp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getDongiakhigiam() {
        return dongiakhigiam;
    }

    public void setDongiakhigiam(double dongiakhigiam) {
        this.dongiakhigiam = dongiakhigiam;
    }

}
