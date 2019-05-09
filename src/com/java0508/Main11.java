package com.java0508;

import java.util.ArrayList;
import java.util.List;

public class Main11 implements Main11Interface {	
		
	@Override
	public boolean 학생추가(Student stu) {
		Util.학생목록.add(null);
		return false;
	}

	@Override
	public Student 학생검색(String name) {
		
		return null;
	}

	@Override
	public boolean 학생수정(Student stu) {
		
		return false;
	}

	@Override
	public boolean 학생삭제(Student stu) {
		
		return false;
	}

}
