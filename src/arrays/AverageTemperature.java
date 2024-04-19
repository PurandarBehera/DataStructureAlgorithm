package arrays;

import java.util.Scanner;

public class AverageTemperature {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("How Many days Temperature ? : ");
		int numDays = scanner.nextInt();

		int temps[] = new int[numDays];
		int sum = 0;
		
		//Record Temp and calculate average
		
		for (int i = 0; i < numDays; i++) {
			System.out.print("Day " + (i + 1) + " 's Highest Temperature : ");

			temps[i] = scanner.nextInt();
			sum += temps[i];
		}

		double average = sum / numDays;

		// Count number of days above the average Temperature

		int above = 0;

		for (int i = 0; i < temps.length; i++) {
			if (temps[i] > average)
				above++;
		}

		System.out.println("average temp is : " + average);
		System.out.println("Number of days above the average temp is : " + above);
		scanner.close();
	}

}
