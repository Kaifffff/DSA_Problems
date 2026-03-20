package StringPrograms;

public class ExtractDigitFromStringAndSum {
	public static void main(String []args) {
		String str = "1a2b3c";
		int sum = 0;
		
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) {
				sum+= ch - '0';
			}
		}
		
		System.out.println("Sum : " + sum);
	}
}
