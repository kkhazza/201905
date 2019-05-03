package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		float result = 0;
		String html = "";	

		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("utf-8");
		
		계산기 cal = new 계산기();
		
		switch(c) {
		case "+":
			result = cal.덧셈(Integer.parseInt(a),Integer.parseInt(b));
			html = html + "결과: " + a + c + b + " = " + result + "<br>";
			break;
		case "-":
			result = cal.뺄셈(Integer.parseInt(a),Integer.parseInt(b));
			html = html + "결과: " + a + c + b + " = " + result + "<br>";
			break;
		case "/":
			result = cal.나눗셈(Integer.parseInt(a),Integer.parseInt(b));
			html = html + "결과: " + a + c + b + " = " + result + "<br>";
			break;
		case "*":
			result = cal.곱셈(Integer.parseInt(a),Integer.parseInt(b));
			html = html + "결과: " + a + c + b + " = " + result + "<br>";
			break;
		default:
			html = html + "잘못된 공식입니다.<br>";
			break;
		}	
		
		html = html + "<a href='http://localhost:8080/201905'>처음으로</a>";
		response.getWriter().print(html);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
