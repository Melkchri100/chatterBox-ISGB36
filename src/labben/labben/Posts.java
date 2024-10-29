package labben;

import java.util.ArrayList;
import java.util.List;

public class Posts {
	public static List<Post> postList = new ArrayList<>();

	public static void initializePosts() {

		postList.add(new Post("jnash", "Hello World!", 1));
		postList.add(new Post("akim", "Hello bro", 2));
		postList.add(new Post("jnash", "How do you like your cheese?", 3));
		postList.add(new Post("akim", "Drippy bruh", 4));
		postList.add(new Post("jnash", "Nice pookie bear ❤", 5));

	}

	public void linkUser() {

	}

	public void savePost() {

	}

	public static void viewAllPosts() {
		System.out.println("Viewing all posts:\n");
		 for (Post post : postList) {
	           System.out.println(post.postID + ": "+post.username + ": " + post.message);
		 }
	}

	public static void viewOwnPost(String username) {
		System.out.println("Viewing all your posts:\n");
		 for (Post post : postList) {
			 if(post.username.equals(username)) {
				 System.out.println(post.postID + ": "+post.username + ": " + post.message);
			 }
	           
	}
	}
}
	


	

