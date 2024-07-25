import java.util.*;

class Selection {
    public void bubbleSort(int arr[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) { // corrected loop condition
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

public class bubbleSort{
    public static void main(String args[]) {
        System.out.println("Enter unsorted array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Selection selection = new Selection(); // corrected object creation
        selection.bubbleSort(arr, n); // corrected method call
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
