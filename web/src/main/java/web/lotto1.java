package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class lotto1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public lotto1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("no1");
        String b = request.getParameter("no2");
        String c = request.getParameter("no3");
        String d = request.getParameter("no4");
        String e = request.getParameter("no5");
        String f = request.getParameter("no6");

        System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);
    }

}
