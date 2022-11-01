package drivers;

import cars.Car;
import validationUtils.ValidationUtils;

public abstract class Driver <T extends Car> {

    private final String fullName;
    private final String license;
    private int experience;

    public Driver(String fullName, String license, int experience) {
        this.fullName = ValidationUtils.validOrDefault(fullName, "информация не указана");
        this.license = ValidationUtils.validOrDefault(license, "информация не указана");
        setExperience(experience);
    }

    public abstract void driveCar(T car);


    public String getFullName() {
        return fullName;
    }

    public String getLicense() {
        return license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if(experience <= 0){
            System.out.print("Указано некорреткное значение");
        } else {
            this.experience = experience;
        }
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void refuel();
}
