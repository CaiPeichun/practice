package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import dao.EmployeeDAO;
import dto.EmployeeDTO;
import entity.Dept;
import entity.Employee;
import entity.StatusJson;
import service.EmployeeService;

/**
 * 员工的服务实现
 * 
 * @author caipch
 * @date 2018年12月13日
 */
@Service("employeeService")
@Transactional
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired 
	private EmployeeDAO employeeDAO;
	StatusJson empJson = new StatusJson();

	@Override
	public StatusJson addEmp(Employee employee) {
		
			hibernateTemplate.save(employee);
			empJson.setStatus("200");
			empJson.setValue("一条员工记录插入成功");
		
		return empJson;
	}

	@Override
	public StatusJson deleteEmp(Integer id) {
		hibernateTemplate.delete(hibernateTemplate.get(Employee.class, id));
		empJson.setStatus("200");
		empJson.setValue(id + "号员工记录已删除");
		return empJson;
	}

	@Override
	public StatusJson updateEmp(Employee employee) {
		
			hibernateTemplate.update(employee);
			empJson.setStatus("200");
			empJson.setValue("一条员工记录已更新");
		return empJson;
	}

	@Override
	public EmployeeDTO queryEmp(Integer id) {
		/*
		 * String sql = "select * from emp " + "join " + "(select dname from dept " +
		 * "where deptno=(select deptno from emp where empno=7844))temp  " +
		 * "on emp.deptno=temp.deptno and emp.empno=7844";
		 */
		return employeeDAO.transform(hibernateTemplate.get(Employee.class, id));
		
	}

	@Override
	public List<EmployeeDTO> queryAll() {
		String sql = "from Employee";
		Session session = hibernateTemplate.getSessionFactory().openSession();
		List<Employee> list = session.createQuery(sql).list();
		List<EmployeeDTO> reslist = new ArrayList<>();
		for (Employee employee : list) {
			reslist.add(employeeDAO.transform(employee));
		}
		return reslist;
	}

}
