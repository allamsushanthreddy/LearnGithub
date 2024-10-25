public class FibonacciSeries {
	public static void main(String[] args) {
	
		// 1. Declare variables
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int sum;
		float average;
		int modulusResult;

		/*

		num1 = 1
		num2 = 1
		num3 = 2
		num4 = 3
		num5 = 5
		num6 = 8
		*/
		// 2. Initialize the variables

		num1 = 1;
		num2 = 1;
		num3 = num1+num2;
		num4 = num2+num3;
		num5 = num3+num4;

		// 3. Calculate sum, average and Modulus 10
		sum = num1+num2+num3+num4+num5;
		average = sum/5.0f;
		modulusResult = sum%10;

		// 3. Print all values
		System.out.println("Sum of first 5 term : "+sum);
		System.out.println("Average of the sum is: "+average);
		System.out.println("Modulus 10 for sum is: "+modulusResult);

	}
}