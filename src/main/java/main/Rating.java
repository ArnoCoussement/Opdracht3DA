package main;

public class Rating {
	
	private int zipcode;
	private int stars;
	private String comment;
	
	public Rating(){
		
	}
	
	
	public Rating(int zipcode, int stars, String comment){
		setComment(comment);
		setStars(stars);
		setZipcode(zipcode);
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public int getStars() {
		return stars;
	}


	public void setStars(int stars) {
		this.stars = stars;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	public String toString(){
		return "stars out of 5 : "+this.stars+", description : "+this.comment;
	}

}
