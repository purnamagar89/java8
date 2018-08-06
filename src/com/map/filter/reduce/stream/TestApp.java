package com.map.filter.reduce.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.model.Student;

public class TestApp {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>(Arrays.asList(new Student(29, "ram", "raimaji"),
				new Student(20, "purna", "magar"), new Student(32, "hari", "paudel"), new Student(32, "hari", "magar"),
				new Student(80, "ramsaran", "mahat"), new Student(49, "shyam", "dhungel")));

		students.stream().map(Student::getAge).filter(age -> age > 20).forEach(System.out::println);
		System.out.println();
		students.stream().skip(2).map(Student::getAge).filter(age -> age>20).forEach(System.out::println);
		
		Integer ff= students.stream().map(Student::getAge).findFirst().orElse(null);
		System.out.println(ff);

	}

}
