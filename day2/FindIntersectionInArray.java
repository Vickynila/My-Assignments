package week1.day2;

public class FindIntersectionInArray {

	public static void main(String[] args) {
		int arr[] = {2,3,11,8,6,5};
		int arr1[] = {1,2,8,4,9,7,3};

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr1.length; j++) 
			{
				if(arr[i] == arr1[j])
				{
					System.out.println(arr[i]);
				}
			}
		}	
	}
}

