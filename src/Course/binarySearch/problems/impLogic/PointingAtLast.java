package Course.binarySearch.problems.impLogic;

public class PointingAtLast {

	public static void main(String[] args) {

	}

}

//arr = {1,12,14,19,23,24}
//
//if we do binary search for eg 22 in the above array
//
//then         target = 22
//
//step 1 ->          arr[start] = 1      arr[mid] = 14     arr[end] = 24
//                    
//                    target > arr[mid].....start = mid +1
//
//
//                    
//step 2 ->         arr[start] = 19      arr[mid] = 23    arr[end] =24
//
//                    target < arr[mid]  ...end = mid -1
//                    
//                    
//step 3 ->        arr[start] = 19      arr[mid] =19       arr[end] = 19..................hele loop will break...proceding to explain the further process
//
//
//                    target > arr[mid]     ..start = mid +1 = ...arr[start] = 23
//                    
//
//
//res will be -1 
//
//ar last arr[start] = 23            arr[end] = 19                   