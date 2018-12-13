package dao;

import org.springframework.stereotype.Service;

import dto.EmployeeDTO;
import entity.Dept;
import entity.Employee;
@Service("employeeDao")
public class EmployeeDAO {

	/**
	 * 将一个employee对象转为employeedto对象
	 */
	public EmployeeDTO transform(Employee employee) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpno(employee.getEmpno());
		employeeDTO.setEname(employee.getEname());
		employeeDTO.setJob(employee.getJob());
		Dept dept = employee.getDept();
		if(dept!=null) {
			employeeDTO.setDept(employee.getDept());
			employeeDTO.setDeptName(employee.getDept().getDname());
		}
		else {
			employeeDTO.setDept(null);
			employeeDTO.setDeptName(null);
		}
		return employeeDTO;
	}
}
