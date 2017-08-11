package com.lanou.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		// String uri = request.getRequestURI();
		// if (uri.indexOf("login") > 0) {
		// return true;
		// }
		HttpSession session = request.getSession();

		String name = (String) session.getAttribute("username");

		// 当name中有值,说明session中存储了用户信息,就让这次请求通过
		if (name != null && name != "") {
			return true;
		}

		// 如果没用,跳转到登录界面
		request.getRequestDispatcher("/WEB-INF/pages/loginpage.jsp").forward(request, response);

		return false;
	}

}
