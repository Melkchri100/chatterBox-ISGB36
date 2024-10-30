package labben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Users {

	private static List<User> userList = new ArrayList<>();

	public static void initializeUsers() {
		Scanner input = null;
		String file = "labben/users.csv";

		try {
			input = new Scanner(new File(file));

			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] toks = line.split(",");

				// Ensure that the line has the expected number of fields
				if (toks.length >= 2) {
					String username = toks[0].trim();
					String password = toks[1].trim();

					userList.add(new User(username, password));
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

	// Static method to validate user credentials
	public static boolean validateCredentials(String username, String password) {

		for (User user : userList) {
			if (username.equals(user.username) && password.equals(user.password)) {
				return true; // Return true if a match is found
			}
		}

		// If no match is found, return false
		return false;
	}
}
