package designpatterns.structural;

public class Guest {
    public boolean toCheckIn(){
        return GuestFacade.checkPendingItemsCheckout(this);
    }
}
