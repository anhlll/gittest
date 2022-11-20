/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Repository;

import du_an_mau.DomainModels.HoaDon;
import du_an_mau.Utilities.DBConnection;
import du_an_mau.ViewModels.HoaDonViewModel;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class HoaDonRepository {

    private DBConnection connection;

    public ArrayList<HoaDonViewModel> getFormdb() {
        ArrayList<HoaDonViewModel> list = new ArrayList<>();

        String sql = "select id,ma,ngaytao,tinhtrang from hoadon";

        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonViewModel hd = new HoaDonViewModel();

                hd.setIdHoadon(rs.getString(1));
                hd.setMaHoaDon(rs.getString(2));
                hd.setNgayTao(rs.getDate(3));
                hd.setTinhTrang(rs.getInt(4));

                list.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean insertHD(HoaDonViewModel hoaDon) {

        int checkInsert = 0;

        String sql = "insert into hoadon (ngaytao, tinhtrang ,ma) values (?, ?, ? )";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, hoaDon.getNgayTao());
            ps.setObject(2, hoaDon.getTinhTrang());
            ps.setObject(3, hoaDon.getMaHoaDon());
            checkInsert = ps.executeUpdate();
            return checkInsert > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
//     public Boolean update(String id,HoaDonViewModel hoaDon) {
//
//        int checkInsert = 0;
//
//        String sql = "insert into hoadon (ngaytao, tinhtrang ,ma) values (?, ?, ? )";
//        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setObject(1, hoaDon.getNgayTao());
//            ps.setObject(2, hoaDon.getTinhTrang());
//            ps.setObject(3, hoaDon.getMaHoaDon());
//            checkInsert = ps.executeUpdate();
//            return checkInsert > 0;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//      public Boolean delete(String id) {
//
//        int checkInsert = 0;
//
//        String sql = "insert into hoadon (ngaytao, tinhtrang ,ma) values (?, ?, ? )";
//        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setObject(1, hoaDon.getNgayTao());
//            ps.setObject(2, hoaDon.getTinhTrang());
//            ps.setObject(3, hoaDon.getMaHoaDon());
//            checkInsert = ps.executeUpdate();
//            return checkInsert > 0;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
