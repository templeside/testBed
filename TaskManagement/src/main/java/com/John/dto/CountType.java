package com.John.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//todo, pending, done으로 구분.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountType {
	private Long count;
	private String type;

}
