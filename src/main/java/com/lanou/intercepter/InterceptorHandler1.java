
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

		// ����������ʱ��δ��ʼ�������Ѿ�ִ���������
		// true ����ͨ��
		// false����ͨ��

		System.out.println("interceptor1-------------------prehandler");

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

		// ��������֮��ִ���������

		System.out.println("interceptor1-postHandle");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

		// �����������ִ�еķ���

		System.out.println("interceptor1-afterHanle");

	}

	// ������ģʽ��Ϊ�˷�ֹ�ӿڳ�ͻ
	// ������������ʵ������ؽӿڵķ���
	// ��ʹ���У��̳��������ഴ������ʹ��
	// ��������Լ�������д��Щ������������ȫ��ʵ�����еĽӿڷ���

}