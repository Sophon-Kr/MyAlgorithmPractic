import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Student[] SData = new Student[5];
        int[] tempAge = new int[5];
        String[] tempName = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < SData.length; i++) {
            System.out.print("Input Your name : ");
            tempName[i] = input.nextLine();
            System.out.print("Input Your age : ");
            tempAge[i] = input.nextInt();
        }
        input.close();
        for (int j = 0; j < SData.length; j++) {
            SData[j] = new Student(tempName[j], tempAge[j]);
        }
        for (int j = 0; j < SData.length; j++) {
            System.out.printf(SData[j].name + SData[j].age);
        }

    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
