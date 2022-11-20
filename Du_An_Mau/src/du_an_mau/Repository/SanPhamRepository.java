/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Repository;

import du_an_mau.DomainModels.SanPham;
import du_an_mau.Utilities.DBConnection;
import du_an_mau.ViewModels.SanPhamViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class SanPhamRepository {

    private DBConnection connection;

    public ArrayList<SanPhamViewModel> getFormdb() {
        ArrayList<SanPhamViewModel> list = new ArrayList<>();

        String sql = "select sanpham.id,ma,ten from sanpham ";

        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                SanPhamViewModel sp = new SanPhamViewModel();

                sp.setId(rs.getString(1));
                sp.setMasp(rs.getString(2));
                sp.setTensp(rs.getString(3));

                list.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean insert(SanPhamViewModel sp) {

        String sql = "INSERT INTO sanpham(ma, ten) values (?,?)";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, sp.getMasp());
            ps.setObject(2, sp.getTensp());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String id, SanPhamViewModel sp) {

        String sql = "UPDATE [dbo].[SanPham]\n"
                + "   SET \n"
                + "      [Ma] = ?\n"
                + "      ,[Ten] =?\n"
                + " WHERE Id =?";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, sp.getMasp());
            ps.setObject(2, sp.getTensp());
            ps.setObject(3, id);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {

        String sql = "DELETE FROM [dbo].[SanPham]\n"
                + "      WHERE id = ?";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, id);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<SanPham> getCBB() {
        ArrayList<SanPham> list = new ArrayList<>();

        String sql = "SELECT * FROM Sanpham ";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham n = new SanPham();
                n.setId(rs.getString(1));
                n.setMasp(rs.getString(2));
                n.setTensp(rs.getString(3));
                

                list.add(n);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

//    public ArrayList<SanPham> getCBBten() {
//        ArrayList<SanPham> list = new ArrayList<>();
//
//        String sql = "SELECT ten FROM Sanpham ";
//        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
//
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                SanPham n = new SanPham();
//                n.setTensp(rs.getString(1));
//
//                list.add(n);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
}
