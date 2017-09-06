package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	//1.ʹ��@requestMappjing ע����ӳ�������url
	//2.����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ������InternalResourceViewResolver��ͼ�������������µĽ�����
	//ͨ��prefix+returnval+��׺ �����ķ�ʽ�õ�ʵ�ʵ�������ͼ��Ȼ����ת������
	// /WEB-INF/views/
	@RequestMapping("/helloword")
	public String hello() {
		System.out.println("Hello World!");
		return "success";
	}

}
