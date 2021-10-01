import java.util.Scanner;

public class LinearSearch {
	public static int search(int arr[], int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			int arr[] = new int[10];
			for (int i = 0; i < 10; i++) {
				System.out.print("Enter " + (i + 1) + " th element: ");
				arr[i] = sc.nextInt();
			}
			System.out.print("Enter the number to search: ");
			int x = sc.nextInt();

			int result = search(arr, x);
			if (result == -1)
				System.out.print("Element is not present in array");
			else
				System.out.print("Element is present at index " + result);
		} finally {
			sc.close();
		}
	}
}
