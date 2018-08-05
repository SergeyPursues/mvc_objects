package com.luv2code.springdemo.mvc.table;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		
		Student theStudent1 = new Student("Sergey", "Ishengaliev", "Deutschland", "Musik", "Java", 5);
		Student theStudent2 = new Student("Janita", "Paul", "Deutschland", "Musik", "C#", 3);
		Student theStudent3 = new Student("Patrick", "Metzger", "Deutschland", "Musik", "VBA", 5);
		Student theStudent4 = new Student("Steffen", "Koch", "Deutschland", "Musik", "", 7);
		Student theStudent5 = new Student("Philipp", "Roll", "Deutschland", "Musik", "", 23);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(theStudent1);
		studentList.add(theStudent2);
		studentList.add(theStudent3);
		studentList.add(theStudent4);
		studentList.add(theStudent5);
		
		// add student object to the model
		theModel.addAttribute("studentList", studentList);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName());
		
		return "student-confirmation";
	}
	
}