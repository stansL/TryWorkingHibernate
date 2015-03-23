package ke.co.greid.tests;

import java.util.List;

import ke.co.greid.entities.Student;
import ke.co.greid.models2.StudentHome;

public class ThisThat {

	public static void main(String[] args) {
		Student students=new StudentHome().findById(2);
		System.out.println(students);

	}

}
