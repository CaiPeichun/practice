package service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import entity.Dept;
import entity.StatusJson;

/**
 * �Բ��ű��
 * @author Administrator
 *
 */
public interface DeptService {
	//���ܣ����Ӳ��ű��һ����¼
	public String addDept(Dept dept) throws JsonProcessingException;
	
	//����idɾ�����ű��һ����¼
	public StatusJson deleteDept(Integer id);
	
	//���²��ű��е�ĳһ����¼
	public StatusJson updateDept(Integer id);
	
	//��ѯ��Ӧid��ĳһ����¼
	public Dept queryDept(Integer id);
	
	//��ѯ���в���
	public List<Dept> queryAll();
}
