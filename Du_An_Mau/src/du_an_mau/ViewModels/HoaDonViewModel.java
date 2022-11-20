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
public class HoaDonViewModel {

    private String idHoadon;
    private String maHoaDon;
    private Date NgayTao;
    private String tenNv;
    private int TinhTrang;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String idHoadon, String maHoaDon, Date NgayTao, String tenNv, int TinhTrang) {
        this.idHoadon = idHoadon;
        this.maHoaDon = maHoaDon;
        this.NgayTao = NgayTao;
        this.tenNv = tenNv;
        this.TinhTrang = TinhTrang;
    }

    public String getIdHoadon() {
        return idHoadon;
    }

    public void setIdHoadon(String idHoadon) {
        this.idHoadon = idHoadon;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

}
