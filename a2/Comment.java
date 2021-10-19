package a2;

public class Comment {
	private String comments;
	private String commented_by;
	private String comments_time;
	Comment(){}
	Comment(String com,String commentedby,String date){
		this.setComments(com);
		this.setCommented_by(commentedby);
		this.setComments_time(date);
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getCommented_by() {
		return commented_by;
	}
	public void setCommented_by(String commented_by) {
		this.commented_by = commented_by;
	}
	public String getComments_time() {
		return comments_time;
	}
	public void setComments_time(String comments_time) {
		this.comments_time = comments_time;
	}
}
  