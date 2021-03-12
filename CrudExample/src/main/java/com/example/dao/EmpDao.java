package com.example.dao;

import java.util.List;

import com.example.entity.Emp;

public interface EmpDao {
	
	public Emp save(Emp p);
	public Emp update(Emp p);
	public void delete(int id);
	public Emp getEmpById(int id);
	public List<Emp> getEmployees();
	

}
