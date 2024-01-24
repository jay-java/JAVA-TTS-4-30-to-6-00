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
				w.setCusid(rs.getInt("cusid"));
				w.setSid(rs.getInt("sid"));
				w.setPprice(rs.getInt("pprice"));
				w.setImage(rs.getString("image"));
				w.setPname(rs.getString("pname"));
				w.setPcategory(rs.getString("pcategory"));
				w.setPdesc(rs.getString("pdesc"));
				list.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	public static void removeFromWishList(int wid) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql="delete from wishlist where wid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, wid);
			pst.executeUpdate();
			System.out.println("removed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkItem(int pid,int cusid) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.createConnection();
			String sql="select * from wishlist where pid=? and cusid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			pst.setInt(2, cusid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
}
