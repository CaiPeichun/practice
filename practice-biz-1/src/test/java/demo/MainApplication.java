package demo;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring/spring.xml");
		ioc.start();
		System.out.println("服务已经启动。。。");
		System.in.read();//按任意键退出
	}
}
