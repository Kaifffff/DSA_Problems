package StringPrograms;

public class FindLargestAndSmallestWord {
	public static void main(String []args) {
		String str = "Java is a powerful programming language";
		
		String words[] = str.split(" ");
		String largest = words[0];
		String smallest = words[0];
		
		for(String word : words) {
			if(word.length() > largest.length()) {
				largest = word;
			}
			if(word.length() < smallest.length()) {
				smallest = word;
			}
		}
		
		System.out.println("small : " + smallest + " larg : " + largest );
	}

}
