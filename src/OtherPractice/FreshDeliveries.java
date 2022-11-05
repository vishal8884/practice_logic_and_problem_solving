package OtherPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FreshDeliveries {

	public static void main(String[] args) {
		List<List<Integer>> allLocations = new ArrayList<>();
		
		allLocations.add(Arrays.asList(1,2));
		allLocations.add(Arrays.asList(-1,1));
		allLocations.add(Arrays.asList(1,-1));
		allLocations.add(Arrays.asList(0,1));
		
		List<List<Integer>> res = findClosestLocations(allLocations, 2);
		
		System.out.println("res :: "+res);

	}
	
	public static List<List<Integer>> findClosestLocations(List<List<Integer>> allLocations, int noOfDeliverables) {
		System.out.println("allLocations :: "+allLocations+"      noOfDeliverables :: "+noOfDeliverables);
		Map<Integer, List<Integer>> distanceMap = new TreeMap<>();
		List<List<Integer>> closestLocationsList = new ArrayList<>();
		int listInsertCounter = 0;
		
		for(int i=0;i<allLocations.size();i++) {
			int x = allLocations.get(i).get(0);
			int y = allLocations.get(i).get(1);
			int dist = (x*x)+(y*y);
			
			if(distanceMap.containsKey(dist)) {
				List<Integer> alreadyPresentLocation = distanceMap.get(dist);
				if(x < alreadyPresentLocation.get(0)) {
					distanceMap.put(dist, allLocations.get(i));
				}
			}
			else {
			    distanceMap.put(dist,allLocations.get(i));
			}
			System.out.println("i :: "+i+"        x :: "+x+"    y  :: "+y+"    dist :: "+dist);
		}
		
		System.out.println("distance map :: "+distanceMap+"   distanceMap pos :: "+distanceMap.get(0));
		
		for(List<Integer> d : distanceMap.values()) {
			if(listInsertCounter >= noOfDeliverables)
				break;
			
			closestLocationsList.add(d);
			listInsertCounter++;
		}
		
		return closestLocationsList;
	}

}
