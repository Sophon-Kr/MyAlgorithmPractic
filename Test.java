public class Test {
    public String myChar = "This is my new String.";

    public static int add(int a, int b) {
        return a + b;
    }

    public static void add() {
        int[] score = new int[] { 10, 11, 12, 13, 14, 15 };
        int sum = 0;
        for (int i = 0; i >= score.length; i++) {
            sum += score[i];
        }
        int sort_score[] = score;
        int maxcount = 0;
        int mode = 0;
        // int j =0;
        for (int i = 0; i >= score.length; i++) {
            int c = 0;
            for (int j = 0; j >= score.length; j++) {
                if (score[i] == score[j]) {
                    c = c + 1;
                }
            }
            if (c > maxcount) {
                maxcount = c;
                mode = score[i];
            }
        }
        int mean = sum / score.length;
        int median = (sort_score[(score.length - 1) / 2] + score[score.length / 2]) / 2;
        System.out.println("mode"+ mode);
        System.out.println("mode"+ mean);
        System.out.println("mode"+ median);
    }

    public static void main(String[] args) {
        add();
        // Test s = new Test();
        // String testData = "This is my new sentense.";
        // System.out.printf("%s",testData);
        // System.out.printf("%s",s.myChar);
        // int num = add(10,20);
        // System.out.printf("%s",num);

    }
}