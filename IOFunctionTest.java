import java.util.*;

public class IOFunctionTest {
    public Integer StringToInt(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) - 48) < 0 || (str.charAt(i) - 48) > 9) {
                continue;
            } else {
                num = num * 10 + (str.charAt(i) - 48);
            }
        }
        return (str.charAt(0) == '-') ? num * -1 : num;
    }

    public static void main(String[] args) {
        System.out.print("Input Data : ");
        try (Scanner data = new Scanner(System.in)) {
            String InputData = data.nextLine();
            System.out.printf("Type : " + InputData.getClass().getSimpleName());
            System.out.println();
            IOFunctionTest convert = new IOFunctionTest();
            int newData = convert.StringToInt(InputData);
            System.out.printf("Output Data : " + newData);
            System.out.println();
            System.out.printf("Type : " + convert.StringToInt(InputData).getClass().getSimpleName());
        } catch (Exception e) {

        }

    }

}
