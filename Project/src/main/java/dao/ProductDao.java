package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.Product;

public class ProductDao {
	public static void uploadProduct(Product p) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into product(sid,image,pname,pprice,pcategory,pdesc) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getSid());
			pst.setString(2, p.getImage());
			pst.setString(3, p.getPname());
			pst.setInt(4, p.getPprice());
			pst.setString(5, p.getPcategory());
			pst.setString(6, p.getPdesc());
			pst.executeUpdate();
			System.out.println("product upload");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
