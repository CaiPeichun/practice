package dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import entity.Dept;
import entity.Employee;



/**
 * 员工信息表中的员工姓名、工号、职位、所在部门名称
 * @author caipch
 * @date 2018年12月13日
 */
public class EmployeeDTO extends Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Dept dept;

	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
