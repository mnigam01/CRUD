package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.EmpDaoImpl;
import com.example.entity.Emp;

@Controller
public class EmpController {
	static Integer  count = 0;
	EmpDaoImpl zyx = new EmpDaoImpl();
	
	@RequestMapping(value = "/viewemp", method = RequestMethod.GET)
    public ModelAndView viewAllempl() {
		List<Emp> list = zyx.getEmployees();
		ModelAndView mv = new ModelAndView("viewemp");
		mv.addObject("list",list); 
        return mv;
    }
 
    @RequestMapping(value = "/empform", method = { RequestMethod.GET,RequestMethod.PUT})
    public ModelAndView showform() {
    	System.out.println(EmpDaoImpl.count);
    	ModelAndView mv = new ModelAndView("empform");
    	return mv;
    }
    
    @RequestMapping(value="/save")    
    public ModelAndView save(@ModelAttribute("emp") Emp emp){
    	emp.setId(++EmpDaoImpl.count);
    	System.out.println(emp);
    	zyx.save(emp); 
    	
    	ModelAndView mv = new ModelAndView("redirect:/viewemp");
        return mv;//will redirect to viewemp request mapping    
    }    
    
    @RequestMapping(value="/editemp/{id}", method = { RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})    
    public ModelAndView edit(@PathVariable int id){   
    	ModelAndView mv = new ModelAndView("empeditform");
    	Emp e=zyx.getEmpById(id);  
    	//System.out.println(e);
        mv.addObject("u",e);  
        return mv;    
    }   
 
    @RequestMapping(value = "/editsave", method = { RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
    public ModelAndView update(@ModelAttribute("emp") Emp emp) {
    	ModelAndView mv = new ModelAndView("redirect:/viewemp");
//    	Emp e=zyx.update(emp);  
//    	mv.addObject("u",e);
    	System.out.println(emp);
    	zyx.update(emp);
        return mv;
 
    }
 
    @RequestMapping(value = "/deleteemp/{id}", method = { RequestMethod.GET, RequestMethod.DELETE })
    public ModelAndView delete(@PathVariable("id") int id) {
    	zyx.delete(id);
    	ModelAndView mv = new ModelAndView("redirect:/viewemp");
    	return mv;
 
    } 
    
    @ModelAttribute("emp")
	public Emp populateUser(){
		Emp emp = new Emp();
		
		return emp;
	}
	

}
