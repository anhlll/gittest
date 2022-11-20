/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.DomainModels;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class NhanVien {

    private String id;
    private String manv;
    private String tennv;
    private String gt;
    private Date ns;
    private String diachi;
    private String sdt;
    private String mk;
    private ChucVu idcv;
    private CuaHang idch;
    private int tt;

    public NhanVien() {
    }

    public NhanVien(String id, String manv, String tennv, String gt, Date ns, String diachi, String sdt, String mk, ChucVu idcv, CuaHang idch, int tt) {
        this.id = id;
        this.manv = manv;
        this.tennv = tennv;
        this.gt = gt;
        this.ns = ns;
        this.diachi = diachi;
        this.sdt = sdt;
        this.mk = mk;
        this.idcv = idcv;
        this.idch = idch;
        this.tt = tt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public Date getNs() {
        return ns;
    }

    public void setNs(Date ns) {
        this.ns = ns;
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

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public ChucVu getIdcv() {
        return idcv;
    }

    public void setIdcv(ChucVu idcv) {
        this.idcv = idcv;
    }

    public CuaHang getIdch() {
        return idch;
    }

    public void setIdch(CuaHang idch) {
        this.idch = idch;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

}
