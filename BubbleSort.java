import java.util.*;

public class BubbleSort {

	int[] bubble(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}

		}

		return a;
	}

	public static void main(String args[]) {
		BubbleSort b = new BubbleSort();
		int a[] = { 5, 1, 4, 2, 8 };
		int ans[] = b.bubble(a);

		System.out.println("The Final Sorted Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(ans[i] + "\t");
		}
	}

}
