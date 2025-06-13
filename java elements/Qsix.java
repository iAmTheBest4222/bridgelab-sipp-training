import java.io.*;
import java.util.Scanner;

public class Qsix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextInt();
        double totalMiles = km * 1.609344;
        System.out.println(totalMiles);
    }
}
