package service.impl;

import java.io.IOException;
import java.util.List;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import entity.Dept;
import entity.StatusJson;
import service.DeptService;
/**
 * 部门服务的接口实现类
 * @author caipch
 * @date 2018年12月12日
 */

@Transactional
@Service("deptService")
public class DeptServiceImp implements DeptService {

	//将hibernateTemplate注入进来
	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	StatusJson deptjson = new StatusJson();
//	ObjectMapper mapper = new ObjectMapper();
	
	public StatusJson addDept(Dept dept) throws JsonProcessingException {
		hibernateTemplate.save(dept);
		deptjson.setStatus("200");
		deptjson.setValue("一条部门记录增加成功");
//		String json = "hhhhh";
// 	mapper.writeValueAsString(deptjson);
		return deptjson;
	}

	public StatusJson deleteDept(Integer id) {
		Dept dept = hibernateTemplate.get(Dept.class,id);
		hibernateTemplate.delete(dept);
		deptjson.setStatus("200");
		deptjson.setValue("一条部门记录删除成功");
		return deptjson;
	}

	public StatusJson updateDept(Integer id) {

		return null;
	}

	public StatusJson queryDept(Integer id) {
		Dept dept = hibernateTemplate.get(Dept.class, id);
		deptjson.setStatus("200");
		deptjson.setValue("查询到的记录为:"+dept.toString());
		return deptjson;
	}

	public StatusJson queryAll() {
		
		List<Dept> list = (List<Dept>) hibernateTemplate.find("from dept");
		deptjson.setStatus("200");
		deptjson.setValue(list.toString());
		return deptjson;
	}

}
