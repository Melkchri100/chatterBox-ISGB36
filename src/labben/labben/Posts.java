package labben;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Posts {
	public static List<Post> postList = new ArrayList<>();

	public static void initializePosts() {
		Scanner input = null;
		String file = "labben/labben/posts.csv";
		
		//postList.add(new Post("jnash", "Hello World!", 1));
		//postList.add(new Post("akim", "Hello bro", 2));
		//postList.add(new Post("jnash", "How do you like your cheese?", 3));
		//postList.add(new Post("akim", "Drippy bruh", 4));
		//postList.add(new Post("jnash", "Nice pookie bear ❤", 5));

		try {
			input = new Scanner(new File(file));

			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] toks = line.split(",");

				// Ensure that the line has the expected number of fields
				if (toks.length >= 3) {
					String username = toks[0].trim();
					String message = toks[1].trim();
					int postID = Integer.parseInt(toks[2].trim());

					postList.add(new Post(username, message, postID));
				} else {
					System.out.println("Skipping malformed line: " + line);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file);
		} catch (NumberFormatException e) {
			System.out.println("Invalid post ID: " + e.getMessage());
		}
	}

	public void linkUser() {

	}

	public void savePost() {

	}

	public static void viewAllPosts() {
		System.out.println("Viewing all posts:\n");
		for (Post post : postList) {
			System.out.println(post.postID + ": " + post.username + ": " + post.message);
		}
	}

	public static void viewOwnPost(String username) {
		System.out.println("Viewing all your posts:\n");
		for (Post post : postList) {
			if (post.username.equals(username)) {
				System.out.println(post.postID + ": " + post.username + ": " + post.message);
			}

		}
	}
}
