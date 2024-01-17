package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CustomerDao;
import dao.SellerDao;
import model.Customer;
import model.Seller;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {

			Customer u = new Customer();
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			CustomerDao.registerCustomer(u);
//			response.sendRedirect("login.jsp");
			request.setAttribute("msg", "data registered successfully");
			request.getRequestDispatcher("customer-login.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			boolean flag = CustomerDao.checkEmail(email);
			if (flag == true) {
				Customer u = CustomerDao.customerLogin(email, pass);
				if (u == null) {
					request.setAttribute("msg2", "password is incorrect");
					request.getRequestDispatcher("customer-login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("user", u);
					request.getRequestDispatcher("customer-home.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg1", "account not registered");
				request.getRequestDispatcher("customer-login.jsp").forward(request, response);
			}
		}
	}

}
