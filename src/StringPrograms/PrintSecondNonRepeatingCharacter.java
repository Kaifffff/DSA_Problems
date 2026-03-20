package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintSecondNonRepeatingCharacter {
	public static void main(String []args) {
		int arr[] = {1,2,3,1,2,4};
		int count = 0;
		HashMap<Integer , Integer> map = new HashMap<>();
		
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(int num : arr) {
			if(map.get(num) == 1) {
				count++;
				if(count == 2) {
					System.out.println(num);
					return ;
				}
			}
		}
	}
}
