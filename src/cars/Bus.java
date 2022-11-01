package cars;

import cars.Car;

public class Bus extends Car implements Competing {

    public Bus(String brand, String model, double engineVolume) {
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
        System.out.println("Информация по заправке: автобус можно заправлять бензином или дизелем на заправке.");
    }

    @Override
    public void bestTimeRound() {
        System.out.println("Лучшее время круга: ... ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 180 км/ч");
    }

    public String toString() {
        return "Информация по автобусу: Бренд: " + getBrand() + ". Модель: " + getModel() + ".Объем двигателя: " + getEngineVolume() + " л.";
    }
}
