/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.ViewModels;

import du_an_mau.DomainModels.DongSP;
import du_an_mau.DomainModels.MauSac;
import du_an_mau.DomainModels.NSX;
import du_an_mau.DomainModels.SanPham;
import java.math.BigDecimal;

/**
 *
 * @author ASUS
 */
public class ChiTietSanPhamViewModel {

    private String id;
    private SanPham idsp;
    private MauSac idms;
    private DongSP iddongsp;
    private NSX idnsx;
    private String moTa;
    private int namBH;
    private int soLuongTon;
    private double giaNhap;
    private double giaBan;

    public ChiTietSanPhamViewModel() {
    }

    public ChiTietSanPhamViewModel(String id, SanPham idsp, MauSac idms, DongSP iddongsp, NSX idnsx, String moTa, int namBH, int soLuongTon, double giaNhap, double giaBan) {
        this.id = id;
        this.idsp = idsp;
        this.idms = idms;
        this.iddongsp = iddongsp;
        this.idnsx = idnsx;
        this.moTa = moTa;
        this.namBH = namBH;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SanPham getIdsp() {
        return idsp;
    }

    public void setIdsp(SanPham idsp) {
        this.idsp = idsp;
    }

    public MauSac getIdms() {
        return idms;
    }

    public void setIdms(MauSac idms) {
        this.idms = idms;
    }

    public DongSP getIddongsp() {
        return iddongsp;
    }

    public void setIddongsp(DongSP iddongsp) {
        this.iddongsp = iddongsp;
    }

    public NSX getIdnsx() {
        return idnsx;
    }

    public void setIdnsx(NSX idnsx) {
        this.idnsx = idnsx;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    
}
