package week1.day2;

public class SumOfDigitsFromStringAssignment {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum=0;
		
		String numbers = text.replaceAll("[^0-9]", "");
		
		char[] charArray = numbers.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			sum+=Character.getNumericValue(charArray[i]);
		}
		
		System.out.println(sum);
	}

	}


