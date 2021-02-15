package attractions;

import behaviours.ITicketed;

public class RollerCoaster  extends Attraction implements ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }
}
