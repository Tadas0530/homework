package Homework20201214.Deliveries;

public class Company {
    private String name;
    private String address;
    private Gadget gadget;

    public Company(String name, String address, Gadget gadget) {
        this.name = name;
        this.address = address;
        this.gadget = gadget;
        Calculations.addGadget(this);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Gadget getGadget() {
        return gadget;
    }
}
