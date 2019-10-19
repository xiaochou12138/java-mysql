

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");
	    request.setCharacterEncoding("GBK");
	    PrintWriter out = response.getWriter();
		String s1,s2,s3;
		s1=request.getParameter("a");
		s2=request.getParameter("b");
		s3=request.getParameter("c");
		out.println("<HTML>");		
		out.println("  <BODY>");		
		out.println("传过来的第一个数据："+s1+"<br>");
		out.println("传过来的第二个数据："+s2+"<br>");
		out.println("传过来的第三个数据："+s3+"<br>");		
		out.println("<DIV align=center>");
		out.println("<a href=\"MyJsp.jsp\">返回</a><br>");
		out.println("  <BODY>");		
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
