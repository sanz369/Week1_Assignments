package week1.day2;

public class ChangeOddIndexToUpperCaseAssignment {

	public static void main(String[] args) {
	String str="Example";
		str = str.toLowerCase();
				char[] strArr=str.toCharArray();
		
		for (int i = 0; i < strArr.length; i++) {
			if(i%2!=0) {
				strArr[i]=Character.toUpperCase(strArr[i]);
			}
			System.out.print(strArr[i]);
		}
		

	}

}
