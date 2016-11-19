package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] ar={100, 1, 99};
		System.out.print("\nGiven ar:     ");
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
		selectionSort(ar);
	}
	public static void selectionSort(int[] a){
		int temp = 0, min =0, jTemp = 0;
		for(int i=0; i< a.length-1;i++){
			min = i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

		print(a);
	}
	public static void print(int[] a){
		System.out.print("\n\n");
		System.out.print("Sorted ar:    ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
