import java.util.*;
public class MergeSort {

	void merge(int a[], int low, int mid, int high)
	{
		int b[]= new int[high-low+1];
		int i=low;
		int j= mid+1;
		int k=0;
		
		while(i<=mid && j<=high)
			b[k++]=a[i]<a[j]?a[i++]:a[j++];
			
		while(i<=mid)
			b[k++]=a[i++];
		
		while(j<=high)
			b[k++]=a[j++];
		
		System.arraycopy(b, 0, a, low, b.length);
		
	}
	//merge both the sides
	void mergeSort(int a[],int low, int high)
	{
		if(low<high)
		{			
			int mid = (low+high)/2;
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);
			System.out.println(Arrays.toString(a));
			
		}
	}
	
	public static void main(String args[])
	{
		
		MergeSort m = new MergeSort();
		
		int a[] = {2,4,1,6,8,5,3,7};
		m.mergeSort(a,0,a.length-1);	
		
	}
	
}
