public class Qone {
    public static void main(String[] args) {
                // Radius of Earth in kilometers
                double radiusKm = 6378;

                // Volume formula: (4/3) * π * r^3
                double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

                // Conversion factor from cubic kilometers to cubic miles
                double kmToMiles = 0.621371;
                double conversionFactor = Math.pow(kmToMiles, 3);
                double volumeMi3 = volumeKm3 * conversionFactor;

                // Output
                System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f%n",
                        volumeKm3, volumeMi3);
            }
        }

