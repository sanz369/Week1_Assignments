package week1.day2;

public class PalindromeAssignment {

	public static void main(String[] args) {
String str="MaDAm";
		
		String reverseStr="";
		
		char[] charArray = str.toCharArray();
		
		for (int i = charArray.length-1; i >=0; i--) {
			reverseStr+=charArray[i];
		}
		
		if(str.equalsIgnoreCase(reverseStr)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
