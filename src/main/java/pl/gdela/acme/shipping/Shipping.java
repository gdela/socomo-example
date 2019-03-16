package pl.gdela.acme.shipping;

import pl.gdela.acme.courriers.DhlCarrier;
import pl.gdela.acme.courriers.FedExCarrier;
import pl.gdela.acme.courriers.UpsCarrier;
import pl.gdela.acme.inventory.Inventory;
import pl.gdela.acme.orders.Orders;

public class Shipping {
    private Inventory inventory;
    private DhlCarrier carrier1;
    private UpsCarrier carrier2;
    private FedExCarrier carrier3;
    private Orders orders; // causes cyclic dependency

    public void a() {}
    public void b() {}
    public void c() {}
}
