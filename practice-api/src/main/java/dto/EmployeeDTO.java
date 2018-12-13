package dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import entity.Dept;
import entity.Employee;



/**
 * Ա����Ϣ���е�Ա�����������š�ְλ�����ڲ�������
 * @author caipch
 * @date 2018��12��13��
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
