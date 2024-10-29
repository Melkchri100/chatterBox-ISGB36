package labben;

import java.util.Scanner;

public class User {
	String username;
	String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public static void userChoices(String username, String password) {
		System.out.println("Welcome user\nPress 1 to view all messages\nPress 2 to view your messages\n"
				+ "Press 3 to create Post\nPress anything else to quit");
		Scanner scan = new Scanner(System.in);
		try {
			int choice = scan.nextInt();
			scan.nextLine();
			if (choice == 1) {
				Posts.viewAllPosts();
				User.userChoices(username, password);
			} else if (choice == 2) {
				Posts.viewOwnPost(username);
				User.userChoices(username, password);
			} else if (choice == 3) {
				CreatePostIF.enterMessage(username);
				User.userChoices(username, password);
				
			} else {
				System.out.println("Quitting application. Goodbye!");
				System.exit(0);
			}

		} catch (Exception e) {
			// If input is not an integer
			System.out.println("Quitting application. Goodbye!");
			System.exit(0);
		}

	}

}
