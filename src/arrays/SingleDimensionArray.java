package arrays;

public class SingleDimensionArray {

	int[] arr = null;

	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	// Insert Elements in Array

	public void insert(int location, int valueToBeInserted) {
		try {
			if (arr[location] == Integer.MIN_VALUE) { // ------------------------> O[1]
				arr[location] = valueToBeInserted; // ------------------------> O[1]
				System.out.println("Value inserted Successfully ");// ------------------------> O[1]
			} else {
				System.out.println("This Cell is Already Occupied");// ------------------------> O[1]
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid index to access the Array!!!");// ------------------------> O[1]
		}
	}

	// Traverse in Array
	public void traverse() {
		try {
			for (int i = 0; i < arr.length; i++) { // ------------------------> O[N]
				System.out.print(arr[i] + " "); // ------------------------> O[1]
			}
		} catch (Exception e) {
			System.out.println("Array No Longer Exist");
		}
	}

	// Searching Element in Array

	public void searchInArray(int valueToSearch) {
		for (int i = 0; i < arr.length; i++) { // ------------------------> O[N]
			if (arr[i] == valueToSearch) { // ------------------------> O[1]
				System.out.println("Value is found at the index : " + i); // ---> O[1]
				return; // ---> O[1]
			}
		}
		System.out.println(valueToSearch + " is Not Found !!"); // ---> O[1]
	}

	// Deleting Element in Array

	public void deleteElementInArray(int indexTobeDeleted) {
		try {
			arr[indexTobeDeleted] = Integer.MIN_VALUE;		// ------------------------> O[1]
			System.out.println("Element at " + indexTobeDeleted + " is deleted successfully"); // ------------------------> O[1]
		} catch (IndexOutOfBoundsException e) {
			System.out.println("The index that is provided is not in the Array ");        // ------------------------> O[1]
		}
	}

	public static void main(String[] args) {
		SingleDimensionArray sda = new SingleDimensionArray(10);
		sda.insert(0, 10);
		sda.insert(1, 20);
		sda.insert(2, 30);
		sda.insert(1, 10);
		sda.insert(12, 10);
		/*
		 * var firstElement = sda.arr[0]; // ------------------------> O[1]
		 * System.out.println(firstElement);
		 * 
		 * var thirdElement = sda.arr[2]; // ------------------------> O[1]
		 * System.out.println(thirdElement);
		 */
		/* sda.traverse(); */

		sda.searchInArray(26);
		sda.deleteElementInArray(0);
		System.out.println(sda.arr[0]);

	}

}
