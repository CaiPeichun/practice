package service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import entity.Dept;
import entity.StatusJson;

/**
 * 对部门表的
 * @author Administrator
 *
 */
public interface DeptService {
	//功能：增加部门表的一条记录
	public String addDept(Dept dept) throws JsonProcessingException;
	
	//根据id删除部门表的一条记录
	public StatusJson deleteDept(Integer id);
	
	//更新部门表中的某一条记录
	public StatusJson updateDept(Integer id);
	
	//查询对应id的某一条记录
	public Dept queryDept(Integer id);
	
	//查询所有部门
	public List<Dept> queryAll();
}
