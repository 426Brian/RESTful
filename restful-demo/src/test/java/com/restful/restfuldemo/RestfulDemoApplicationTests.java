package com.restful.restfuldemo;

import com.restful.restfuldemo.entity.Emp;
import com.restful.restfuldemo.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestfulDemoApplicationTests {


//	@Test
	public void contextLoads() {
	}

	@Autowired
	EmpService empService;

	@Test
	public void teetGestAll(){
		List<Emp> allEmp = empService.getAllEmp();
		System.out.println("allEmp == "+Arrays.asList(allEmp));
	}

}

