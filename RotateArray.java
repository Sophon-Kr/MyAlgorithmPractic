// Rotate one by one algorithm
public class RotateArray {
    void LeftRotateOne(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    void LeftRotateArray(int arr[], int m, int n) {
        for (int i = 0; i < m; i++) {
            LeftRotateOne(arr, n);
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] argv) {
        int ExArray[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        RotateArray callRotate = new RotateArray();
        callRotate.LeftRotateArray(ExArray, 5, 9);
        callRotate.printArray(ExArray);
    }
}
