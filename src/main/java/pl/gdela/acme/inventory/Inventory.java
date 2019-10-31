package pl.gdela.acme.inventory;

import pl.gdela.acme.couriers.Carrier;
import pl.gdela.acme.couriers.dhl.DhlCarrier;
import pl.gdela.acme.couriers.ups.UpsCarrier;

import java.util.List;

import static java.util.Arrays.asList;

public class Inventory {

    public List<Carrier> availableCarriers() {
        return asList(new UpsCarrier(), new DhlCarrier());
    }

}
