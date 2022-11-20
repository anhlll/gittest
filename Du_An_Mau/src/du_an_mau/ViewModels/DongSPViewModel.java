/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.ViewModels;

/**
 *
 * @author ASUS
 */
public class DongSPViewModel {

    private String id;
    private String maDongsp;
    private String tenDongsp;

    public DongSPViewModel() {
    }

    public DongSPViewModel(String id, String maDongsp, String tenDongsp) {
        this.id = id;
        this.maDongsp = maDongsp;
        this.tenDongsp = tenDongsp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaDongsp() {
        return maDongsp;
    }

    public void setMaDongsp(String maDongsp) {
        this.maDongsp = maDongsp;
    }

    public String getTenDongsp() {
        return tenDongsp;
    }

    public void setTenDongsp(String tenDongsp) {
        this.tenDongsp = tenDongsp;
    }

}
