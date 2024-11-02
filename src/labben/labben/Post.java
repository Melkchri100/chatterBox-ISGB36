package labben;

import java.io.*;
import java.util.Scanner;

public class Post {
	String username;
	String message;
	int postID;

	public Post(String username, String message, int postID) {
		this.username = username;
		this.message = message;
		this.postID = postID;
	}

	public static void createPost(String username, String message, int postID) {

		Posts.postList.add(new Post(username, message, postID));
		System.out.println("Post created with message: "+ message);

	}

	public static void deletePost(String yourUsername) {
		System.out.println("Choose which post to delete: ");
		Scanner scan = new Scanner(System.in);
		int postID = scan.nextInt();
		scan.nextLine();
		if (Posts.postList.get(postID - 1).username.equals(yourUsername)) {
			Posts.postList.remove(postID - 1);
		} else {
			System.out.println("You can't delete other users posts");
		}

		for (int i = 0; i < Posts.postList.size(); i++) {

			Posts.postList.get(i).postID = i + 1;
		}
	}
}
