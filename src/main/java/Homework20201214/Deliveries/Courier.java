package Homework20201214.Deliveries;

import java.time.LocalDate;

public class Courier {

    private String name;
    private String deliveredFrom;
    private LocalDate deliveryDate;

    public Courier(String name, String deliveredFrom, LocalDate deliveryDate) {
        this.name = name;
        this.deliveredFrom = deliveredFrom;
        this.deliveryDate = deliveryDate;
        Calculations.addCourier(this);
    }

    public String getName() {
        return name;
    }

    public String getDeliveredFrom() {
        return deliveredFrom;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}
