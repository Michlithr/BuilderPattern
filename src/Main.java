import flightLeg.FlightLeg;

public class Main {

    public static void main(String[] argv){

        FlightLeg leg = new FlightLeg.FlightBuilder("Las Vegas","Los Angeles").buildPrice(99.3f).build();
        System.out.println(leg);
    }
}
