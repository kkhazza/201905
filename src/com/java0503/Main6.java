package com.java0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main6")
public class Main6 extends HttpServlet {
	
	List<사용자> 사용자목록 = new ArrayList<사용자>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 입력
		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("UTF-8");
		
		String 이름 = request.getParameter("이름");
		int 나이 = Integer.parseInt(request.getParameter("나이"));
		int 키 = Integer.parseInt(request.getParameter("키"));
		int 몸무게 = Integer.parseInt(request.getParameter("몸무게"));
		사용자 신규 = new 사용자(이름,나이,키,몸무게);
		사용자목록.add(신규);
		response.getWriter().print("성공 : " + 사용자목록.size());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 검색
		request.setCharacterEncoding("UTF-8");		
		
		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("UTF-8");
		
		response.getWriter().print("성공 : " + 사용자목록.size()+"<br>");
		
		// 파라메터 확인
		Enumeration<String> params = request.getParameterNames();
		while (params.hasMoreElements()) {
			System.out.println(params.nextElement());
		}
		
		String 이름 = request.getParameter("이름");
		System.out.println("1");
		boolean check = true;
		for(int i = 0; i < 사용자목록.size(); i++) {
			System.out.println("2");
			System.out.println(사용자목록.get(i).get이름());
			System.out.println(이름);
			// 비교
			if(사용자목록.get(i).get이름().equals(이름)) {
				System.out.println("2-1");
				response.getWriter().print("이름 : " + 사용자목록.get(i).get이름()+"<br>");
				response.getWriter().print("나이 : " + 사용자목록.get(i).get나이()+"<br>");
				response.getWriter().print("키 : " + 사용자목록.get(i).get키()+"<br>");
				response.getWriter().print("몸무게 : " + 사용자목록.get(i).get몸무게()+"<br>");
				check = false;
			}
		}
		System.out.println("3");
		if(check) {
			response.getWriter().print("검색한 이름 : " + 이름 + "은 사용자 목록에 없습니다.");
		}
	}

}
