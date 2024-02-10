package com.alibu.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@Validated
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {
	@Autowired
	private SchoolService service;
	
	@GetMapping("/hello")
	public static String hellofunction(){
		return "hi";
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody School school) {
//		System.out.println(school);
//		System.out.println(school.getId());
//		System.out.println(school.getName());
//		System.out.println(school.getEmail());
		service.saveSchool(school);
	}
	
	@GetMapping
	public ResponseEntity<List<School>> findAllSchools(){
		return ResponseEntity.ok(service.findAllSchools());
	}
	
	//feign client
	@GetMapping("/with-students/{school-id}")
	public ResponseEntity<FullSchoolResponse> findAllSchools(@PathVariable("school-id") Integer schoolId){
		return ResponseEntity.ok(service.findSchoolsWithStudents(schoolId));
	}
}
