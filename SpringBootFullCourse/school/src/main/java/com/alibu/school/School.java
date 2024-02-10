package com.alibu.school;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class School {
	@Id
    @GeneratedValue	// 이거 해야 primary id 들어감.
    private Integer id;
	private String name;
	private String email;
	
	
	
	public Integer getId() {
		return id;
	}
	public School setId(Integer id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public School setName(String name) {
		this.name = name;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public School setEmail(String email) {
		this.email = email;
		return this;
	}
	
	@Override public String toString() {
		return "id = "+ this.id +" , name = "+ this.name + " , email = "+this.email;
	}
}
