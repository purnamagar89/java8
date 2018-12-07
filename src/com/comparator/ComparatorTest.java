package com.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import com.model.Student;

public class ComparatorTest {

	public static void main(String[] args) {

		List<Student> sList = Arrays.asList(
				new Student(29, "ram", "raimaji"),
				new Student(20, "purna", "magar"), 
				new Student(32, "hari", "paudel"),
				new Student(32, "hari", "magar")
		);
		
		Comparator<Student> cmp = Comparator.comparing(Student::getAge)
									.thenComparing(Student::getFirstName)
									.thenComparing(Student::getLastName);
		
		sList.sort(cmp);

		System.out.println(sList);
		System.out.println(sList);

	}

}
