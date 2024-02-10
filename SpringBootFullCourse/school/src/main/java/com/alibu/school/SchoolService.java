package com.alibu.school;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibu.school.client.StudentClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
	@Autowired
    private SchoolRepository repository;
	@Autowired
	private StudentClient studentClient;

    public void saveSchool(School school) {
//		System.out.println(school);
//		System.out.println(school.getId());
//		System.out.println(school.getName());
//		System.out.println(school.getEmail());
		repository.save(school);
    }

    public List<School> findAllSchools() {
        return repository.findAll();
    }
    
    //communicate with school and student
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId){
    	// find the school
    	var school = repository.findById(schoolId)
    			.orElse(
    					School.builder()
    						.name("NOT_FOUND")
    						.email("NOT_FOUND")
    						.build()
    					);
    	
    	// find all the students from the student micro-service
    	var students = studentClient.findAllStudentsBySchool(schoolId); 
    	return FullSchoolResponse.builder()
    			.name(school.getName())
    			.email(school.getEmail())
    			.students(students)
    			.build();
    }
}
