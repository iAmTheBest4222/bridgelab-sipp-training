import java.util.Scanner;
public class Qtwntyone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String fromCity = sc.next();
        String viaCity = sc.next();
        String toCity = sc.next();
        double fromToVia = sc.nextDouble();
        double viaToFinalCity = sc.nextDouble();
        double timeFromToVia = sc.nextDouble();
        double timeViaToFinalCity = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
    }
}

