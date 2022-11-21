package Other;

import Transports.Transport;

public class Mechanic <T extends Transport>{

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public boolean doMaintenance(T transport) {
        return transport.checkDiagnostics();
    }

    public void repairTransport(T transport) {
        System.out.println("Траспорт " + transport.getBrand() + " " + transport.getModel() + " отремонтирован");
        transport.setDiagnosticsPassed(true);
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик: " + name +
                ", компания " + company;
    }
}
