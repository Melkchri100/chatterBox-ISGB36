package labben;
import java.io.*;

public class Post {
	String username;
	String message;
	int postID;

	public Post(String username, String message, int postID) {
		this.username = username;
		this.message = message;
		this.postID = postID;
	}
	public static void  createPost(String username, String message, int postID) {
		PrintWriter writer = null;
		
		Posts.postList.add(new Post(username, message, postID));
		
		try {
			writer = new PrintWriter(new FileWriter("labben/labben/posts.csv", true));
			writer.println(username + ", " + message + ", " + postID);
			System.out.println("File written!");
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + "labben/labben/posts.csv");
		} catch(IOException e){
			e.printStackTrace();
		
		
	}
	}
	}
