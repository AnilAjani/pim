package org.improving.pim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository {
    private final List<Inventory> items = new ArrayList<>();

    public ProductRepository(){
        items.add(new Inventory("iPhone Datacables", "OEM Lightening", "2230304", "Apple"));
        items.add(new Inventory("Car Chargers", "3.0 Dual USB Car Charger", "3443566", "Belkin"));
        items.add(new Inventory("Wall Charger", "2.1 Fast Charge", "4457765", "Generic"));
        items.add(new Inventory("Earbuds", "5.0 Stereo", "5563455", "Skull Candy"));
    }
    public void add(Inventory item){
        items.add(item);
    }
    public void remove(Inventory item){
        items.remove(item);
    }
    public List<Inventory> getItems(){
        return Collections.unmodifiableList(items);
    }
}
