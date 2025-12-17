package com.demo.SpringBootMVCEmployeeCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringBootMVCEmployeeCrud.beans.Employee;
import com.demo.SpringBootMVCEmployeeCrud.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService eservice;
	
	@GetMapping("/emp")
	public ModelAndView getAllEmployees() {
		List<Employee> elist = eservice.findAllEmployee();
		return new ModelAndView("showemployee","elist",elist);
	}
	
	@GetMapping("/add")
	public String showAddForm(Model m) {
		m.addAttribute("employee",new Employee());
		return "insertproduct";
	}
	
	@PostMapping("/insertproduct")
	public ModelAndView insertEmployee(@ModelAttribute Employee employee) {
		eservice.addEmployee(employee);
		return new ModelAndView("redirect:/employee/emp");
	}
	
	@GetMapping("/editemployee/{eid}")
	public ModelAndView editEmployee(@PathVariable int eid) {
		Employee e = eservice.findByID(eid);
		if(e != null) {
			return new ModelAndView("editemployee","emp",e);
		}else {
			return new ModelAndView("redirect:/employee/emp");
		}
	}
	
	@PostMapping("/updateemployee")
	public ModelAndView updateEmployee(@ModelAttribute Employee emp) {
		eservice.updateEmployee(emp);
		return new ModelAndView("redirect:/employee/emp");
	}

	@GetMapping("/deleteemployee/{eid}")
	public ModelAndView deleteProduct(@PathVariable int eid) {
		eservice.deleteemployee(eid);
		return new ModelAndView("redirect:/employee/emp");
	}
}
