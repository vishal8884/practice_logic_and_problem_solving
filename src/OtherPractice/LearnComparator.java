package OtherPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnComparator {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,3,6,3,6,22,1,9,55,2,22,36);
		
		Collections.sort(list,(a,b) -> {
			return (a>b)?1:-1;
		});
		
		System.out.println("sorted list :: "+list);
	}
}
