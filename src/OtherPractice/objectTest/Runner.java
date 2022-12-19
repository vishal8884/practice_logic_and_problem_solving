package OtherPractice.objectTest;

import java.util.HashSet;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {

		Programmer programmer = new Programmer();
		
		Set<Skills> skills = new HashSet<>();
		skills.add(new Skills(1, "java", "7"));
		skills.add(new Skills(1, "sql", "4"));
		skills.add(new Skills(1, "springboot", "9"));
		
		
		programmer.setId(1);
		programmer.setSalary(1000);
		programmer.setSkills(skills);
		
		System.out.println("programmer before modification :: "+programmer);
		
		Set<Skills> skillsSet = programmer.getSkills();
		//skillsSet.forEach(s -> s.setName(s.getName()+"--"));
		for(Skills s : skillsSet) {
			s.setName(s.getName()+" yes ");
		}
		
		System.out.println("programmer after modification :: "+programmer);
	}

}
