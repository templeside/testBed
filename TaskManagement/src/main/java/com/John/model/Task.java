package com.John.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private Long id;
	private String title;
	private String type;
	private Date dueDate;
	private String description;
}
