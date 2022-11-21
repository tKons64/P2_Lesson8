package Driver;

import Transports.Transport;

public abstract class Driver<T extends Transport>{

    private String fullName;

    private String categoryDrivingLicense;

    private int experienceYears;

    private T transport;

    public Driver(String fullName, String categoryDrivingLicense,  int experienceYears, T transport) {
        this.fullName = fullName;
        this.experienceYears = experienceYears;
        this.transport = transport;
        this.categoryDrivingLicense = categoryDrivingLicense;
    }

    public String getName() {
        return fullName;
    }

    public String getDrivingLicense() {
        return categoryDrivingLicense;
    }

    public int getExperience() {
        return experienceYears;
    }

    public void setExperience(int experience) {
        this.experienceYears = experience;
    }

    public T getTransport() {
        return transport;
    }


    @Override
    public String toString() {
        return "Водитель " + getName() +
                " категории *" + getDrivingLicense() + "*" +
                " управляет автомобилем " +
                getTransport().toString() +
                " и будет участвовать в заезде";
    }
}
