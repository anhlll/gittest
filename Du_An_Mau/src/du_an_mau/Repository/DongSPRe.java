/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Repository;

import du_an_mau.DomainModels.DongSP;
import du_an_mau.Utilities.DBConnection;
import du_an_mau.ViewModels.DongSPViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DongSPRe {
    private DBConnection connection;

    public ArrayList<DongSP> getCBB() {
        ArrayList<DongSP> list = new ArrayList<>();

        String sql = "SELECT id,ten,ma FROM dongsp ";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)  ) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 DongSP n = new DongSP();
                 n.setId(rs.getString(1));
                 n.setTenDongsp(rs.getString(2));
                 n.setMaDongsp(rs.getString(3));
                 
                 list.add(n);
                 
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        return list;
    }
    public ArrayList<DongSPViewModel> getFormdb() {
        ArrayList<DongSPViewModel> list = new ArrayList<>();

        String sql = "select * from DongSP ";

        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                DongSPViewModel sp = new DongSPViewModel();

                sp.setId(rs.getString(1));
                sp.setMaDongsp(rs.getString(2));
                sp.setTenDongsp(rs.getString(3));

                list.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean insert(DongSPViewModel dsp) {

        String sql = "INSERT INTO DongSP(ma, ten) values (?,?)";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, dsp.getMaDongsp());
            ps.setObject(2, dsp.getTenDongsp());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String id, DongSPViewModel dsp) {

        String sql = "UPDATE [dbo].[DongSP]\n"
                + "   SET \n"
                + "      [Ma] = ?\n"
                + "      ,[Ten] =?\n"
                + " WHERE Id =?";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, dsp.getMaDongsp());
            ps.setObject(2, dsp.getTenDongsp());
            ps.setObject(3, id);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {

        String sql = "DELETE FROM [dbo].[DongSP]\n"
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
