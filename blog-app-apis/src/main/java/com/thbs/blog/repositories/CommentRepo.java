package com.thbs.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thbs.blog.entities.Comment;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
