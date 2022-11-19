package cars;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import validationUtils.ValidationUtils;

import java.sql.Driver;
import java.util.*;

public abstract class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private final Set<DriverB> driverBs = new HashSet<>();
    private final Set<DriverC> driverCs = new HashSet<>();
    private final Set<DriverD> driverDs = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

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

    public Set<DriverB> getDriverBs() {
        return driverBs;
    }

    public Set<DriverC> getDriverCs() {
        return driverCs;
    }

    public Set<DriverD> getDriverDs() {
        return driverDs;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void start();

    public abstract void finish();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && brand.equals(car.brand) && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
}
