package designpatterns.structural;

import java.util.ArrayList;
import java.util.List;

public abstract class Sector {
    private List<Guest> hostPending = new ArrayList<Guest>();

    public void addHostPeding(Guest guest) {
        this.hostPending.add(guest);
    }

    public boolean checkHostWithPending(Guest guest) {
        return this.hostPending.contains(guest);
    }
}
