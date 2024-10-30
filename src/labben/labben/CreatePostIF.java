package labben;

import java.util.Scanner;

public class CreatePostIF {
	public static void enterMessage(String username) {
		System.out.println("Write your message: ");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		int postListLength = Posts.postList.size();
		Post.createPost(username, userInput, postListLength + 1);
	}

}
