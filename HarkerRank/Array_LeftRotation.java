package HarkerRank;

import java.util.Scanner;

public class Array_LeftRotation {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		Scanner scan = new Scanner(System.in);

		int rot = 2;

		getResult(a, rot);
	}

	private static void getResult(int[] a, int rot) {
		int[] b = new int[5]; 
		for(int i=0;i<a.length;i++){
			int x = i - rot;
			if(x<0){
				x = a.length + x;
				b[x] = a[i];
			}else{
				b[x] = a[i];
			}
		}
		print(b);
	}

	private static void print(int[] a) {
		for(int i = 0; i<a.length;i++){
			System.out.print(a[i]+", ");
		}
		
	}
}
