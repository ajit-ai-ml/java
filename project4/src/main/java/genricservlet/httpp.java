package genricservlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.Date;

public class httpp extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		System.out.println("doget running.........");
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("<h1>hello Httpservlet date is  "+new Date(0).toString()+"</H1>");
	    out.println("<h1>hello ajit</H1>");
	    
		
	}
	

}
