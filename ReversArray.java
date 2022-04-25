public class ReversArray {
    void Revers(int arr[]) {
        int temp;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] argv) {
        int newArr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ReversArray data = new ReversArray();
        data.Revers(newArr);
        data.PrintArray(newArr);
    }
}
