package week1.day2;

public class ReverseEvenWordsAssignment {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		 
		String[] split = test.split(" ");
		
		String output="";
		
		for (int i = 0; i < split.length; i++) {
			if(i==0 || i%2==0) {
				output+=split[i]+" ";
			}
			else {
				char[] charArray = split[i].toCharArray();
				for (int j = charArray.length-1; j >=0 ; j--) {
					output+=charArray[j];
					
				}
				output+=" ";
			}
		}
		
		System.out.println(output);

	}


	}

