package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements EmpService{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveEmp(Employee e) {
		System.out.println("service class");
		hr.save(e);
	}

}
