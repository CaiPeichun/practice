package service;

import java.util.List;



import dto.EmployeeDTO;
import entity.Employee;
import entity.StatusJson;

/**
 * Ա����ķ���
 * @author caipch
 * @date 2018��12��13��
 */
public interface EmployeeService {
	
	/**
	 * ����һ��Ա����¼
	 * @param employee
	 * @return
	 */
	public StatusJson addEmp(Employee employee);
	
	/**
	 * ����Ա��idɾ��һ����¼
	 * @param id
	 * @return
	 */
	public StatusJson deleteEmp(Integer id);
	
	/**
	 * ����һ��Ա����¼
	 * @param employee
	 * @return
	 */
	public StatusJson updateEmp(Employee employee);
	
	/**
	 * ����Ա��id���Ա��������¼����������ڲ���
	 * @param id
	 * @return
	 */
	public  EmployeeDTO queryEmp(Integer id);
	
	/**
	 * ��ѯԱ�������м�¼
	 * @return
	 */
	public List<EmployeeDTO> queryAll() ;
	
	
}
