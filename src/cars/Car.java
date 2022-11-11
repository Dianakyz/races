package cars;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import validationUtils.ValidationUtils;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private final List<DriverB> driverBs = new ArrayList<>();
    private final List<DriverC> driverCs = new ArrayList<>();
    private final List<DriverD> driverDs = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Car(String brand, String model, double engineVolume) {
        this.brand = ValidationUtils.validOrDefault(brand, "информация не указана");
        this.model = ValidationUtils.validOrDefault(model, "информация не указана");
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(Double.compare(engineVolume,0) == 0){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void addDriverB (DriverB... driverBs) {
        this.driverBs.addAll(Arrays.asList((driverBs)));
    }

    public void addDriverC (DriverC... driverCs) {
        this.driverCs.addAll(Arrays.asList((driverCs)));
    }

    public void addDriverD (DriverD... driverDs) {
        this.driverDs.addAll(Arrays.asList((driverDs)));
    }

    public void addSponsor (Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public void addMechanic (Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public List<DriverB> getDriverBs() {
        return driverBs;
    }

    public List<DriverC> getDriverCs() {
        return driverCs;
    }

    public List<DriverD> getDriverDs() {
        return driverDs;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void start();

    public abstract void finish();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();
}
