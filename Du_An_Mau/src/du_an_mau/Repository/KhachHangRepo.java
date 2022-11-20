/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Repository;

import du_an_mau.DomainModels.KhachHang;
import du_an_mau.Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class KhachHangRepo {

    private DBConnection connection;

    public ArrayList<KhachHang> getFormdb() {
        ArrayList<KhachHang> list = new ArrayList<>();

        String sql = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[Ho]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[Sdt]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "      ,[MatKhau]\n"
                + "  FROM [dbo].[KhachHang] ";

        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                KhachHang kh = new KhachHang();

                kh.setId(rs.getString(1));
                kh.setMakh(rs.getString(2));
                kh.setTenkh(rs.getString(3));
                kh.setHokh(rs.getString(4));
                kh.setNgaySinh(rs.getDate(5));
                kh.setSdt(rs.getString(6));
                kh.setDiaChi(rs.getString(7));
                kh.setThanhPho(rs.getString(8));
                kh.setQuocGia(rs.getString(9));
                kh.setMk(rs.getString(10));

                list.add(kh);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean insert(KhachHang kh) {

        String sql = "INSERT INTO [dbo].[KhachHang]\n"
                + "           (\n"
                + "           [Ma]\n"
                + "           ,[Ten]           \n"
                + "           ,[Ho]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[Sdt]\n"
                + "           ,[DiaChi]\n"
                + "           ,[ThanhPho]\n"
                + "           ,[QuocGia]\n"
                + "           ,[MatKhau])\n"
                + "     VALUES\n"
                + "           (\n"
                + "           ?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, kh.getMakh());
            ps.setObject(2, kh.getTenkh());
            ps.setObject(3, kh.getHokh());
            ps.setObject(4, kh.getNgaySinh());
            ps.setObject(5, kh.getSdt());
            ps.setObject(6, kh.getDiaChi());
            ps.setObject(7, kh.getThanhPho());
            ps.setObject(8, kh.getQuocGia());
            ps.setObject(9, kh.getMk());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String id, KhachHang kh) {

        String sql = "UPDATE [dbo].[KhachHang]\n"
                + "   SET \n"
                + "      [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[Ho] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[ThanhPho] = ?\n"
                + "      ,[QuocGia] = ?\n"
                + "      ,[MatKhau] = ?\n"
                + " WHERE id = ?";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, kh.getMakh());
            ps.setObject(2, kh.getTenkh());
            ps.setObject(3, kh.getHokh());
            ps.setObject(4, kh.getNgaySinh());
            ps.setObject(5, kh.getSdt());
            ps.setObject(6, kh.getDiaChi());
            ps.setObject(7, kh.getThanhPho());
            ps.setObject(8, kh.getQuocGia());
            ps.setObject(9, kh.getMk());
            ps.setObject(10, id);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {

        String sql = "DELETE FROM [dbo].[khachhang]\n"
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
}
