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
 * ���ŷ���Ľӿ�ʵ����
 * @author caipch
 * @date 2018��12��12��
 */

@Transactional
@Service("deptService")
public class DeptServiceImp implements DeptService {

	//��hibernateTemplateע�����
	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	StatusJson deptjson = new StatusJson();
//	ObjectMapper mapper = new ObjectMapper();
	
	public StatusJson addDept(Dept dept) throws JsonProcessingException {
		hibernateTemplate.save(dept);
		deptjson.setStatus("200");
		deptjson.setValue("һ�����ż�¼���ӳɹ�");
//		String json = "hhhhh";
// 	mapper.writeValueAsString(deptjson);
		return deptjson;
	}

	public StatusJson deleteDept(Integer id) {
		Dept dept = hibernateTemplate.get(Dept.class,id);
		hibernateTemplate.delete(dept);
		deptjson.setStatus("200");
		deptjson.setValue("һ�����ż�¼ɾ���ɹ�");
		return deptjson;
	}

	public StatusJson updateDept(Integer id) {

		return null;
	}

	public StatusJson queryDept(Integer id) {
		Dept dept = hibernateTemplate.get(Dept.class, id);
		deptjson.setStatus("200");
		deptjson.setValue("��ѯ���ļ�¼Ϊ:"+dept.toString());
		return deptjson;
	}

	public StatusJson queryAll() {
		
		List<Dept> list = (List<Dept>) hibernateTemplate.find("from dept");
		deptjson.setStatus("200");
		deptjson.setValue(list.toString());
		return deptjson;
	}

}
