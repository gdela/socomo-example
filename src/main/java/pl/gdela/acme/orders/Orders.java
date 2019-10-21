package pl.gdela.acme.orders;

import pl.gdela.acme.catalog.Bla;
import pl.gdela.acme.catalog.Foo;
import pl.gdela.acme.inventory.Inventory;
import pl.gdela.acme.invoicing.Invoicing;
import pl.gdela.acme.shipping.Shipping;

public class Orders {
    private Foo catalog1;
    private Bla catalog2;
    private Inventory inventory;
    private Shipping shipping;
    private Invoicing invoicing;

    public void dummy() {
        shipping.a();
        shipping.b();
        shipping.c();
    }
}
