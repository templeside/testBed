package com.John.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.John.model.Task;
import com.John.repositoreis.TaskRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TaskService {
	//repository가 JPA의 extension. JPA의 function을 가지고 있다.
	private TaskRepository taskRepository; 
	
	@Transactional(readOnly = true)
	public List<Task> getTasks(){
//		return taskRepository.findAll();
		return taskRepository.getAllTaskDueDateDesc();//커스텀 descending order
	}
	
	public Task save(Task task) {
		return taskRepository.saveAndFlush(task);
	}
	
	public boolean existById(Long id) {
		return taskRepository.existsById(id);
	}

	public Optional<Task> getTaskById(Long id) {
		return taskRepository.findById(id);
	}

	public void delete(Long id) {
		taskRepository.deleteById(id);
	}
}

