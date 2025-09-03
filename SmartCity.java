import java.util.*;
import java.util.stream.*;
import java.util.function.*;

interface TransportService {
    String getName();
    double getFare();
    default void printServiceDetails() {
        System.out.println(getName() + " - Fare: " + getFare());
    }
}

interface GeoUtils {
    static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

interface EmergencyService {}

@FunctionalInterface
interface FareCalculator {
    double calculateFare(double distance);
}

class BusService implements TransportService {
    private String name; private double fare;
    BusService(String n,double f){name=n;fare=f;}
    public String getName(){return name;}
    public double getFare(){return fare;}
}

class MetroService implements TransportService {
    private String name; private double fare;
    MetroService(String n,double f){name=n;fare=f;}
    public String getName(){return name;}
    public double getFare(){return fare;}
}

class TaxiService implements TransportService {
    private String name; private double fare;
    TaxiService(String n,double f){name=n;fare=f;}
    public String getName(){return name;}
    public double getFare(){return fare;}
}

class AmbulanceService implements TransportService, EmergencyService {
    private String name; private double fare;
    AmbulanceService(String n,double f){name=n;fare=f;}
    public String getName(){return name;}
    public double getFare(){return fare;}
}

public class SmartCity {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService("City Bus",15),
            new MetroService("Metro Line",20),
            new TaxiService("City Taxi",50),
            new AmbulanceService("Ambulance",0)
        );

        services.stream()
            .sorted(Comparator.comparingDouble(TransportService::getFare))
            .forEach(TransportService::printServiceDetails);

        FareCalculator calc = d -> d*2;
        System.out.println("Fare: " + calc.calculateFare(10));

        Map<Boolean,List<TransportService>> partitioned =
            services.stream().collect(Collectors.partitioningBy(s->s.getFare()>20));
        System.out.println("Partitioned: " + partitioned);

        DoubleSummaryStatistics stats =
            services.stream().collect(Collectors.summarizingDouble(TransportService::getFare));
        System.out.println("Revenue Stats: " + stats);

        double dist = GeoUtils.calculateDistance(0,0,3,4);
        System.out.println("Distance: " + dist);

        services.stream().filter(s->s instanceof EmergencyService)
            .forEach(s->System.out.println("Emergency: "+s.getName()));
    }
}
