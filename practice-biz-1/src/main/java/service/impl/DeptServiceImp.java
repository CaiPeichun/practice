package service.impl;


import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import entity.Dept;
import entity.StatusJson;
import service.DeptService;
import utils.OracleUtils;

@Service("deptService")
public class DeptServiceImp implements DeptService{
	
//	@Autowired
//	@Qualifier("hibernateTemplate")
//	private HibernateTemplate hibernateTemplate;
	OracleUtils utils = new OracleUtils();
	Session session = utils.getSession();
	Transaction tx = session.beginTransaction();
	ObjectMapper mapper = new ObjectMapper();
	StatusJson deptjson = new StatusJson();
	public String addDept(Dept dept) throws JsonProcessingException {
		
//		dept.setDname("sss");
//		dept.setLoc("ssss");
//		System.out.println(dept);
		session.save(dept);
		tx.commit();
		deptjson.setValue("一条部门记录增加成功");
//		System.out.println("增加成功");
		String json = mapper.writeValueAsString(deptjson);
		return json;
	}

	public StatusJson deleteDept(Integer id) {
		
		return null;
	}

	public StatusJson updateDept(Integer id) {
		
		return null;
	}

	public Dept queryDept(Integer id) {
		
		return null;
	}

	public List<Dept> queryAll() {
		
		return null;
	}

}
