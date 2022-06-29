package com.thbs.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.thbs.blog.entities.Category;
import com.thbs.blog.entities.Comment;
import com.thbs.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	private Integer postId;
	
	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addedDate;	
	
	private CategoryDto category;

	private UserDto user;
	
	private Set<CommentDto> comments=new HashSet<>();

	
	
	
	
	
	
}
