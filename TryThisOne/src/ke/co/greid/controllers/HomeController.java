package ke.co.greid.controllers;

import java.util.List;

import ke.co.greid.dao.StudentDAO;
import ke.co.greid.entities.Student;
import ke.co.greid.services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	public String getHome(Model model) {
		List<Student> list=studentService.getStudents();
		model.addAttribute("students", list);
		return "home";
	}

}
