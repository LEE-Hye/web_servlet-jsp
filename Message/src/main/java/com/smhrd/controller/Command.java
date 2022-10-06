package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	// Controller들을 일반 클래스로 만들기 위해서 일종의 규격을 정해주는 인터페이스
	// 인터페이스가 필요한 이유는 규격을 정해놔야 한다.
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

	
}
