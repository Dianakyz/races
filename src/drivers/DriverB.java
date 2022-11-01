package drivers;

import cars.PassengerCar;

public class DriverB extends Driver<PassengerCar> {

    public DriverB(String fullName, String license, int experience) {
        super(fullName, license, experience);
    }

    @Override
    public void driveCar(PassengerCar car) {
        System.out.println("Водитель " + getFullName() + " водит легковую машину " + car.getBrand() + " " + car.getModel());
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
