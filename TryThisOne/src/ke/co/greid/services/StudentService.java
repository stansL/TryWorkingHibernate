package ke.co.greid.services;

import java.util.List;

import ke.co.greid.dao.StudentDAO;
import ke.co.greid.entities.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentDAO controller;
	
	public List<Student> getStudents(){
		return controller.getStudentsV2();
		
	}

}
