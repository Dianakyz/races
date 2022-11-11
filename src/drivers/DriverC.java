package drivers;

import cars.Trucks;

public class DriverC extends Driver<Trucks> {

    public DriverC(String fullName, String license, int experience, String category) {
        super(fullName, license, experience, category);
    }

    @Override
    public void driveCar(Trucks car) {
        System.out.println("Водитель " + getFullName()  + ". Наличие прав: " + getLicense() + ". Категория прав: " + getCategory() +  ". Водит грузовую машину " + car.getBrand() + " " + car.getModel());
    }

    @Override
    public void startMove() {
        System.out.println("Сажусь в грузовую машину и начинаю движение.");
    }

    @Override
    public void stopMove() {
        System.out.println("Останавливаю грузовую машину.");
    }

    @Override
    public void refuel() {
        System.out.println("Заправляю грузовую машину.");
    }
}
