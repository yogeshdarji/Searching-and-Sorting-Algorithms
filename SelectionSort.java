	import java.util.*;
	public class SelectionSort {

		int[] selection(int a[])
		{
			int x=0;
			for(int j=0;j<a.length-1;j++)
			{
				int min = a[j];
				System.out.println("minii"+min);
				for(int i=j; i<a.length;i++)
				{
					if(a[i]<min)
						{min=a[i];
						x=i;
						}
					 
				
				}
				
				
				if(a[x]<a[j]){
				int t=a[x];
				a[x]= a[j];
				a[j]=t;
				}
				
				
				for(int k=0;k<a.length;k++)
					System.out.print(a[k]+ " ");
					System.out.println();
				
			}
			
			
			
			return a;
		}

		private void swap(int i, int min) {
			System.out.println("insideswap:");
			int t= min;
			min=i;
			i=t;
			
		}
		
		public static void main(String args[])
		{
			SelectionSort s= new SelectionSort();
			int a[]={64, 25, 12, 22, 11,17,56,47};
			
			int ans[] = s.selection(a);
			
			for(int i=0; i<a.length;i++)
			{
				System.out.print(ans[i]+"\t");
			}
		}
		
		
	}
