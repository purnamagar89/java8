package com.List.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.model.Student;

public class ListMethodsTest {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>(
				Arrays.asList(new Student(29, "ram", "raimaji"), new Student(20, "purna", "magar"),
						new Student(32, "hari", "paudel"), new Student(32, "hari", "magar")));

		students.removeIf(student -> student.getAge() > 40);
		students.replaceAll(student -> new Student(student.getAge(), student.getFirstName().toUpperCase(),
				student.getLastName().toUpperCase()));
		students.sort(Comparator.comparing(Student::getAge));
		students.forEach(System.out::println);
		System.out.println("lets test teamcity build");
	}

}
