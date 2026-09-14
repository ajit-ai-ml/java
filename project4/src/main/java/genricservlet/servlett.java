package genricservlet;
import jakarta.servlet.*;
import java.io.*;

public class servlett extends GenericServlet {
	
	
	public void service(ServletRequest req ,ServletResponse res) throws IOException, ServletException {
		 
	System.out.println("service...");
		res.setContentType("text/Html");
		PrintWriter out = res.getWriter();
	
		out.println("<H1>Hello india </H1>");
		RequestDispatcher rd= req.getRequestDispatcher("p5");
		rd.include(req, res);
		
	}
	

}
