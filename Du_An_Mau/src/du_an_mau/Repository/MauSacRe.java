/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Repository;

import du_an_mau.DomainModels.MauSac;
import du_an_mau.Utilities.DBConnection;
import du_an_mau.ViewModels.MauSacViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MauSacRe {

    private DBConnection connection;

    public ArrayList<MauSac> getCBB() {
        ArrayList<MauSac> list = new ArrayList<>();

        String sql = "SELECT id ,ten,ma FROM mausac ";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac n = new MauSac();
                n.setId(rs.getString(1));
                n.setTenms(rs.getString(2));
                n.setMams(rs.getString(3));

                list.add(n);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<MauSacViewModel> getFormdb() {
        ArrayList<MauSacViewModel> list = new ArrayList<>();

        String sql = "select mausac.id,ma,ten from mausac ";

        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                MauSacViewModel sp = new MauSacViewModel();

                sp.setId(rs.getString(1));
                sp.setMams(rs.getString(2));
                sp.setTenms(rs.getString(3));

                list.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean insert(MauSacViewModel ms) {

        String sql = "INSERT INTO mausac(ma, ten) values (?,?)";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, ms.getMams());
            ps.setObject(2, ms.getTenms());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String id, MauSacViewModel ms) {

        String sql = "UPDATE [dbo].[mausac]\n"
                + "   SET \n"
                + "      [Ma] = ?\n"
                + "      ,[Ten] =?\n"
                + " WHERE Id =?";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, ms.getMams());
            ps.setObject(2, ms.getTenms());
            ps.setObject(3, id);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {

        String sql = "DELETE FROM [dbo].[mausac]\n"
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
