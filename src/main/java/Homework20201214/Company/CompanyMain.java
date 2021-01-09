package Homework20201214.Company;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    static List<Company> companyList = new ArrayList<>();
    public static void main(String[] args) {
        Company tesla = new Company("Tesla", "California", ProductionType.AUTOMOBILES);
        tesla.addDevice(new Device("Roadster", 55000d, 50, "Car"));
        tesla.addDevice(new Device("Cybertruck", 75000d, 30, "Truck"));

        printMostExpensiveDevice(tesla);

        Company sony = new Company("Sony", "Tokyo", ProductionType.TECHNOLOGIES);
        sony.addDevice(new Device("TV", 1500d, 200, "A TV"));
        sony.addDevice(new Device("Phone", 500d, 500, "A phone"));
        sony.addDevice(new Device("Speaker", 150d, 2000, "A speaker"));

        printMostExpensiveDevice(sony);

        Company gardenTools = new Company("Garden tools", "London", ProductionType.GARDEN_TOOLS);
        gardenTools.addDevice(new Device("Chainsaw", 450d, 2500, "A chainsaw"));
        gardenTools.addDevice(new Device("Lawn mower", 700d, 1500, "A lawn mower"));

        printMostExpensiveDevice(gardenTools);

        Company walmart = new Company("Walmart", "USA", ProductionType.FOOD);
        walmart.addDevice(new Device("Microwave", 100d, 3000, "a microwave"));
        walmart.addDevice(new Device("Grill", 600d, 150, "A grill"));
        walmart.addDevice(new Device("Frying pan", 50d, 5000, "A frying pan"));

        printMostExpensiveDevice(walmart);

        Company theBoringCompany = new Company("The boring company", "California", ProductionType.TECHNOLOGIES);
        theBoringCompany.addDevice(new Device("Flamethrower", 7000d, 2050, "A flamethrower"));
        theBoringCompany.addDevice(new Device("Tunnel", 350000d, 10, "Dig a tunnel"));

        printMostExpensiveDevice(theBoringCompany);

        printTechnologyTypeCompanies();
    }

    public static void printMostExpensiveDevice(Company company) {
        double price = 0;
        String name = null;
        for (int i = 0; i < company.getDeviceList().size(); i++) {
            if (price < company.getDeviceList().listIterator(i).next().getPrice()) {
                price = company.getDeviceList().listIterator(i).next().getPrice();
                name = company.getDeviceList().listIterator(i).next().getName();
            }
        }
        System.out.println(company.getName() + "'s most expensive device is " + name + " priced at " + price + " Euros.");
    }

    public static void printTechnologyTypeCompanies() {
        for(int i = 0; i < companyList.size(); i++) {
            if(companyList.listIterator(i).next().getProductionType().equals(ProductionType.TECHNOLOGIES)) {
                System.out.println(companyList.listIterator(i).next().getName());
            }
        }
    }
}