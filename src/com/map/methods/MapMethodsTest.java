package com.map.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.City;
import com.model.Student;

public class MapMethodsTest {

	public static void main(String[] args) {
		
		
		
		
		
		Student s1 =new Student(29, "ram", "raimaji");
		Student s2 = new Student(20, "purna", "magar");
		Student s3 = new Student(32, "hari", "paudel");
		Student s4 = new Student(39, "madan", "roka");
		Student s5 = new Student(49, "shyam", "dhungel");
		Student s6 = new Student(80, "ramsaran", "mahat");
		
		City newYork = new City("New York");
		City dallas = new City("Dallas");
		City chicago = new City("Chicago");
		
		Map<City, List<Student>> map1 = new HashMap<>();
		
		map1.putIfAbsent(newYork, new ArrayList());
		map1.get(newYork).add(s1);
		
		map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(s2);
		map1.computeIfAbsent(dallas, city -> new ArrayList<>()).add(s3);
		map1.computeIfAbsent(dallas, city -> new ArrayList()).add(s4);
		
		
		System.out.println("Map1");
		map1.forEach((city,student) -> System.out.println(city+" "+student));
		
		Map<City, List<Student>> map2 = new HashMap<>();
		
		map2.computeIfAbsent(dallas, city -> new ArrayList<>()).add(s5);
		map2.computeIfAbsent(chicago, city -> new ArrayList<>()).add(s6);
		
		System.out.println("Map2");
		
		map2.forEach((city,student) -> System.out.println(city+" "+student));
		
		
		map2.forEach((city,student) -> {
			map1.merge(city, student, (studentsFromMap1,studentsFromMap2) ->
			{ 
				studentsFromMap1.addAll(studentsFromMap2);
				return studentsFromMap1;
			});
			
		});
		
		System.out.println("Merged Map");
		
		map1.forEach((city,student) -> System.out.println(city+ " "+student));
		
	}

}
