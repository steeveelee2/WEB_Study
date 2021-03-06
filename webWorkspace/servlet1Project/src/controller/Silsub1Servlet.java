package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Silsub1Servlet
 */
@WebServlet("/silsub1.do")
public class Silsub1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Silsub1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title>실습1</title></head><body>");
		out.println("유저 아이디 : "+request.getParameter("userid")+"<br>");
		out.println("비밀번호 : "+request.getParameter("pass")+"<br>");
		out.println("이름 : "+request.getParameter("name")+"<br>");
		out.println("이메일 : "+request.getParameter("email")+"<br>");
		out.println("전화번호 : "+request.getParameter("tel1")+"-"+request.getParameter("tel2")+"-"+request.getParameter("tel3")+"<br>");
		out.println("직업 : "+request.getParameter("job")+"<br>");
		out.println("성별 : "+request.getParameter("gender")+"<br>");
		out.println("취미 : "+"<br>");
		String[] hobby=request.getParameterValues("hobby");
		for(String s:hobby) out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+s+"<br>");
		out.println("</body></html>");
		
		out.flush();
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
