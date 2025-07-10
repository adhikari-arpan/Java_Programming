// Counter Using Sessions

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@WebServlet("/")
public class Counter extends HttpServlet {
	int count;
	public void init() {
		count = 0;
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		count++;
		res.setContentType("text/html");
		HttpSession ssn = req.getSession(true);		
		Integer count = (Integer)ssn.getAttribute("count");
		if(count == null) {
			ssn.setAttribute("count", 1);
		}else {
			count++;
			ssn.setAttribute("count", count);
		}
		Integer visit = (Integer) ssn.getAttribute("count");
		PrintWriter out = res.getWriter();
		out.println("<h3> This page has been visited " + visit + " times </h3>");
	}
}
