/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Repository;

import du_an_mau.DomainModels.NSX;
import du_an_mau.Utilities.DBConnection;
import du_an_mau.ViewModels.NSXViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class NSXRe {

    private DBConnection connection;

    public ArrayList<NSX> getCBB() {
        ArrayList<NSX> list = new ArrayList<>();

        String sql = "SELECT id,ten,ma FROM NSX ";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NSX n = new NSX();
                n.setId(rs.getString(1));
                n.setTennsx(rs.getString(2));
                n.setMansx(rs.getString(3));

                list.add(n);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<NSXViewModel> getFormdb() {
        ArrayList<NSXViewModel> list = new ArrayList<>();

        String sql = "select NSX.id,ma,ten from NSX ";

        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                NSXViewModel sp = new NSXViewModel();

                sp.setId(rs.getString(1));
                sp.setMansx(rs.getString(2));
                sp.setTennsx(rs.getString(3));

                list.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean insert(NSXViewModel nsx) {

        String sql = "INSERT INTO NSX(ma, ten) values (?,?)";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, nsx.getMansx());
            ps.setObject(2, nsx.getTennsx());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String id, NSXViewModel nsx) {

        String sql = "UPDATE [dbo].[NSX]\n"
                + "   SET \n"
                + "      [Ma] = ?\n"
                + "      ,[Ten] =?\n"
                + " WHERE Id =?";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, nsx.getMansx());
            ps.setObject(2, nsx.getTennsx());
            ps.setObject(3, id);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {

        String sql = "DELETE FROM [dbo].[NSX]\n"
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
