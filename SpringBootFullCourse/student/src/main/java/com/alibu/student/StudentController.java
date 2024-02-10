package com.alibu.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody Student student) {
		service.saveStudent(student);
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> findAllStudents(){
		return ResponseEntity.ok(service.findAllStudents());
	}
	
	//communication
	@GetMapping("/school/{school-id}")
	public ResponseEntity<List<Student>> findAllStudents(@PathVariable("school-id") Integer schoolId){
		return ResponseEntity.ok(service.findAllStudentsBySchoolId(schoolId));
	}
}