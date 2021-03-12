package com.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Emp;

public class EmpDaoImpl implements EmpDao{
	private static Map<Integer, Emp> map = new HashMap<Integer, Emp>();
	public static Integer  count = 0;
	public EmpDaoImpl()
	{
		Emp emp1 = new Emp(++count,"Ram",2500.3,"Manager");
		Emp emp2 = new Emp(++count,"Laxman",2600.35,"Worker");
		Emp emp3 = new Emp(++count,"Bhrat",2510.3,"Chef");
		Emp emp4 = new Emp(++count,"Mridul",2800.3,"Employee");
		
		map.put(emp4.getId(), emp4);
		map.put(emp1.getId(), emp1);
		map.put(emp3.getId(), emp3);
		map.put(emp2.getId(), emp2);
		
		
	}

	@Override
	public Emp save(Emp p){
		// TODO Auto-generated method stub
		map.put(p.getId(), p);
		//String sql="insert into Emp99(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";    
	    return p;
	}

	@Override
	public Emp update(Emp p) {
		// TODO Auto-generated method stub
		map.replace(p.getId(), p);
        return p; 
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		map.remove(id);
	}

	@Override
	public Emp getEmpById(int id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

	@Override
	public List<Emp> getEmployees() {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Emp> emp = new ArrayList(map.values()); //(List<Emp>) map.values(); //
        return emp;
	}

}
