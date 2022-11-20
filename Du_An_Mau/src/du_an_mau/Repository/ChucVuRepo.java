/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Repository;

import du_an_mau.DomainModels.ChucVu;
import du_an_mau.Utilities.DBConnection;
import du_an_mau.ViewModels.ChucVuViewModel;
import du_an_mau.ViewModels.CuaHangViewModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ChucVuRepo {

    private DBConnection connection;

    public ArrayList<ChucVu> getCBB() {
        ArrayList<ChucVu> list = new ArrayList<>();

        String sql = "SELECT id ,ten,ma FROM chucvu ";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu cv = new ChucVu();
                cv.setId(rs.getString(1));
                cv.setTencv(rs.getString(2));
                cv.setMacv(rs.getString(3));

                list.add(cv);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<ChucVuViewModel> getFormdb() {
        ArrayList<ChucVuViewModel> list = new ArrayList<>();

        String sql = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[chucvu]";

        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                ChucVuViewModel ch = new ChucVuViewModel();

                ch.setId(rs.getString(1));
                ch.setMacv(rs.getString(2));
                ch.setTencv(rs.getString(3));

                list.add(ch);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean insert(ChucVuViewModel ch) {

        String sql = "INSERT INTO [dbo].[chucvu]\n"
                + "           (\n"
                + "           [Ma]\n"
                + "           ,[Ten]\n"
                + "     VALUES\n"
                + "           (\n"
                + "           ?\n"
                + "           ,?\n";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, ch.getMacv());
            ps.setObject(2, ch.getTencv());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String id, ChucVuViewModel ch) {

        String sql = "UPDATE [dbo].[chucvu]\n"
                + "   SET \n"
                + "      [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + " WHERE id =?";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, ch.getMacv());
            ps.setObject(2, ch.getTencv());

            ps.setObject(3, id);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {

        String sql = "DELETE FROM [dbo].[chucvu]\n"
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
