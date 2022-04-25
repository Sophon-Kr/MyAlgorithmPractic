public class ReversRotate {

    void ReversRotateArray(int arr[], int d, int n) {
        Revers(arr, 0, d - 1);
        Revers(arr, d, n - 1);
        Revers(arr, 0, n - 1);

    }

    void Revers(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    void PrintArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] argv) {
        int newArr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int num = newArr.length;
        ReversRotate reversArr = new ReversRotate();
        reversArr.ReversRotateArray(newArr, 5, num);
        reversArr.PrintArray(newArr);
    }
}
