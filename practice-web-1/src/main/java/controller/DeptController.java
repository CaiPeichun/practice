package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import entity.Dept;
import entity.StatusJson;
import service.DeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	public DeptService deptService;
	
	/**
	 * url:/dept?name=${name}&loc=${loc}
	 * @param map(这里采用map接受url中的多个参数)
	 * @return
	 * @throws JsonProcessingException
	 */
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public StatusJson addDept(@RequestParam Map<String,Object> map ) throws JsonProcessingException {
		Dept dept = new Dept();
		dept.setDname(map.get("name").toString());
		dept.setLoc(map.get("loc").toString());
//		System.out.println(deptService.addDept(dept));
		return deptService.addDept(dept);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	@ResponseBody
	public StatusJson deleteDept(@RequestParam Integer id) {
		
		return deptService.deleteDept(id);
		
	}
	
	/**
	 * url:/dept/{id}
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Dept getDept(@PathVariable Integer id) {
		
		return deptService.queryDept(id);
		
	}
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	@ResponseBody
	public List<Dept> getAll() {
		return deptService.queryAll();
	}
	
	/**
	 * url:/dept?{id}&name=${name}&loc=&{loc}
	 * @param id
	 * @param name
	 * @param loc
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public StatusJson updateDept(@PathVariable Integer id,@RequestParam Map<String, String> map ) {
		Dept dept = new Dept();
		dept.setDeptno(id);
		dept.setDname(map.get("name"));
		dept.setLoc(map.get("loc"));
		return deptService.updateDept(dept);
		
	}
}

