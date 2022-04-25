public class RotateTempArray {

    void RotateTemp(int arr[], int d) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        ShifArray(arr, d);
        for (int i = 0; i < d; i++) {
            arr[i + (arr.length - d)] = temp[i];
        }

    }

    void ShifArray(int arr[], int d) {
        for (int i = 0; i < arr.length - d; i++) {
            arr[i] = arr[i + d];
        }
    }

    void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void main(String[] args) {
        RotateTempArray callRotate = new RotateTempArray();
        int myArray[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        callRotate.RotateTemp(myArray, 5);
        callRotate.PrintArray(myArray);

    }
}
