
package com.lanou.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptorHandler1 extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub

		// 在请求发来的时候还未开始处理，就已经执行这个方法
		// true 请求通过
		// false：不通过

		System.out.println("interceptor1-------------------prehandler");

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

		// 处理请求之后执行这个方法

		System.out.println("interceptor1-postHandle");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

		// 请求处理完成所执行的方法

		System.out.println("interceptor1-afterHanle");

	}

	// 适配器模式：为了防止接口冲突
	// 适配器类主动实现了相关接口的方法
	// 在使用中，继承适配器类创建子类使用
	// 子类可以自己决定重写那些方法，而不是全都实现所有的接口方法

}