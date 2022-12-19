package OtherPractice.objectTest;

import java.util.Set;

public class Programmer {

	private int id;
	private int salary;
	
	private Set<Skills> skills;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Skills> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skills> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Programmer [id=" + id + ", salary=" + salary + ", skills=" + skills + "]";
	}
	
	
	
	
}
