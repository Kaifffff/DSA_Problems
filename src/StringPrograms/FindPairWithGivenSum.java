package StringPrograms;

import java.util.HashMap;

public class FindPairWithGivenSum {
	public static void main(String []args) {
		int arr[] = {2, 7, 11, 15};
		int target = 9;
		HashMap<Integer , Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			int com = target - arr[i];
			if(map.containsKey(com)) {
				System.out.print("Pair Found : " + com +  " , " + arr[i]);
				return ;
			}
			
			map.put(arr[i],i);
		}
		
		System.out.print("no pair found");
	}
}
