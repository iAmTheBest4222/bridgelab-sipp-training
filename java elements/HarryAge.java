import java.util.Scanner;

class HarryAge {
    public static void main(String[] args) {
        System.out.print("write your DOB");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int age = 2024 - input;
        System.out.print(" Harry's age in 2024 is " + age);
    }
}