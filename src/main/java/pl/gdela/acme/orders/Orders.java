package pl.gdela.acme.orders;

import pl.gdela.acme.catalog.Catalog;
import pl.gdela.acme.inventory.Inventory;
import pl.gdela.acme.invoicing.Invoicing;
import pl.gdela.acme.shipping.Shipping;

public class Orders {
    private Catalog catalog;
    private Inventory inventory;
    private Shipping shipping;
    private Invoicing invoicing;

    private void dummy() {
        shipping.a();
        shipping.b();
        shipping.c();
    }
}
