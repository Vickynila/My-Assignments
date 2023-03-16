package week1.day2;

public class DuplicatesInArray {

	public static void main(String[] args) {
int[] arr = {11,12,13,11,15,14,18,13,17,19,18,17,20,12};
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j]) 
				
				System.out.println( arr[i]);
				}
			}
	}

}
