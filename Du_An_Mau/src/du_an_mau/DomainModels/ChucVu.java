/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.DomainModels;

/**
 *
 * @author ASUS
 */
public class ChucVu {

    private String id;
    private String macv;
    private String tencv;

    public ChucVu() {
    }

    public ChucVu(String id, String macv, String tencv) {
        this.id = id;
        this.macv = macv;
        this.tencv = tencv;
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

    @Override
    public String toString() {
        return macv + '-' + tencv;
    }

}
