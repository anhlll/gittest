/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.ViewModels;

/**
 *
 * @author ASUS
 */
public class ChucVuViewModel {

    private String id;
    private String macv;
    private String tencv;

    public ChucVuViewModel(String id, String macv, String tencv) {
        this.id = id;
        this.macv = macv;
        this.tencv = tencv;
    }

    public ChucVuViewModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMacv() {
        return macv;
    }

    public void setMacv(String macv) {
        this.macv = macv;
    }

    public String getTencv() {
        return tencv;
    }

    public void setTencv(String tencv) {
        this.tencv = tencv;
    }

}
