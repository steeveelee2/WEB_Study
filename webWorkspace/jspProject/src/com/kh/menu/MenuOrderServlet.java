package com.kh.menu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MenuOrderServlet
 */
@WebServlet("/menuOrder.do")
public class MenuOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 인코딩
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// 2. 전달한 데이터 추출
		String menu=request.getParameter("menuSelect");
		System.out.println("menu : "+menu);
		
		// 3. 비즈니스 로직
		int price=0;
		switch(menu){
		case "낙지죽":
			price=8000;
			break;
		case "닭갈비":
			price=7000;
			break;
		case "김치볶음밥":
			price=5000;
			break;
		case "나쵸":
			price=8000;
			break;
		case "김치찌개":
			price=6000;
		}
		
		// 4. 실행 결과 전송
		request.setAttribute("menu",menu);
		request.setAttribute("price",price);
		
		// 5. view(JSP) 화면에게 위임
		RequestDispatcher view=request.getRequestDispatcher("views/04_menuResult.jsp");
		view.forward(request,response);
		
	}

}
