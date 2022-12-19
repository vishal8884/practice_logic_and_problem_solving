package OtherPractice.objectTest;

public class Skills {

	private int id;
	private String name;
	private String rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	public Skills(int id, String name, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	
	public Skills() {
		
	}
}
