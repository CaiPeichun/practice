package demo;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import entity.Dept;

public class TestJson {
	@Test
	public void testJson() throws IOException {
		Dept dept = new Dept();
		dept.setDeptno(1);
		dept.setDname("≤‚ ‘");
		dept.setLoc("json");
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(dept);
		System.out.println(json);
		
		Dept dept2 = mapper.readValue(json, Dept.class);
		System.out.println(dept2);
	}
}
