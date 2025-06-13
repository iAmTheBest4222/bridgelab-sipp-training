import java.util.Scanner;
public class Qfour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();


        double cmPerInch = 2.54;
        int inchesPerFoot = 12;


        double totalInches = heightCm / cmPerInch;


        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;


        System.out.printf("Your height in cm is %.2f cm, while in feet is %d ft and inches is %.2f in.%n", heightCm, feet, inches);
    }
}
