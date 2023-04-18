package designpatterns.structural;

public class Finance extends Sector {
    private static Finance finance = new Finance();
    private Finance() {
    }
    public static Finance getInstance() {
        return finance;
    }
}
