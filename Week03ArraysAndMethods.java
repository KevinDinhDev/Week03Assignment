package week03;

public class Week03ArraysAndMethods {

	public static void main(String[] args) {
		//ARRAYS
		
		/*
		String studentName1 = "Lara Nguyen";
		String studentName2 = "Rachel Nguyen";
		String studentName3 = "Danny Scallions";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		String[] students = new String [3];
		
		students[0] = "Lara Nguyen";
		students[1] = "Rachel Nguyen";
		students[2] = "Danny Scallions";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("Enhanced for loop:");
		for (String student : students) {
			System.out.println(student);
		}
		String[] products = new String[5];
		products[0] = "Carrots";
		products[1] = "Pineapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for (String product : products) {
			System.out.println(product);
		}
		
		int[] multiplesOf3 = new int[10];
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i - 1] = i * 3;
			System.out.println("number: " + multiplesOf3[i - 1]);
		}
		
		int[] multiplesOf5 = new int[10]; 
		
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i + 1) * 5;
			System.out.println(multiplesOf5[i]);
		}
		*/
		
		
		
		
		//METHODS
	/*
		String firstName = "Nhu";
		String lastName = "Truong";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Nhi", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
	}
	public static String createFullName(String x, String y) {
		 return x + " " + y;
	} */
	
	int[] myArray = new int[3];
	myArray[0] = 7;
	myArray[1] = 10;
	myArray[2] = 8;
	
	System.out.println(sumArray(myArray));
	
	double[] grades = new double[5];
	grades[0] = 88.7;
	grades[1] = 92.5;
	grades[2] = 100;
	grades[3] = 67.3;
	grades[4] = 78.9;
	
	System.out.println(calculateAverage(grades));
	
	System.out.println(multipleString("Hello", 3));
	
	}
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	} 
	
	
		public static double calculateAverage(double[] numbers) {
			double sum = 0;
			for (double number : numbers) {
				sum += number;
			}
			return sum / numbers.length;
		}
		
		public static String multipleString(String str, int num) {
			String result = "";
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result;
		}
}
