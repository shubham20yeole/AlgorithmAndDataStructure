package sorting;

public class MergeSort {
	public static void main(String[] args) {
		int[] a={1,2,67,2};
		System.out.print("Given array:--> ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n\nSorted array:-->");
		MergeSORT(a);
		print(a);
	}
	public static void MergeSORT(int[] a){
		int al=a.length;
		if(al<2){
			return;
		}
		int mid=al/2;
		int[] l=new int[mid];
		int[] r=new int[al-mid];
		for(int i=0;i<mid;i++){
			l[i]=a[i];		
		}
		for(int i=mid;i<=al-1;i++){
			r[i-mid]=a[i];		
		}
		MergeSORT(l);
		MergeSORT(r);
		MergeSORTING(l,r,a);


	}
	public static void MergeSORTING(int[] l, int[] r, int[] a){
		//int[] a = new int[l.length + r.length];
		int nl=l.length;
		int nr=r.length;
		int i = 0,j = 0;
		int k=0;
		while((i<nl)&&(j<nr)){
			if(l[i]<=r[j]){
				a[k]=l[i];
				i=i+1;

			}else {
				a[k]=r[j];
				j=j+1;
			}
			k=k+1;
		}

		while(i<nl){
			a[k]=l[i];
			i=i+1;
			k=k+1;
		}

		while(j<nr){
			a[k]=r[j];
			j=j+1;
			k=k+1;
		}
	}
	public static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");	
		}
	}
}
