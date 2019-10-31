package pl.gdela.acme.couriers.dhl;

import pl.gdela.acme.couriers.Carrier;

public class DhlCarrier implements Carrier {
    @Override
    public String name() {
        return "DHL";
    }
}
