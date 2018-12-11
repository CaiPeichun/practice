package demo;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Dept;
import service.DeptService;
import service.impl.DeptServiceImp;

public class TestDept {
//	@Test
//	public void testadd() throws IOException {
//		ClassPathXmlApplicationContext aContext = new ClassPathXmlApplicationContext("spring/spring.xml");
//		aContext.start();
//		System.out.println("服务已经启动");
//		DeptService service = new DeptServiceImp();
//		Dept dept = new Dept();
//		service.addDept(dept);
//		System.in.read();
//	}
	
	@Test
	public void test() {
		System.out.println("test");
	}
}
