public class JugglingRotateArray {

    void RotateLeft(int arr[], int d, int n) {
        d = d % n;
        int temp, i, j, k;
        int GCD = FindGCT(d, n);
        for (i = 0; i < GCD; i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }

            arr[j] = temp;
        }

    }

    int FindGCT(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return FindGCT(b, a % b);

        }
    }

    void PrintArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int newArr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int digitRotate = 3;
        int arrayLength = newArr.length;
        JugglingRotateArray callJunggle = new JugglingRotateArray();
        callJunggle.RotateLeft(newArr, digitRotate, arrayLength);
        callJunggle.PrintArray(newArr, arrayLength);
    }

}
