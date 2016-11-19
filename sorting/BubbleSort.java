package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {1,44,22,2,16};
		sortMethod(a);
		printArray(a);
	}
	
	public static int[] sortMethod(int[] a){
		int temp = 0;
		for(int i=0; i<a.length-1;i++){
			for(int j=i+1 ; j<a.length;j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;		
	}
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++ ){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
