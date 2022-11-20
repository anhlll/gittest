/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.ViewModels;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class KhachHangViewModel {

    private String id;
    private String makh;
    private String tenkh;
    private String hokh;
    private Date ngaySinh;
    private String sdt;
    private String diaChi;
    private String ThanhPho;
    private String quocGia;
    private String mk;

    public KhachHangViewModel() {
    }

    public KhachHangViewModel(String id, String makh, String tenkh, String hokh, Date ngaySinh, String sdt, String diaChi, String ThanhPho, String quocGia, String mk) {
        this.id = id;
        this.makh = makh;
        this.tenkh = tenkh;
        this.hokh = hokh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.ThanhPho = ThanhPho;
        this.quocGia = quocGia;
        this.mk = mk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getHokh() {
        return hokh;
    }

    public void setHokh(String hokh) {
        this.hokh = hokh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String ThanhPho) {
        this.ThanhPho = ThanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

}
