

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Dept;
import service.DeptService;
import service.InittestService;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo/dubbo-consumer.xml");
//		OrderService orderService = applicationContext.getBean(OrderService.class);
//		InittestService inittestService = applicationContext.getBean(InittestService.class);
//		System.out.println(inittestService.test());
		Dept dept = new Dept();
		dept.setDname("a");
		dept.setLoc("a");
		DeptService deptService = applicationContext.getBean(DeptService.class);
		deptService.addDept(dept);
		System.out.println("�����ߵ��ý���");
		System.in.read();
	}
}
