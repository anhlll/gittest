/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Repository;

import du_an_mau.DomainModels.CuaHang;
import du_an_mau.Utilities.DBConnection;
import du_an_mau.ViewModels.CuaHangViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CuaHangRepo {

    private DBConnection connection;

    public ArrayList<CuaHang> getCBB() {
        ArrayList<CuaHang> list = new ArrayList<>();

        String sql = "SELECT id ,ten,ma FROM cuahang ";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CuaHang ch = new CuaHang();
                ch.setId(rs.getString(1));
                ch.setTench(rs.getString(2));
                ch.setMach(rs.getString(3));

                list.add(ch);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<CuaHangViewModel> getFormdb() {
        ArrayList<CuaHangViewModel> list = new ArrayList<>();

        String sql = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "  FROM [dbo].[CuaHang]";

        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                CuaHangViewModel ch = new CuaHangViewModel();

                ch.setId(rs.getString(1));
                ch.setMach(rs.getString(2));
                ch.setTench(rs.getString(3));
                ch.setDiachi(rs.getString(4));
                ch.setThanhPho(rs.getString(5));
                ch.setQuocGia(rs.getString(6));

                list.add(ch);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean insert(CuaHangViewModel ch) {

        String sql = "INSERT INTO [dbo].[CuaHang]\n"
                + "           (\n"
                + "           [Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[DiaChi]\n"
                + "           ,[ThanhPho]\n"
                + "           ,[QuocGia])\n"
                + "     VALUES\n"
                + "           (\n"
                + "           ?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, ch.getMach());
            ps.setObject(2, ch.getTench());
            ps.setObject(3, ch.getDiachi());
            ps.setObject(4, ch.getThanhPho());
            ps.setObject(5, ch.getQuocGia());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String id, CuaHangViewModel ch) {

        String sql = "UPDATE [dbo].[CuaHang]\n"
                + "   SET \n"
                + "      [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[ThanhPho] = ?\n"
                + "      ,[QuocGia] = ?\n"
                + " WHERE id =?";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, ch.getMach());
            ps.setObject(2, ch.getTench());
            ps.setObject(3, ch.getDiachi());
            ps.setObject(4, ch.getThanhPho());
            ps.setObject(5, ch.getQuocGia());
            ps.setObject(6, id);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {

        String sql = "DELETE FROM [dbo].[Cuahang]\n"
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
