package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.vo.Emp;

@Service
public class A20_EmpService {
	@Autowired
	private A30_EmpDao dao;
	
	public ArrayList<Emp> getEmpList(Emp sch){
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		return dao.getEmpList(sch);
	}
}
