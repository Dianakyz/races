package drivers;

import cars.Car;
import validationUtils.ValidationUtils;

import java.util.Objects;

public abstract class Driver <T extends Car> {

    private final String fullName;
    private final String license;
    private int experience;
    private String category;

    public Driver(String fullName, String license, int experience, String category) {
        this.fullName = ValidationUtils.validOrDefault(fullName, "информация не указана");
        this.license = ValidationUtils.validOrDefault(license, "информация не указана");
        setExperience(experience);
        setCategory(category);
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

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        } else {
            this.category = category;
        }
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void refuel();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return fullName.equals(driver.fullName) && license.equals(driver.license) && category.equals(driver.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, license, category);
    }
}
