/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.DomainModels;

/**
 *
 * @author ASUS
 */
public class MauSac {
    private String id;
    private String mams;
    private String tenms;

    public MauSac() {
    }

    public MauSac(String id, String mams, String tenms) {
        this.id = id;
        this.mams = mams;
        this.tenms = tenms;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMams() {
        return mams;
    }

    public void setMams(String mams) {
        this.mams = mams;
    }

    public String getTenms() {
        return tenms;
    }

    public void setTenms(String tenms) {
        this.tenms = tenms;
    }

    @Override
    public String toString() {
        return mams + '-' +tenms;
    }
    
    
}
