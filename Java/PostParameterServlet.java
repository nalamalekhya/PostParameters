package Project;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
   @WebServlet("/PPS")
public class PostParameterServlet extends GenericServlet {
	   public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		   res.setContentType("text/html");
		   PrintWriter pw=res.getWriter();
		   String p1=req.getParameter("ename");
		   pw.print(p1);
		   String p2=req.getParameter("ephone");
		   pw.print(p2);
		   pw.close();
	   }

}
