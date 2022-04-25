import java.util.Stack;

public class ValidParenthedes {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character character : s.toCharArray()) {
            if (character == '(') {
                stack.push(')');
            } else if (character == '{') {
                stack.push('}');
            } else if (character == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != character) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    // public static int removeDuplicates(int[] nums) {
    // Stack<Integer> keep = new Stack<Integer>();
    // int count = 0;
    // int arr[] = new int[nums.length];
    // for (int i = 0 ; i<num.length-1 ;i++){
    // if (stack.isEmpty()){
    // keep.push(num[i]);
    // }
    // if(!stack.contains(num[i])){
    // stack.push(num[i]);

    // }else{
    // count ++;
    // }

    // }
    // for(int i =0 ;i<stack.length;i++){
    // arr[i] = stack.pop(i);
    // }
    // return count;

    // }

    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum = sum * 26 + (columnTitle.charAt(i) - 65) + 1;
        }
        return sum;
    }

    public static int[] moveZeroes(int[] nums) {
        if (nums.length == 0) {
            nums[0] = 0;
        }
        int len = nums.length-1;
        int temp = 0;
        while(temp!=len){
           
        for (int i = temp; i < len; ++i) {
            if (nums[i] == 0) {
                swap(i, i+1, nums);
                // len--;
            }
        }
        temp ++;
        }
        return nums;
    }

    static void swap(int a, int b, int nums[]) {
        int temp;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
static void printArr(int da[]){
for (int i :da){
    System.out.println(i);
}

}
    public static void main(String[] argv) {
        // int d = titleToNumber("AA");
        // System.out.println(d);
        int nums[] = new int[] { 0, 1, 0, 3, 12 };
        int data[] = moveZeroes(nums);
        printArr(data);
        

    }

}
