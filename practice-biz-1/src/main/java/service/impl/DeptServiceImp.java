package service.impl;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fasterxml.jackson.core.JsonProcessingException;
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


	public Dept queryDept(Integer id) {
		Dept dept = hibernateTemplate.get(Dept.class, id);
		
		return dept;
	}

	public List<Dept> queryAll() {
		
		String sql = "from Dept";
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Query query = session.createQuery(sql);
		return query.list();
	}

	@Override
	public StatusJson updateDept(Dept dept) {
		
		hibernateTemplate.update(dept);
		deptjson.setStatus("200");
		deptjson.setValue("一条记录更新成功");
		return deptjson;
	}

}
