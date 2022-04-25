import java.util.*;

public class TwoSumNumber {
    static int[] TwoSum(int[] n, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            map.put(n[i], i);
        }
        for (int i = 0; i < n.length; i++) {

            int complement = target - n[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                result[0] = map.get(complement);
                result[1] = i;

            }
        }
        return result;
    }

    public static void main(String[] argv) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] data = TwoSum(nums, target);
        System.out.println(data[0] + ":" + data[1]);
    }
}
