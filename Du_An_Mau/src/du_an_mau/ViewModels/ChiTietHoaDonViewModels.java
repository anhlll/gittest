/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.ViewModels;

import java.math.BigDecimal;

/**
 *
 * @author ASUS
 */
public class ChiTietHoaDonViewModels {

    private String masp;
    private String tensp;
    private int sl;
    private double donGia;

    public ChiTietHoaDonViewModels() {
    }

    public ChiTietHoaDonViewModels(String masp, String tensp, int sl, double donGia) {
        this.masp = masp;
        this.tensp = tensp;
        this.sl = sl;
        this.donGia = donGia;
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

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double thanhTien(){
        return sl * donGia;
    }

}
