package com.thbs.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
@Entity
@Data
public class Role {

	@Id	
	private int id;
	
	private String name;
	
}
