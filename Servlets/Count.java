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
		PrintWriter out = res.getWriter();
		out.println("<h3> This page has been visited" + count + "times </h3>");
	}
}
