package zd.test;

import zd.model.Posts;
import zd.service.PostsService;
import zd.service.impl.PostsServiceImpl;

public class Test4 {

	public static void main(String[] args) {
		PostsService postsService=new PostsServiceImpl();
		Posts posts=postsService.findPostsByOrdersId(3);
		System.out.println(posts);
	}

}
