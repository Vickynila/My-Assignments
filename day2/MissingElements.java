package week1.day2;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
	
				int[] arr = {1,2,4,5,7,6,8,9,10};

				Arrays.sort(arr);
				int n=0;

				for (int i = 0; i < arr.length; i++)
				{
					n++;

					if(n != arr[i])
					{
						System.out.println("Missing element : " + n);
						break;
					}
				}
			}
	


}
