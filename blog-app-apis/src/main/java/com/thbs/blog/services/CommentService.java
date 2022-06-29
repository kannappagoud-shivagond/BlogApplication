package com.thbs.blog.services;

import com.thbs.blog.payloads.CommentDto;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);

}
