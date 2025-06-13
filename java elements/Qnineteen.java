import java.util.Scanner;
public class Qnineteen {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double salary = sc.nextDouble();
            double bonus = sc.nextDouble();
            double total = salary + bonus;
            System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + ". Hence Total Income is INR " + total);
        }
    }

