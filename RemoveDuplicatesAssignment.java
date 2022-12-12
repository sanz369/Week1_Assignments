package week1.day2;

public class RemoveDuplicatesAssignment {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int ctr = 0;
		String[] splitArray =  text.split(" ");
		String duplicate = "";
		
		
		for (int i = 0; i < splitArray.length; i++) {
			for (int j = i+1; j < splitArray.length; j++) {
				if(splitArray[i].equals(splitArray[j]))
				{		
					duplicate = splitArray[i];
					ctr++;					
					if (ctr > 0)				
					{
						text.replace(duplicate, "");
						 text = text.replaceAll(splitArray[i], "");
						 break;
					}	

					
				}				
			}			
		}			
		System.out.println(text);
	}

}
		
		