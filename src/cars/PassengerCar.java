package cars;

import cars.Car;
import cars.Competing;

public class PassengerCar extends Car implements Competing {

    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {

    }

    @Override
    public void finish() {

    }

    @Override
    public void pitStop() {
        System.out.println("Информация по заправке легковых автомобилей: можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
    }

    @Override
    public void bestTimeRound() {
        System.out.println("Лучшее время круга: ... ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 300 км/ч");
    }

    public String toString() {
        return "Информация по легковому автомобилю: Бренд: " + getBrand() + ". Модель: " + getModel() + ".Объем двигателя: " + getEngineVolume() + " л.";
    }
}
