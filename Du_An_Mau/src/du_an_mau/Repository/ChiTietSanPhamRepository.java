/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package du_an_mau.Repository;

import du_an_mau.DomainModels.DongSP;
import du_an_mau.DomainModels.MauSac;
import du_an_mau.DomainModels.NSX;
import du_an_mau.DomainModels.SanPham;
import du_an_mau.Utilities.DBConnection;
import du_an_mau.ViewModels.ChiTietSanPhamViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ChiTietSanPhamRepository {

    private DBConnection connection;

    public ArrayList<ChiTietSanPhamViewModel> getFormdb() {
        ArrayList<ChiTietSanPhamViewModel> list = new ArrayList<>();

//        String sql = "select ChiTietSP.id, sanpham.ma,Ten,nambh,mota,soluongton,gianhap,giaban,idnsx,iddongsp,idmausac,chitietsp.idsp from  chitietsp join SanPham on ChiTietSP.IdSP =SanPham.Id";
//        String sql = "select ChiTietSP.id, sanpham.ma,SanPham.Ten,nambh,mota,soluongton,gianhap,"
//                + "giaban,idnsx,iddongsp,idmausac,\n"
//                + "chitietsp.idsp,nsx.ten  f"
//                + "rom  chitietsp join SanPham on ChiTietSP.IdSP =SanPham.Id \n"
//                + "join nsx on nsx.Id = ChiTietSP.IdNsx";
        String sql = "select ChiTietSP.id, sanpham.ma,SanPham.Ten,nambh,mota,soluongton,gianhap,giaban,idnsx,iddongsp,idmausac,\n"
                + "chitietsp.idsp,nsx.ten,nsx.Ma,MauSac.Ten,MauSac.Ma,DongSP.Ten,DongSP.Ma\n"
                + "from  chitietsp join SanPham on ChiTietSP.IdSP =SanPham.Id \n"
                + "                join nsx on nsx.Id = ChiTietSP.IdNsx\n"
                + "		   join MauSac on MauSac.Id =ChiTietSP.IdMauSac\n"
                + "		   join DongSP on DongSP.Id =ChiTietSP.IdDongSP";

        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSanPhamViewModel ctsp = new ChiTietSanPhamViewModel();

                ctsp.setId(rs.getString(1));
                ctsp.setNamBH(rs.getInt(4));
                ctsp.setMoTa(rs.getString(5));
                ctsp.setSoLuongTon(rs.getInt(6));
                ctsp.setGiaNhap(rs.getDouble(7));
                ctsp.setGiaBan(rs.getDouble(8));

                NSX n = new NSX();
                n.setId(rs.getString(9));
                n.setTennsx(rs.getString(13));
                n.setMansx(rs.getString(14));
                DongSP dsp = new DongSP();
                dsp.setId(rs.getString(10));
                dsp.setTenDongsp(rs.getString(17));
                dsp.setMaDongsp(rs.getString(18));
                MauSac ms = new MauSac();
                ms.setId(rs.getString(11));
                ms.setTenms(rs.getString(15));
                ms.setMams(rs.getString(16));

                ctsp.setIddongsp(dsp);
                ctsp.setIdms(ms);
                ctsp.setIdnsx(n);

                SanPham sp = new SanPham();
                sp.setMasp(rs.getString(2));
                sp.setTensp(rs.getString(3));
                sp.setId(rs.getString(12));
                ctsp.setIdsp(sp);

                list.add(ctsp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    public Boolean insert(ChiTietSanPhamViewModel ctsp) {

        String sql = "INSERT INTO [dbo].[ChiTietSP]\n"
                + "           (\n"
                + "           [IdSP]\n"
                + "           ,[IdNsx]\n"
                + "           ,[IdMauSac]\n"
                + "           ,[IdDongSP]\n"
                + "           ,[NamBH]\n"
                + "           ,[MoTa]\n"
                + "           ,[SoLuongTon]\n"
                + "           ,[GiaNhap]\n"
                + "           ,[GiaBan])\n"
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

            PreparedStatement ps2 = con.prepareStatement(sql);

            ps2.setObject(1, ctsp.getIdsp().getId());
            ps2.setObject(2, ctsp.getIdnsx().getId());
            ps2.setObject(3, ctsp.getIdms().getId());
            ps2.setObject(4, ctsp.getIddongsp().getId());
            ps2.setObject(5, ctsp.getNamBH());
            ps2.setObject(6, ctsp.getMoTa());
            ps2.setObject(7, ctsp.getSoLuongTon());
            ps2.setObject(8, ctsp.getGiaNhap());
            ps2.setObject(9, ctsp.getGiaBan());

            ps2.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(String id, ChiTietSanPhamViewModel ctsp) {

        String sql = "UPDATE [dbo].[ChiTietSP]\n"
                + "   SET \n"
                + "      [IdSP] = ?\n"
                + "      ,[IdNsx] = ?\n"
                + "      ,[IdMauSac] = ?\n"
                + "      ,[IdDongSP] = ?\n"
                + "      ,[NamBH] = ?\n"
                + "      ,[MoTa] = ?\n"
                + "      ,[SoLuongTon] = ?\n"
                + "      ,[GiaNhap] = ?\n"
                + "      ,[GiaBan] = ?\n"
                + " WHERE id= ? ";

        try ( Connection con = connection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, ctsp.getIdsp().getId());
            ps.setObject(2, ctsp.getIdnsx().getId());
            ps.setObject(3, ctsp.getIdms().getId());
            ps.setObject(4, ctsp.getIddongsp().getId());
            ps.setObject(5, ctsp.getNamBH());
            ps.setObject(6, ctsp.getMoTa());
            ps.setObject(7, ctsp.getSoLuongTon());
            ps.setObject(8, ctsp.getGiaNhap());
            ps.setObject(9, ctsp.getGiaBan());
            ps.setObject(10, id);

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {

        String sql = "DELETE FROM [dbo].[ChiTietSP]\n"
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
