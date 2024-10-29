package labben;

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
		Posts.postList.add(new Post(username, message, postID));
		
		
	}
}
