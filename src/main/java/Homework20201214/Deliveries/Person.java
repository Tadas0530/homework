package Homework20201214.Deliveries;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private String deliveryAddress;
    private GadgetType gadgetType;
    private LocalDate deliverUntil;
    private Set<Gadget> gadgets = new HashSet<>();


    public Person(String name, String deliveryAddress, GadgetType gadgetType, LocalDate deliverUntil) {
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.gadgetType = gadgetType;
        this.deliverUntil = deliverUntil;
        Calculations.addPerson(this);
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public GadgetType getGadgetType() {
        return gadgetType;
    }

    public LocalDate getDeliverUntil() {
        return deliverUntil;
    }

    public Set<Gadget> getGadgets() {
        return gadgets;
    }

    public void addGadget(Gadget gadget) {
        gadgets.add(gadget);
    }
}
