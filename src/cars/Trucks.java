package cars;

import cars.Car;
import cars.Competing;

public class Trucks extends Car implements Competing {

    private Weight weight;

    public Trucks(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void start() {

    }

    @Override
    public void finish() {

    }

    @Override
    public void pitStop() {
        System.out.println("Информация по заправке грузовых автомобилей: можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");

    }

    @Override
    public void bestTimeRound() {
        System.out.println("Лучшее время круга: ... ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 200 км/ч");
    }

    public String toString() {
        return "Информация по грузовому автомобилю: Бренд: " + getBrand() + ". Модель: " + getModel() + ".Объем двигателя: " + getEngineVolume() + " л.";
    }

    public void printType() {
        if (weight == null){
            System.out.println("Данных по грузовому авто недостаточно.");
        } else {
            String from = weight.getFrom() == null ? "" : "от " + weight.getFrom() + " ";
            String to = weight.getTo() == null ? "" : "до " + weight.getTo();
            System.out.println("Грузоподъемность авто: " + from + to + " тонн.");
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }
}
