import java.util.Scanner;
public class Qten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for fee and discount
        System.out.print("Enter the student fee (INR): ");
        double fee = sc.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        double discountPercent = sc.nextDouble();

        // Calculating discount and final fee
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        // Output result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}


