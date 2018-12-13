package service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import entity.Dept;
import entity.StatusJson;

/**
 * ���ű�ķ���ӿڶ���
 * @author caipch
 * @date 2018��12��12��
 */
public interface DeptService {
	
	/**
	 * ���ܣ����Ӳ��ű��һ����¼
	 * @param dept
	 * @return
	 * @throws JsonProcessingException
	 */
	public StatusJson addDept(Dept dept) throws JsonProcessingException;
	
	/**
	 * ����idɾ�����ű��һ����¼
	 * @param id
	 * @return
	 */
	public StatusJson deleteDept(Integer id);
	
	/**
	 * ���²��ű��е�ĳһ����¼
	 * @param id
	 * @return
	 */
	public StatusJson updateDept(Dept dept);
	
	/**
	 * ��ѯ��Ӧid��ĳһ����¼
	 * @param id
	 * @return
	 */
	public Dept queryDept(Integer id);
	
	/**
	 * ��ѯ���в���
	 * @return
	 */
	public List<Dept> queryAll();
}
