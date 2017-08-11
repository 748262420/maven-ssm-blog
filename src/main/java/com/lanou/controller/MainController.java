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
		// 低侵入式
		return "index";

		// 代码冲突A
	}

	// 到登录页面
	@RequestMapping("/loginpage")
	public String loginPage() {
		return "loginpage";
	}

	@RequestMapping("/userinfo")
	public String userinfo() {
		return "userinfo";
	}

	// 4651651-4164168-14561
	// form表单请求
	@RequestMapping("/login")
	public String login(HttpServletRequest request, @RequestParam("username") String name,
			@RequestParam("password") String pwd) {
		HttpSession session = request.getSession();
		session.setAttribute("username", name);
		// 登录成功,重定向到userinfo
		return "forward:userinfo";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		// 清楚session
		HttpSession session = request.getSession();
		session.invalidate();
		return "loginpage";
	}

}
