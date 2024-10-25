class ConstructorImplementation2 {
	//	1. Default constructor
	public ConstructorImplementation2() {
		System.out.println("I am default constructor");
	}
	
	//	2. Parameterized constructor
	public ConstructorImplementation2(float decimal, int[] array){

		System.out.println("\nFrom Parameterized constructor\n");
		System.out.println(decimal+" x array is: " );
		
		// Multiply and print the value 
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i]*decimal+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {12,43,65,77};
		
//		3. Creating object for the class and initializing with default constructor
		ConstructorImplementation2 constructorImplementation = new ConstructorImplementation2();
		
//		4. re-initialize the same object with a parameterized constructor
		constructorImplementation = new ConstructorImplementation2(1.77f, array);
	}
}