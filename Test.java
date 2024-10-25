import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

	// 1. Declare and Initialize objects
	Scanner sc = new Scanner(System.in);

	// 2. Declare and initialize variables
	int num = 0,option =0;
	Long longInt = 0L;
	float floatValue = 0.0f;
	double doubleValue = 0;
	String stringValue = null;
	char characterValue = 0;
	boolean booleanValue = true;

	// 3. Logic to select user data type and insert value. Include the option to print all values.
	do {
			System.out.println("Enter the data type you want to insert");
			System.out.println("1. Integer\n2. long Integer\n3. Float\n4. Double\n5. String\n"
					+ "6. character\n7. Boolean\n8.print all value of variables");

			option = sc.nextInt();
//			switch case to insert value in user selected data type
			
			switch(option) {
			case 1:
				System.out.println("Enter integer value:");
				num = sc.nextInt();
				break;
			case 2:
				System.out.println("Enter long int value:");
				longInt = sc.nextLong();
				break;
			case 3:
				System.out.println("Enter float value:");
				floatValue = sc.nextFloat();
				break;
			case 4:
				System.out.println("Enter double value:");
				doubleValue = sc.nextDouble();
				break;
			case 5:
				System.out.println("Enter String value:");
				sc.nextLine();
				stringValue = sc.nextLine();				
				break;
			case 6:
				System.out.println("Enter character value:");
				characterValue = sc.next().charAt(0);
				break;
			case 7:
				System.out.println("Enter boolean value:");
				booleanValue = sc.nextBoolean();
				break;
			case 8:
				System.out.println("\n");
				System.out.println("Integer value \t"+num);
				System.out.println("Long value \t"+longInt);
				System.out.println("float value \t"+floatValue);
				System.out.println("double value \t"+doubleValue);
				System.out.println("string value \t"+stringValue);
				System.out.println("character value \t"+characterValue);
				System.out.println("boolean value \t"+booleanValue);
				break;
			default: 
				System.out.println("Incorrect option selected");
			}

//			stopping criteria for do..while loop
			System.out.println("Type true if you want to repeat else false");
		}while(sc.nextBoolean());
	}
}