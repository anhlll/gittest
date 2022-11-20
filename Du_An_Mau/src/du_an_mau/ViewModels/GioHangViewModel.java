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
public class GioHangViewModel {

    private String id;
    private KhachHangViewModel idkh;
    private NhanVienViewModels idnv;
    private String ma;
    private Date ngayTao;
    private Date ngayThanhToan;
    private String tennguoiNhan;
    private String diachi;
    private String sdt;
    private int tt;

    public GioHangViewModel() {
    }

    public GioHangViewModel(String id, KhachHangViewModel idkh, NhanVienViewModels idnv, String ma, Date ngayTao, Date ngayThanhToan, String tennguoiNhan, String diachi, String sdt, int tt) {
        this.id = id;
        this.idkh = idkh;
        this.idnv = idnv;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tennguoiNhan = tennguoiNhan;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tt = tt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KhachHangViewModel getIdkh() {
        return idkh;
    }

    public void setIdkh(KhachHangViewModel idkh) {
        this.idkh = idkh;
    }

    public NhanVienViewModels getIdnv() {
        return idnv;
    }

    public void setIdnv(NhanVienViewModels idnv) {
        this.idnv = idnv;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getTennguoiNhan() {
        return tennguoiNhan;
    }

    public void setTennguoiNhan(String tennguoiNhan) {
        this.tennguoiNhan = tennguoiNhan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

}
