package com.crudopeartions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crudopeartions.dto.StudentDto;
import com.crudopeartions.entities.Student;
import com.crudopeartions.service.StudentService;
import com.crudopeartions.util.EmailService;

@Controller
public class StudentController {

	// http://localhost:8080/createStudentForm

	@Autowired
	private StudentService stdntser;

	@Autowired
	private EmailService emailService;

	@RequestMapping("/createStudentForm")
	public String createForm() {
		return "create_reg";
	}

//	@RequestMapping("/saveReg")
//	public String saveOneForm(Student student,Model model) {
//		stdntser.saveOneForm(student);
//		model.addAttribute("msg","record saved");
//		return "create_reg";
//	}

//	@RequestMapping("/saveReg")
//	public String saveOneForm(@RequestParam("firstName") String fname,@RequestParam("lastName") String lname,@RequestParam("email") String email,@RequestParam("mobile") long mobile,Model model) {
//	   Student s=new Student();
//	   s.setFirstName(fname);
//	   s.setLastName(lname);
//	   s.setEmail(email);
//	   s.setMobile(mobile);
//	   stdntser.saveOneForm(s);
//		model.addAttribute("msg","record saved");
//		return "create_reg";
//	}

//	@RequestMapping("/saveReg")
//	public String saveOneForm(@ModelAttribute ("St") Student student, Model model) {
//		stdntser.saveOneForm(student);
//		model.addAttribute("msg","record saved");
//		return "create_reg";
//	}

	@RequestMapping("/saveReg")
	public String saveOneForm(@ModelAttribute("St") StudentDto studentdto, Model model) {
		Student s = new Student();
		s.setId(studentdto.getId());
		s.setFirstName(studentdto.getFirstName());
		s.setLastName(studentdto.getLastName());
		s.setEmail(studentdto.getEmail());
		s.setMobile(studentdto.getMobile());
		stdntser.saveOneForm(s);
		emailService.sendEmail(s.getEmail(), "Email Service Test", "Email send through Marketingapp");
		model.addAttribute("msg", "Kudos!Your Record is Saved & Email Verification send");
		return "create_reg";

	}

	@RequestMapping("/listAll")
	public String getAllStudent(Model model) {
		List<Student> alllist = stdntser.getAllStudent();
		model.addAttribute("all", alllist);
		return "listall_reg";
	}

	@RequestMapping("/delete")
	public String deleteOneStudent(Long id, Model model) {
		stdntser.deleteOneStudent(id);
		List<Student> alllist = stdntser.getAllStudent();
		model.addAttribute("all", alllist);
		return "listall_reg";
	}

	@RequestMapping("/update")
	public String updateOneStudent(Long id, Model model) {
		Student id2 = stdntser.findStudentById(id);
		model.addAttribute("idd", id2);
		return "update_reg";
	}

	@RequestMapping("/saveUpdate")
	public String saveOneForm(Student student, Model model) {
		stdntser.saveOneForm(student);
		List<Student> alllist = stdntser.getAllStudent();
		model.addAttribute("all", alllist);
		return "listall_reg";
	}

}
