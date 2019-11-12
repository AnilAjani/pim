package org.improving.pim;

import javax.validation.constraints.NotEmpty;

public class Inventory {
    @NotEmpty (message = "Enter Name")
    private final String name;
    @NotEmpty (message = "Enter Version")
    private final String version;
    @NotEmpty (message = "Enter SKU #")
    private final String SKU;
    @NotEmpty (message = "Enter Brand")
    private final String brand;

    public Inventory(String name, String version, String SKU, String brand) {
        this.name = name;
        this.version = version;
        this.SKU = SKU;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getSKU() {
        return SKU;
    }

    public String getBrand() {
        return brand;
    }
}
