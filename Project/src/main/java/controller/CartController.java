package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CartDao;
import dao.ProductDao;
import model.Cart;
import model.Product;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("addtocart")) {
			int pid = Integer.parseInt(request.getParameter("pid"));
			int cudid = Integer.parseInt(request.getParameter("cid"));
			Product p = ProductDao.getProductByPid(pid);
			Cart c = new Cart();
			c.setPid(pid);
			c.setCusid(cudid);
			c.setSid(p.getSid());
			c.setPprice(p.getPprice());
			c.setQty(1);
			c.setTotal_amount(p.getPprice());
			c.setPname(p.getPname());
			c.setImage(p.getImage());
			c.setPcategory(p.getPcategory());
			c.setPdesc(p.getPdesc());
			c.setPayment_status("pending");
			CartDao.insertCart(c);
			response.sendRedirect("customer-home.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cartId = Integer.parseInt(request.getParameter("cartid"));
		int pprice = Integer.parseInt(request.getParameter("pprice"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		Cart c = new Cart();
		c.setCart_id(cartId);
		c.setQty(qty);
		c.setTotal_amount(qty*pprice);
		CartDao.updateCart(c);
		response.sendRedirect("cart.jsp");
	}

}
