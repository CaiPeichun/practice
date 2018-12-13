package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.EmployeeDTO;
import entity.Dept;
import entity.Employee;
import entity.StatusJson;
import service.DeptService;
import service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired DeptService deptService;
	private Employee employee;
	private  Dept dept;
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public StatusJson deleteEmp(@PathVariable Integer id) {
		return employeeService.deleteEmp(id);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	public EmployeeDTO queryEmp(@PathVariable Integer id) throws Exception{
		return employeeService.queryEmp(id);
	}
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	@ResponseBody
	public List<EmployeeDTO> queryAll() {
		return employeeService.queryAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public StatusJson addEmp(@RequestParam Map<String, Object> map,@RequestParam Integer deptno) {
		Employee employee = new Employee();
		employee.setEname(map.get("ename").toString());
		employee.setJob(map.get("job").toString());
		
		employee.setDept(deptService.queryDept(deptno));
		return employeeService.addEmp(employee);
		
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public StatusJson updateEmp(@PathVariable Integer id,@RequestParam Map<String, Object> map,@RequestParam Integer deptno) {
		employee = employeeService.queryEmp(id);
		employee.setEname(map.get("ename").toString());
		employee.setJob(map.get("job").toString());
		dept = deptService.queryDept(deptno);
		employee.setDept(dept);
		return employeeService.updateEmp(employee);
	}
}
