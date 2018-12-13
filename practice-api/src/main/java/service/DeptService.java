package service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import entity.Dept;
import entity.StatusJson;

/**
 * 部门表的服务接口定义
 * @author caipch
 * @date 2018年12月12日
 */
public interface DeptService {
	
	/**
	 * 功能：增加部门表的一条记录
	 * @param dept
	 * @return
	 * @throws JsonProcessingException
	 */
	public StatusJson addDept(Dept dept) throws JsonProcessingException;
	
	/**
	 * 根据id删除部门表的一条记录
	 * @param id
	 * @return
	 */
	public StatusJson deleteDept(Integer id);
	
	/**
	 * 更新部门表中的某一条记录
	 * @param id
	 * @return
	 */
	public StatusJson updateDept(Dept dept);
	
	/**
	 * 查询对应id的某一条记录
	 * @param id
	 * @return
	 */
	public Dept queryDept(Integer id);
	
	/**
	 * 查询所有部门
	 * @return
	 */
	public List<Dept> queryAll();
}
