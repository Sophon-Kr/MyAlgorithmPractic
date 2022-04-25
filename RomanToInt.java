import java.util.*;

public class RomanToInt {

    static int RoToInt(String n) {
        int length = n.length();

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;
        for (int i = 0; i < length - 1; i++) {
            if (map.get(n.charAt(i)) >= map.get(n.charAt(i + 1))) {
                num = num + map.get(n.charAt(i));

            } else {
                num = num - map.get(n.charAt(i));
            }

        }
        num += map.get(n.charAt(length - 1));
        return num;
    }

    public static void main(String[] argv) {
        String R = "MCMXCIV";
        int newint = RoToInt(R);
        System.out.println(newint);

    }
}
