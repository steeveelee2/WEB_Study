package com.kh.person.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestPerson1Servlet
 */
@WebServlet("/testPerson3.biz")
public class TestPerson3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestPerson3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 인코딩
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
		
		// 첫번째 매개변수인 HttpServletRequest request는 웹 브라우저로부터 전달된 (사용자가 요청한) 데이터를 받아주는 역할이다
		// 두번째 매개변수인 HttpServletResponse response는 request를 통해 받은 데이터를 가공하여 처리한 결과를 다시 사용자에게 리턴하는 역할이다
		
		// 2. request로부터 데이터 전달 받기
		String name=request.getParameter("name");
		String color=request.getParameter("color");
		String animal=request.getParameter("animal");
		
		// 체크박스나 기타 여러 값을 가지는 name을 호출할 경우 name 값을 배열형태로 받아온다
		String[] food=request.getParameterValues("food");
		
		System.out.println("name : "+name);
		System.out.println("name : "+color);
		System.out.println("name : "+animal);
		for(String s:food) System.out.println("food : "+s);
		
		// 2-1. 비즈니스 로직
		// 웹 서버에서 제공하는 서비스를 처리하기 위한 소스코드
		// 사용자가 좋아하는 색깔을 기준으로 상품 추천하기
		String recommend="";
		switch(color){
		case "뻘겅":
			recommend="씨뻘건 사과";
			break;
		case "가알":
			recommend="악어가죽 지갑";
			break;
		case "퍼렁":
			recommend="씨퍼런 파와-에에이드";
			break;
		case "누렁":
			recommend="누렁이";
		}
		
		// 3. response 객체에 처리한 응답 내용 전송하기
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title>개인 취향 테스트 결과</title></head><body>");
		out.println("<h2 style='color:red;'>개인 취향 테스트 결과</h2>");
		out.printf("<span style='color:blue; font-weight:bold;'>%s</span>의 개인 취향은 <br>",name);
		out.printf("<span style='color:green;'>%s</span>색을 좋아함<br>",color);
		out.printf("<span style='color:yellowgreen;'>%s</span> 애호가<br>",animal);
		out.println("조와하는 식품은 ");
		for(String s:food) out.printf("%s ",s);
		out.printf("<h3>추천 상품은 %s</h3>",recommend);
		out.println("</body></html>");
		
		out.flush();
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
	
}
