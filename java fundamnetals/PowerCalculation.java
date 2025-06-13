import java.util.*;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Base ");
        int a= sc.nextInt();
        System.out.println("Enter the Exponent ");
        double b= sc.nextInt();
        double c=Math.pow(a,b);
        System.out.println("The Power is " + c);
    }
}
