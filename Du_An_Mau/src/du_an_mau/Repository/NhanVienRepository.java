/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Repository;

import du_an_mau.DomainModels.ChucVu;
import du_an_mau.DomainModels.CuaHang;

import du_an_mau.Utilities.DBConnection;
import du_an_mau.ViewModels.NhanVienViewModels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class NhanVienRepository {

    private DBConnection connection;

    public ArrayList<NhanVienViewModels> getFormdb() {
        ArrayList<NhanVienViewModels> list = new ArrayList<>();

        String sql = "select NhanVien.[Id],NhanVien.[Ma],NhanVien.[Ten],NhanVien.[GioiTinh],[NgaySinh],"
                + "nhanvien.[DiaChi],[Sdt],[MatKhau],[IdCH],[IdCV],[TrangThai],CuaHang.Ma,CuaHang.Ten,"
                + "ChucVu.Ma,ChucVu.Ten from NhanVien\n"
                + "						join CuaHang on NhanVien.IdCH=CuaHang.Id\n"
                + "						join ChucVu on ChucVu.Id = NhanVien.IdCV ";

        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienViewModels nv = new NhanVienViewModels();

                nv.setId(rs.getString(1));
                nv.setManv(rs.getString(2));
                nv.setTennv(rs.getString(3));
                nv.setGt(rs.getString(4));
                nv.setNs(rs.getDate(5));
                nv.setDiachi(rs.getString(6));
                nv.setSdt(rs.getString(7));
                nv.setMk(rs.getString(8));
                nv.setTt(rs.getInt(11));

                CuaHang ch = new CuaHang();
                ch.setId(rs.getString(9));
                ch.setMach(rs.getString(12));
                ch.setTench(rs.getString(13));

                ChucVu cv = new ChucVu();
                cv.setId(rs.getString(10));
                cv.setMacv(rs.getString(14));
                cv.setTencv(rs.getString(15));

                nv.setIdch(ch);
                nv.setIdcv(cv);

                list.add(nv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    public Boolean insert(NhanVienViewModels nv) {

        String sql = "INSERT INTO [dbo].[NhanVien]\n"
                + "           (\n"
                + "           [Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[GioiTinh]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Sdt]\n"
                + "           ,[MatKhau]\n"
                + "           ,[IdCH]\n"
                + "           ,[IdCV]  \n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (\n"
                + "           ?\n"
                + "           ,?       \n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?  \n"
                + "           ,?)";

        try ( Connection con = connection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, nv.getManv());
            ps.setObject(2, nv.getTennv());
            ps.setObject(3, nv.getGt());
            ps.setObject(4, nv.getNs());
            ps.setObject(5, nv.getDiachi());
            ps.setObject(6, nv.getSdt());
            ps.setObject(7, nv.getMk());
            ps.setObject(8, nv.getIdch().getId());
            ps.setObject(9, nv.getIdcv().getId());
            ps.setObject(10, nv.getTt());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String id, NhanVienViewModels nv) {

        String sql = "UPDATE [dbo].[NhanVien]\n"
                + "   SET \n"
                + "      [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[GioiTinh] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[MatKhau] = ?\n"
                + "      ,[IdCH] = ?\n"
                + "      ,[IdCV] = ?\n"
                + "      ,[TrangThai] = ?\n"
                + " WHERE id =?";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, nv.getManv());
            ps.setObject(2, nv.getTennv());
            ps.setObject(3, nv.getGt());
            ps.setObject(4, nv.getNs());
            ps.setObject(5, nv.getDiachi());
            ps.setObject(6, nv.getSdt());
            ps.setObject(7, nv.getMk());
            ps.setObject(8, nv.getIdch().getId());
            ps.setObject(9, nv.getIdcv().getId());
            ps.setObject(10, nv.getTt());
            ps.setObject(11, id);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {

        String sql = "DELETE FROM [dbo].[NhanVien]\n"
                + "      WHERE id =?";

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
//    public ArrayList<NhanVienViewModels> gettt() {
//        ArrayList<NhanVienViewModels> list = new ArrayList<>();
//
//        String sql = "SELECT trangthai FROM NhanVien ";
//        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
//
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                NhanVienViewModels cv = new NhanVienViewModels();
//                cv.setTt(rs.getInt(1));
//                
//
//                list.add(cv);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
}
