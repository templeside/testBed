package com.example.AOPDEmo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;

}
