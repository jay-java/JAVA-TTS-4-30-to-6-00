package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SellerDao;
import model.Seller;
import services.Servicess;

/**
 * Servlet implementation class SellerController
 */
@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SellerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {

			Seller u = new Seller();
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			SellerDao.registerSeller(u);
//			response.sendRedirect("login.jsp");
			request.setAttribute("msg", "data registered successfully");
			request.getRequestDispatcher("seller-login.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			boolean flag = SellerDao.checkEmail(email);
			if (flag == true) {
				Seller u = SellerDao.sellerLogin(email, pass);
				if (u == null) {
					request.setAttribute("msg2", "password is incorrect");
					request.getRequestDispatcher("seller-login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("user", u);
					request.getRequestDispatcher("seller-home.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg1", "account not registered");
				request.getRequestDispatcher("seller-login.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("update")) {
			Seller u = new Seller();
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			SellerDao.updateSellerProfile(u);
			HttpSession session = request.getSession();
			session.setAttribute("user", u);
			request.getRequestDispatcher("seller-home.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("change password")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = SellerDao.checkOldPassword(id, op);
			if (flag == true) {
				if (np.equals(cnp)) {
					SellerDao.updatePassword(id, np);
					response.sendRedirect("seller-home.jsp");
				} else {
					request.setAttribute("msg1", "New Password and CNP is not same");
					request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "Old Password is incorrect");
				request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("get otp")) {
			String email = request.getParameter("email");
			boolean flag = SellerDao.checkEmail(email);
			if (flag == true) {
				Servicess s = new Servicess();
				Random r = new Random();
				int num = r.nextInt(999999);
				System.out.println(num);
				s.sendMail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				request.getRequestDispatcher("serviceman-verify-otp.jsp").forward(request, response);
			}
		}
	}

}
