import designpatterns.structural.Finance;
import designpatterns.structural.Guest;
import designpatterns.structural.Parking;
import designpatterns.structural.Room;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GuestTest {
    @Test
    void deveRetornarPendenciaRoomCheckout(){
        Guest guest = new Guest();
        Room.getInstance().addHostPeding(guest);
        assertEquals(false, guest.toCheckIn());
    }
    @Test
    void deveRetornarPendenciaFinanceCheckout(){
        Guest guest = new Guest();
        Finance.getInstance().addHostPeding(guest);
        assertEquals(false, guest.toCheckIn());
    }

    @Test
    void deveRetornarPendenciaParkingCheckout(){
        Guest guest = new Guest();
        Parking.getInstance().addHostPeding(guest);
        assertEquals(false, guest.toCheckIn());
    }

    @Test
    void deveRetornarHospedeSemPendenciaCheckout(){
        Guest guest = new Guest();
        assertEquals(true, guest.toCheckIn());
    }

}
