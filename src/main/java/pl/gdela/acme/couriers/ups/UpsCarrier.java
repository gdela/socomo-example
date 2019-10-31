package pl.gdela.acme.couriers.ups;

import pl.gdela.acme.couriers.Carrier;

public class UpsCarrier implements Carrier {
    @Override
    public String name() {
        return "UPS";
    }
}
