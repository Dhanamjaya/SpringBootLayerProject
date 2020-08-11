package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Synchrony {

	@Id
	private Integer syfId;
	
	private String syfLoc;
}
