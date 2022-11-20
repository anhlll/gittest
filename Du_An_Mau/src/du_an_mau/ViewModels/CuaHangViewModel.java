/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.ViewModels;

/**
 *
 * @author ASUS
 */
public class CuaHangViewModel {

    private String id;
    private String mach;
    private String tench;
    private String diachi;
    private String thanhPho;
    private String QuocGia;

    public CuaHangViewModel() {
    }

    public CuaHangViewModel(String id, String mach, String tench, String diachi, String thanhPho, String QuocGia) {
        this.id = id;
        this.mach = mach;
        this.tench = tench;
        this.diachi = diachi;
        this.thanhPho = thanhPho;
        this.QuocGia = QuocGia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMach() {
        return mach;
    }

    public void setMach(String mach) {
        this.mach = mach;
    }

    public String getTench() {
        return tench;
    }

    public void setTench(String tench) {
        this.tench = tench;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }
    
    
}
