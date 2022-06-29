package com.thbs.blog;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thbs.blog.entities.Post;
import com.thbs.blog.entities.User;
import com.thbs.blog.repositories.PostRepo;
import com.thbs.blog.repositories.UserRepo;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
@SpringBootTest
class BlogAppApisApplicationTests {

	
	@Autowired
	private UserRepo userRepo;
	

	@Autowired
	private PostRepo postRepo
;

	@Test
	void contextLoads() {

	}

	@Test
	public void repoTest()
	{
	
//		
//		User user =new User();
//		user.setId(2);
////		
//		List<Post> findByUser = this.postRepo.findByTitleContaining("what");
//		List<Post> findByUser1 = this.postRepo.findByTitleContaining("java");
//		System.out.println(findByUser);
//		System.out.println(findByUser1);
////		
	}
	

}
