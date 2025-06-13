import java.util.Scanner;
public class Qeleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("distance in feets");
        int distFeet = sc.nextInt();

        int distYards = distFeet/3;
        double distMiles = (double) distFeet/5280;
        System.out.println("The distance in yards is " +distYards + "while the distance in miles is " +distMiles);



    }
}