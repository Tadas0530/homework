package Homework20201214.Deliveries;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Courier courier1 = new Courier("Petras", "Varle",       // Couriers
                LocalDate.of(2020, 12, 25));

        Gadget loptop = new Gadget(GadgetType.LAPTOP, 555.5, courier1);     // Gadgets
        Gadget tv = new Gadget(GadgetType.TV, 799.99, courier1);
        Gadget phone = new Gadget(GadgetType.PHONE, 599.99, courier1);
        Gadget microController = new Gadget(GadgetType.MICRO_CONTROLLER, 199.99, courier1);
        Gadget personal_Computer = new Gadget(GadgetType.PERSONAL_COMPUTER, 1200.99, courier1);

        Company varle = new Company("Varle", "Kaunas", loptop);                // Companies
        Company kilobaitas = new Company("Varle", "Klaipeda", phone);
        Company skytech = new Company("Varle", "Vilnius", microController);
        Company lemona = new Company("Varle", "Plunge", personal_Computer);

                                    // Inicializuojami 3 person objektai

        Person person1 = new Person("Tadas", "Klaipedos g.", GadgetType.LAPTOP, // People
                LocalDate.of(2020, 12, 24));

        person1.addGadget(loptop);
        person1.addGadget(tv);


        Person person2 = new Person("Justas", "Zemaiciu g.", GadgetType.PHONE,
                LocalDate.of(2020, 12, 28));

        person1.addGadget(tv);
        person1.addGadget(phone);


        Person person3 = new Person("Rokas", "Vilnius", GadgetType.TV,
                LocalDate.of(2020, 12, 23));

        person1.addGadget(microController);
        person1.addGadget(personal_Computer);

                                    // Brangiausias company gadget

        Calculations.printMostExpensiveGadget();

                                    // zmones kurie gaus siunta laiku

        Calculations.printPeopleWhoseDeliveryOnTime();
    }
}

