//You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
//Write a function getProductsOfAllIntsExceptAtIndex() that takes an array of integers and returns an array of the products.

package interviewcake;

public class InterviewCake2 {

	public static void main(String[] args) {
	
		int[] array = new int[]{1, 2, 3};
		
		System.out.print("Given Array: ");
		printArray(array);
		
		int[] result = getProductsOfAllIntsExceptAtIndex(array);
		
		System.out.print("Resulted Array: ");
		printArray(result);

	}

	private static int[] getProductsOfAllIntsExceptAtIndex(int[] array) {
		
		int atIndex = 0, sol = 1;
		int[] result = new int[array.length];

		for(int i = 0 ; i<array.length; i++){
			atIndex = i;
			for(int j = 0 ; j<array.length; j++){
				if(atIndex!=j) sol = sol * array[j];
			}
			result[i] = sol;
			sol = 1;
		}
		return result;
	}
	
	public static void printArray(int[] a){
	
		for(int i =0; i<a.length; i++){
			System.out.print(a[i]+", ");
		}
		
		System.out.println();
	}
}
