package arrays;

import java.util.Arrays;

public class TwoDimensionArray {

	int arr[][] = null;

	// Constructor
	public TwoDimensionArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}

	// Inserting Element into 2D array
	public void insertValueToArray(int row, int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) { // ------------------------> O[1]
				arr[row][col] = value; // ------------------------> O[1]
				System.out.println("Value inserted Successfully ");// ------------------------> O[1]
			} else {
				System.out.println("This Cell is Already Occupied");// ------------------------> O[1]
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid index to access the 2D Array!!!");// ------------------------> O[1]
		}
	}

	// Accessing Elements in 2D array

	public void accessCellValue(int row, int col) {
		System.out.println("Accsessing the cell value from row - " + row + " & col - " + col); // ------------------------>
																								// O[1]
		try {
			System.out.println("Cell Value is : " + arr[row][col]); // ------------------------> O[1]
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid index to access the 2D Array!!!"); // ------------------------> O[1]
		}
	}

	// Traverse through the 2D array

	public void traverse2dArray() {
		for (int row = 0; row < arr.length; row++) { // ------------------------> O(m)
			for (int col = 0; col < arr[0].length; col++) { // ------------------------> O(n)
				System.out.print(arr[row][col] + " "); // ------------------------> O(1) --> O(mn)
			}
			System.out.println(); // ------------------------> O(1)
		}
	}

	// Searching through the 2D array

	public void searchElementIn2dArray(int value) {
		for (int row = 0; row < arr.length; row++) { // ------------------------> O(m)
			for (int col = 0; col < arr[0].length; col++) { // ------------------------> O(n) --->O(mn)
				if (arr[row][col] == value) { // ------------------------> O(1)
					System.out.println("Value is Found at row " + row + " & col " + col); // ------------------------>
																							// O(1)
					return;
				}
			}
		}
		System.out.println("Value is  Not Found !!!!!!! "); // ------------------------> O(1)
	}

	// Deleting Element in 2D Array

	public void deleteElementIn2DArray(int row, int col) {
		try {
			System.out.println("Succesfully deleted : " + arr[row][col]);
			arr[row][col] = Integer.MIN_VALUE; // ------------------------> O[1]
		} catch (IndexOutOfBoundsException e) {
			System.out.println("The row & col index that is provided is not present in the 2D Array "); // ------------------------>
																										// O[1]
		}
	}

	public static void main(String[] args) {
		TwoDimensionArray tda = new TwoDimensionArray(3, 3);
		tda.insertValueToArray(0, 0, 10);
		tda.insertValueToArray(0, 0, 20);

		tda.insertValueToArray(0, 1, 20);
		tda.insertValueToArray(1, 0, 30);
		tda.insertValueToArray(1, 1, 40);
		tda.insertValueToArray(2, 0, 50);
		tda.insertValueToArray(2, 1, 60);

		tda.accessCellValue(0, 1);

		tda.traverse2dArray();

		tda.searchElementIn2dArray(100);

		System.out.println(Arrays.deepToString(tda.arr));

		tda.deleteElementIn2DArray(0, 0);

		System.out.println(Arrays.deepToString(tda.arr));
	}
}
