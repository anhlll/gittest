/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.ViewModels;

/**
 *
 * @author ASUS
 */
public class GioHangChiTietViewModel {

    private GioHangViewModel idgh;
    private ChiTietSanPhamViewModel idctsp;
    private int sl;
    private double dongia;
    private double dongiakhigiam;

    public GioHangChiTietViewModel() {
    }

    public GioHangChiTietViewModel(GioHangViewModel idgh, ChiTietSanPhamViewModel idctsp, int sl, double dongia, double dongiakhigiam) {
        this.idgh = idgh;
        this.idctsp = idctsp;
        this.sl = sl;
        this.dongia = dongia;
        this.dongiakhigiam = dongiakhigiam;
    }

    public GioHangViewModel getIdgh() {
        return idgh;
    }

    public void setIdgh(GioHangViewModel idgh) {
        this.idgh = idgh;
    }

    public ChiTietSanPhamViewModel getIdctsp() {
        return idctsp;
    }

    public void setIdctsp(ChiTietSanPhamViewModel idctsp) {
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
