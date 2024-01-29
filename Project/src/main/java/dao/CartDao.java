package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Cart;

public class CartDao {
	public static void insertCart(Cart c) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into cart(pid,cusid,sid,qty,pprice,total_amount,pname,image,pcategory,pdesc,payment_status) values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getPid());
			pst.setInt(2, c.getCusid());
			pst.setInt(3, c.getSid());
			pst.setInt(4, c.getQty());
			;
			pst.setInt(5, c.getPprice());
			pst.setInt(6, c.getTotal_amount());
			pst.setString(7, c.getPname());
			pst.setString(8, c.getImage());
			pst.setString(9, c.getPcategory());
			pst.setString(10, c.getPdesc());
			pst.setString(11, c.getPayment_status());
			pst.executeUpdate();
			System.out.println("added to cart");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Cart> getCartByCusId(int cusid){
		List<Cart> list = new ArrayList<Cart>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from cart where cusid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cusid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Cart c = new Cart();
				c.setCart_id(rs.getInt("cart_id"));
				c.setPid(rs.getInt("pid"));
				c.setCusid(rs.getInt("cusid"));
				c.setSid(rs.getInt("sid"));
				c.setQty(rs.getInt("qty"));
				c.setPprice(rs.getInt("pprice"));
				c.setTotal_amount(rs.getInt("total_amount"));
				c.setPname(rs.getString("pname"));
				c.setImage(rs.getString("image"));
				c.setPcategory(rs.getString("pcategory"));
				c.setPdesc(rs.getString("pdesc"));
				c.setPayment_status(rs.getString("payment_status"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void updateCart(Cart c) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "update cart set qty=?,total_amount=? where cart_id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getQty());
			pst.setInt(2, c.getTotal_amount());
			pst.setInt(3, c.getCart_id());
			pst.executeUpdate();
			System.out.println("cart udpated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
