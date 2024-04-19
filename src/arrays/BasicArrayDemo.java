package arrays;

import java.util.Arrays;

public class BasicArrayDemo {

	public static void main(String[] args) {
		// 1-D Array
		// Step 1 - Declare
		int[] arr; // O[1]

		// Step 2 - Instantiate
		arr = new int[3]; // O[1]

		// Step 3 - Initialize
		arr[0] = 1; // O[1]
		arr[1] = 2; // O[1] //--------------------> O[N] (Space)
		arr[2] = 3; // O[1]

		System.out.println(Arrays.toString(arr));

		// All together

		String array[] = { "a", "b", "c" }; // O[1]

		System.out.println(Arrays.toString(array));

		// 2-D Array

		// Step 1 - Declare
		int[][] int2DArray;  		// -------------> O[1]
		
		// Step 2 - Instantiate
		int2DArray = new int[2][2];	// -------------> O[1]
		
		
		// Step 3 - Initialize
		
		int2DArray[0][0]= 1 ;		// -------------> O[1]
		int2DArray[0][1]= 2 ;		// -------------> O[1]
		int2DArray[1][0]= 3 ;		// -------------> O[1]		//------->O(mn) (Space)
		int2DArray[1][1]= 4 ;		// -------------> O[1]
		
		System.out.println(Arrays.deepToString(int2DArray));  // -------------> O[1]
		
		// All together
		String s2DArray[][] = {{ "a", "b"} , {"c", "d" }};   // -------------> O[1]
		System.out.println(Arrays.deepToString(s2DArray));	// -------------> O[1]
	}

}
