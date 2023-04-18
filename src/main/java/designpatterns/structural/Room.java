package designpatterns.structural;

public class Room extends Sector{
    private static Room room = new Room();
    private Room() {
    }
    public static Room getInstance() {
        return room;
    }
}
