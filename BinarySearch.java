import java.util.*;

public class Binary {

	int binSearch(int arr[], int target) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;  //find the middle element

			if (arr[mid] == target)
				return mid;

			if (target > arr[mid])      //if target greater than middle, then change low to mid+1
				low = mid + 1;

			else {
				high = mid - 1;        //if target less than middle, then change high to mid-1
			}

		}

		return -1;
	}

	public static void main(String arg[]) {
		Binary b = new Binary();
		int arr[] = { 2, 4, 5, 7, 23, 31, 34, 43, 45 };

		int ans = b.binSearch(arr, 46);

		if (ans == -1)
			System.out.println("The element is not found");

		else {
			System.out.println("Element is found at postion = " + (ans + 1));
		}

	}

}
