package designpatterns.structural;

public class Parking extends Sector{
    private static Parking parking = new Parking();
    private Parking() {
    }
    public static Parking getInstance() {
        return parking;
    }
}
