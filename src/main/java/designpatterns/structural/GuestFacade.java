package designpatterns.structural;

public class GuestFacade {

    public static boolean checkPendingItemsCheckout(Guest guest) {
        if(Room.getInstance().checkHostWithPending(guest)){
            return false;
        } if(Finance.getInstance().checkHostWithPending(guest)){
            return false;
        } if(Parking.getInstance().checkHostWithPending(guest)){
            return false;
        }
        return true;
    }

}
