package Homework20201214.Deliveries;

import java.util.ArrayList;
import java.util.List;

public class Calculations {
    private static List<Company> companyList = new ArrayList<>();
    private static List<Person> personList = new ArrayList<>();
    private static List<Courier> courierList = new ArrayList<>();

    public static void addGadget(Company company) {
        companyList.add(company);
    }

    public static void addCourier(Courier courier) {
        courierList.add(courier);
    }

    public static void addPerson(Person person) {
        personList.add(person);
    }

    public static void printMostExpensiveGadget() {
        double biggestSum = 0;
        String companyName = null;
        String gadget = null;
        for (Company company : companyList) {
            if(biggestSum < company.getGadget().getPrice()) {
                biggestSum = company.getGadget().getPrice();
                companyName = company.getName();
                gadget = company.getGadget().getGadgetType().toString();
            }
        }
        System.out.println("Most expensive gadget is " + gadget + " on " + companyName + ".lt " + "priced at : " +
                  biggestSum + "Eur.");
    }

    public static void printPeopleWhoseDeliveryOnTime() {
        for (Person person : personList) {
            if(person.getDeliverUntil().isAfter(companyList.get(0).getGadget().getCourier().getDeliveryDate())) {
                System.out.println(person.getName() + " will get his delivery on time.\n" +
                        "Deliver until: " + person.getDeliverUntil() + ".\n" +
                        "Courier " + courierList.get(0).getName() + " will deliver on " +
                        courierList.get(0).getDeliveryDate() + ".");
            }

        }
    }
}
