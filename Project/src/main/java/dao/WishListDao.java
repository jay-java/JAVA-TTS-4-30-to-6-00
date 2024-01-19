package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.WishList;

public class WishListDao {
	public static void insertWishList(WishList w) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql="insert into wishlist(pid,cusid,sid,pprice,image,pname,pcategory,pdesc) values(?,	?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getPid());
			pst.setInt(2, w.getCusid());
			pst.setInt(3, w.getSid());
			pst.setInt(4, w.getPprice());
			pst.setString(5, w.getImage());
			pst.setString(6, w.getPname());
			pst.setString(7, w.getPcategory());
			pst.setString(8, w.getPdesc());
			pst.executeUpdate();
			System.out.println("wishlist added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<WishList> getWishListByCusId(int cusid){
		List<WishList> list = new ArrayList<WishList>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql="select * from wishlist where cusid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cusid);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				WishList w = new WishList();
				w.setWid(rs.getInt("wid"));
				w.setPid(rs.getInt("pid"));
				list.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
}
