package pl.gdela.acme.couriers.fedex;

import pl.gdela.acme.couriers.Carrier;

public class FedExCarrier implements Carrier {
    @Override
    public String name() {
        return "FedEx";
    }
}
