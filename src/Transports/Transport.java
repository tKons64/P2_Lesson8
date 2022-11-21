package Transports;

import Driver.Driver;
import Other.Mechanic;
import Other.Sponsor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport{
    private String brand;
    private String model;
    private float engineVolume;

    private boolean diagnosticsPassed;

    private Driver<?> driver;

    private List<Mechanic<?>> mechanics = new ArrayList<>();

    private List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    private boolean parameterIsNotCorrect(String parametr) {
        return (parametr == null || parametr.isEmpty() || parametr.isBlank());
    }

    public void startMoving() {
        System.out.printf("Авто %s %s стартовало", getModel(), getBrand());
    }

    public void finishMoving() {
        System.out.printf("Авто %s %s закончило движение", getModel(), getBrand());
    }

    protected void addDriver(Driver<?> driver) {
        this.driver = driver;
    }

    public void addMechanics(Mechanic<?>... mechanic) {
        this.mechanics.addAll(Arrays.asList(mechanic));
    }

    public void addSponsors(Sponsor... sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }

    public boolean checkDiagnostics() {
        return this.getDiagnosticsPassed();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        if (parameterIsNotCorrect(brand)) {
            this.brand = "default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        if (parameterIsNotCorrect(model)) {
            this.model = "default";
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public boolean getDiagnosticsPassed() {
        return diagnosticsPassed;
    }

    public void setDiagnosticsPassed(boolean diagnosticsPassed) {
        this.diagnosticsPassed = diagnosticsPassed;
    }

    public Driver<?> getDriver() {
        return driver;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel();
    }
}