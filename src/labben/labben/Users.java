package labben;

import java.util.ArrayList;
import java.util.List;

public class Users {
	public void createPost() {
	}

	public void deletePost() {
	}

	public void viewAllPost() {
	}

	public void viewOwnPost() {
	}

	public void interactWithPosts() {
	}

	// Static method to validate user credentials
	public static boolean validateCredentials(String username, String password) {
		
		List<User> userList = new ArrayList<>();
        userList.add(new User("jnash", "123"));
        userList.add(new User("akim", "789"));


		
        for (User user : userList) {
            if (username.equals(user.username) && password.equals(user.password)) {
                return true; // Return true if a match is found
            }
        }
        
        // If no match is found, return false
        return false;
    }
}


