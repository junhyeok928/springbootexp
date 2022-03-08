package com.example.demo;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.Emp;

// com.example.demo.A30_EmpDao
@Mapper
public interface A30_EmpDao {
	public ArrayList<Emp> getEmpList(Emp sch);
}
