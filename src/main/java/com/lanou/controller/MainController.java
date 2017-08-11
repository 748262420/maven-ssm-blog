package com.lanou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String frontPage() {
		// ������ʽ
		return "index";

		// �����ͻA
	}

	// ����¼ҳ��
	@RequestMapping("/loginpage")
	public String loginPage() {
		return "loginpage";
	}

	@RequestMapping("/userinfo")
	public String userinfo() {
		return "userinfo";
	}

	// 4651651-4164168-14561
	// form������
	@RequestMapping("/login")
	public String login(HttpServletRequest request, @RequestParam("username") String name,
			@RequestParam("password") String pwd) {
		HttpSession session = request.getSession();
		session.setAttribute("username", name);
		// ��¼�ɹ�,�ض���userinfo
		return "forward:userinfo";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		// ���session
		HttpSession session = request.getSession();
		session.invalidate();
		return "loginpage";
	}

}
