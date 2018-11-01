package com.codoteck.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.codoteck.web.entity.Student;
import com.codoteck.web.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String getIndex() {
		return "redirect:/fetchAll";
	}
	
	@GetMapping("/create")
	public String getCreateStudentPage(Model model) {
		model.addAttribute("student", new Student());
		return "create";
	}
	
	@PostMapping(value = "/create")
	public String createStudentPage(@ModelAttribute Student student) {
		System.out.println(student.toString());
		
		// save db
		studentService.save(student);
		
		return "redirect:/fetchAll";
	}
	
	@GetMapping("/fetchAll")
	public String fetchAll(Model model) {
		model.addAttribute("students", studentService.getAll());
		return "list_student";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable(name="id") Long id, Model model) {
		model.addAttribute("student", studentService.findStudentById(id));
		return "update";
	}
	
	@GetMapping("/delete/{id}")
	public String fetchAll(@PathVariable(name="id") Long id) {
		studentService.delete(id);
		
		return "redirect:/fetchAll";
	}

}
