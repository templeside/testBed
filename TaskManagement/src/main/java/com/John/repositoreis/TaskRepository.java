package com.John.repositoreis;

import com.John.dto.CountType;
import com.John.model.Task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//Jpa 쿼리도 가져다 주고받고, custom은 더 추가하면 된다.
public interface TaskRepository extends JpaRepository<Task, Long>{
	@Query(value="Select * from task order by due_date desc",nativeQuery = true)
	public List<Task> getAllTaskDueDateDesc();
	
	//같은 뜻.
	// SELECT (COUNT(*)/(SELECT COUNT(*) FROM task) * 100), type FROM task GROUP BY type
	@Query(value="Select new com.John.dto.CountType(COUNT(*)/(Select COUNT(*) from Task) *100,type) from Task GROUP BY type")
	public List<CountType> getPercentageGroupByType();
}
