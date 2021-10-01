import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            BinarySearch ob = new BinarySearch();
            int arr[] = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter " + (i + 1) + " th element: ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the number to search: ");
            int x = sc.nextInt();
            int len = arr.length;
            int result = ob.binarySearch(arr, 0, len - 1, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index " + result);
        } finally {
            sc.close();
        }
    }
}
