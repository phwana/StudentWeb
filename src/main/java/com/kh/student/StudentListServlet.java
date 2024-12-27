package com.kh.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 학생 리스트 조회
 * url : /student/list
 */
@WebServlet("/student/list")
public class StudentListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(request, response);
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("일용자", 99, 88));
		sList.add(new Student("이용자", 88, 77));
		sList.add(new Student("삼용자", 77, 66));
		sList.add(new Student("사용자", 66, 55));
		
		response.setContentType("text/html;charset=utf-8");		//한글아 깨지지마
		PrintWriter out = response.getWriter();
		out.println("<h1>학생 리스트 조회</h1>");
		for(int i = 0; i<sList.size(); i++){
			
		String name = sList.get(i).getName();
		int fScore = sList.get(i).getFirstScore();
		int sScore = sList.get(i).getSecondScore();
		out.println("<ul><li>학생 이름: "+name+"</li>");
		out.println("<li>1차 점수 : "+fScore+"점</li>");
		out.println("<li>2차 점수 : "+sScore+"점</li></ul>");
		}
		
//		for(Student std: sList) {//포이치문
//			System.out.println(std.toString());
//		}
	}
}
