public class Leettest {
    public static boolean isPalindrome(int x) {

        int temp = x;
        if (x < 0)
            return false;
        int res = 0;
        while (temp != 0) {
            res = res * 10 + temp % 10;
            temp = temp / 10;
        }

        return (x == res);
    }

    public static void main(String[] argv) {
        int n = 100;
        boolean data = isPalindrome(n);
        System.out.println(data);

    }

}
