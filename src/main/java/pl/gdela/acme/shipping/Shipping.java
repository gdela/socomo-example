package pl.gdela.acme.shipping;

import pl.gdela.acme.couriers.dhl.DhlCarrier;
import pl.gdela.acme.couriers.fedex.FedExCarrier;
import pl.gdela.acme.couriers.ups.UpsCarrier;
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
    public void d() {}
    public void e() {}
    public void f() {}

    {
        orders = new Orders();
        System.out.println(orders);
    }

    public ShipRequest newShipRequest() {
        return new ShipRequest();
    }
}
