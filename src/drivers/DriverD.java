package drivers;

import cars.Bus;

public class DriverD extends Driver<Bus> {

    public DriverD(String fullName, String license, int experience) {
        super(fullName, license, experience);
    }

    @Override
    public void driveCar(Bus car) {
        System.out.println("Водитель " + getFullName() + " водит автобус " + car.getBrand() + " " + car.getModel());
    }

    @Override
    public void startMove() {
        System.out.println("Сажусь в автобус и начинаю движение.");
    }

    @Override
    public void stopMove() {
        System.out.println("Останавливаю автобус.");
    }

    @Override
    public void refuel() {
        System.out.println("Заправляю автобус.");
    }
}
