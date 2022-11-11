package drivers;

import cars.Bus;

public class DriverD extends Driver<Bus> {

    public DriverD(String fullName, String license, int experience, String category) {
        super(fullName, license, experience, category);
    }

    @Override
    public void driveCar(Bus car) {
        System.out.println("Водитель: " + getFullName()  + ". Наличие прав: " + getLicense() + ". Категория прав: " + getCategory() +  ". Водит автобус " + car.getBrand() + " " + car.getModel());
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
