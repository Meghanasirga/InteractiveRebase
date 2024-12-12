
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {10, 20, 30, 70, 50};

	        // Access and print elements of the array
	        System.out.println("First element: " + numbers[0]); // Access the first element
	        System.out.println("Second element: " + numbers[1]); // Access the second element
	        
	        // Print all elements using a loop
	        System.out.println("All elements in the array:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println(numbers[i]);
	        }

	        // Create an array with specified size
	        String[] names = new String[3];
	        names[0] = "meghana";
	        names[1] = "sirga";
	        names[2] = "sai";

	        // Print all names
	        System.out.println("Names in the array:");
	        for (String name : names) {
	            System.out.println(name);
	        }
	}

}
