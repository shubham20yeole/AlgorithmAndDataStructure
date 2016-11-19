
//Given an arrayOfInts, find the highestProduct you can get from three of the integers.
//The input arrayOfInts will always have at least three integers.

package interviewcake;

import java.util.Arrays;

public class InterviewCake3 {
	public static void main(String[] args) {
		int[] array = new int[]{11, 2, 3, 6, 9};
		   Arrays.sort(array);
		   System.out.println("Highest Product = "+(array[array.length-1]*array[array.length-2]*array[array.length-3]));
	}
	

}
