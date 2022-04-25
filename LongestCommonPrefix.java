public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String s : strs) {
            minLen = Math.min(minLen, s.length());
        }
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (checkCommon(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    static boolean checkCommon(String[] strs, int len) {
        String newStr = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(newStr)) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] argv) {

        String[] strs = new String[] { "flower", "flow", "flight" };
        // String[] strs1 = new String[] { "flower", "flower", "flower" };
        String com = longestCommonPrefix(strs);
        System.out.println(com);
    }
}
