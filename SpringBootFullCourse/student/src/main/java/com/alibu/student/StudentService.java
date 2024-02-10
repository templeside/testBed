//package com.alibu.student;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import lombok.RequiredArgsConstructor;
//
//@Service
//@RequiredArgsConstructor
//public class StudentService {
//	private final StudentRepository repository;
//	
//	public void saveStudent(Student student) {
//		repository.save(student);
//	}
//	
//	public List<Student> findAllStudents(){
//		return repository.findAll()
//	}
//}

package com.alibu.student;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

//    private final StudentRepository repository;
	@Autowired
    private StudentRepository repository;

    public void saveStudent(Student student) {
        repository.save(student);
    }

    public List<Student> findAllStudents() {
        return repository.findAll();
    }
    
    public List<Student> findAllStudentsBySchoolId(Integer schoolId){
    	return repository.findAllBySchoolId(schoolId);
    }
}
