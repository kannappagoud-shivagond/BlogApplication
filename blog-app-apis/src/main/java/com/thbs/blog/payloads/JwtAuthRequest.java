package com.thbs.blog.payloads;

import lombok.Data;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
@Data
public class JwtAuthRequest {

	private String username;
	
	private String password;
	
}
