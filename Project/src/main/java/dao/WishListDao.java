package dao;

import java.sql.Connection;

import connection.DBConnection;
import model.WishList;

public class WishListDao {
	public static void insertWishList(WishList w) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql="insert into wishlist(pid,cusid,sid,pprice,image,pname,pcategory,pdesc) values(?,?,?,?,?,?,?,?)";
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
