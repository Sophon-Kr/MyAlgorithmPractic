public class BlockSwapRotate {
    void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    void swap(int arr[], int first, int second, int d) {
        int temp;
        for (int i = 0; i < d; i++) {
            temp = arr[i + first];
            arr[i + first] = arr[i + second];
            arr[i + second] = temp;
        }
    }

    void RotateLeft(int arr[], int d, int n) {
        RotateBlock(arr, 0, d, n);
    }

    void RotateBlock(int arr[], int i, int d, int n) {
        // PrintArray(arr);
        // System.out.println(i + ":" + d + ":" + n);
        if (d == 0 || d == n) {
            return;
        }
        if (n - d == d) {
            swap(arr, i, n - d + i, d);
            return;
        }

        if (d < n - d) {
            swap(arr, i, n - d + i, d);
            RotateBlock(arr, i, d, n - d);
        } else {
            swap(arr, i, d, n - d);
            RotateBlock(arr, n - d + i, 2 * n - d, d);
        }
    }

    public static void main(String[] argv) {
        int newArray[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = newArray.length;
        int d = 2;
        BlockSwapRotate callBlockRotate = new BlockSwapRotate();
        callBlockRotate.RotateLeft(newArray, d, n);
        callBlockRotate.PrintArray(newArray);
    }
}
