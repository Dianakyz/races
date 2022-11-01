package cars;
import validationUtils.ValidationUtils;

public abstract class Car {

    private final String brand;
    private final String model;
    private double engineVolume;

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

    public abstract void start();

    public abstract void finish();

    public abstract void printType();
}
