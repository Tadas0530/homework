package Homework20201214.Company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String address;
    private ProductionType productionType;
    private List<Device> deviceList = new ArrayList<>();

    public Company(String name, String address, ProductionType productionType) {
        this.name = name;
        this.address = address;
        this.productionType = productionType;
        CompanyMain.companyList.add(this);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ProductionType getProductionType() {
        return productionType;
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public void addDevice(Device device) {
        deviceList.add(device);
    }
}
