package drivers;

import cars.PassengerCar;

public class DriverB extends Driver<PassengerCar> {

    public DriverB(String fullName, String license, int experience, String category) {
        super(fullName, license, experience, category);
    }

    @Override
    public void driveCar(PassengerCar car) {
        System.out.println("Водитель " + getFullName() + ". Наличие прав: " + getLicense() + ". Категория прав: " + getCategory() + ". Водит легковую машину " + car.getBrand() + " " + car.getModel());
    }

    @Override
    public void startMove() {
        System.out.println("Сажусь в легковую машину и начинаю движение.");
    }

    @Override
    public void stopMove() {
        System.out.println("Останавливаю легковую машину.");
    }

    @Override
    public void refuel() {
        System.out.println("Заправляю легковую машину.");
    }
}
