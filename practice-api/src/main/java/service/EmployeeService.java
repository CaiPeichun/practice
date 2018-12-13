package service;

import java.util.List;



import dto.EmployeeDTO;
import entity.Employee;
import entity.StatusJson;

/**
 * 员工表的服务
 * @author caipch
 * @date 2018年12月13日
 */
public interface EmployeeService {
	
	/**
	 * 增加一条员工记录
	 * @param employee
	 * @return
	 */
	public StatusJson addEmp(Employee employee);
	
	/**
	 * 根据员工id删除一条记录
	 * @param id
	 * @return
	 */
	public StatusJson deleteEmp(Integer id);
	
	/**
	 * 更新一条员工记录
	 * @param employee
	 * @return
	 */
	public StatusJson updateEmp(Employee employee);
	
	/**
	 * 根据员工id查出员工基本记录，并查出所在部门
	 * @param id
	 * @return
	 */
	public  EmployeeDTO queryEmp(Integer id);
	
	/**
	 * 查询员工的所有记录
	 * @return
	 */
	public List<EmployeeDTO> queryAll() ;
	
	
}
