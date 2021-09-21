package com.hcl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Pet;
import com.hcl.service.PetService;



@Controller
public class PetController {

	@Autowired
	PetService petService;
	
	@RequestMapping("/")
	public ModelAndView display(){
		
		return new ModelAndView("index1");
	}

	@RequestMapping("/petDetail")
	public ModelAndView petDetail(@ModelAttribute("pet") Pet pet){
		
		return new ModelAndView("pet_form");
	}
	@RequestMapping("/addPet")
	public ModelAndView savePet(@ModelAttribute("pet") Pet pet){
		
		petService.savePet(pet);
		return new ModelAndView("pet_form");
	}
	@RequestMapping("/pets")
	public ModelAndView petHome(@ModelAttribute("pet") Pet pet){
		
		List<Pet> listOfPets = petService.getAllPets();
		return new ModelAndView("pet_home","ListOfPets",listOfPets);
	}
	/*@RequestMapping("/buyPet")
	public ModelAndView buyPet(@ModelAttribute("pet") Pet pet, HttpServletRequest request){
	
		int id = Integer.parseInt(request.getParameter("id"));
		petService.buyPet(id);
		return new ModelAndView("redirect:/pets");
		
		
	}*/
}	
	/*//insert
	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployee( @Valid @ModelAttribute("employee") Employee employee, BindingResult br){
		
		if(br.hasErrors()) {
			return new ModelAndView("AddEmployee");
		}
		else{
			employeeService.saveEmployee(employee);
			return new ModelAndView("redirect:/viewEmployee");
		}
		
	}
	
	//read
	@RequestMapping("/viewEmployee")
	public ModelAndView getAllEmployee(@ModelAttribute("employee") Employee employee){
		
		List<Employee> list = employeeService.getAllEmployee();
		return new ModelAndView("Success","listOfEmployees",list);
	}
	
	//delete
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(HttpServletRequest request){
		
		int id = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployeeById(id);
		return new ModelAndView("redirect:/viewEmployee");
	}
	
	//update
		@RequestMapping("/editEmployee")
		public ModelAndView editEmployee(HttpServletRequest request,@ModelAttribute("employee") Employee employee){
			
			//int id = Integer.parseInt(request.getParameter("id"));
				return new ModelAndView("EditEmployee");
			
		}
}*/
