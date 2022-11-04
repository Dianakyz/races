package cars;

import cars.Car;

public class Bus extends Car implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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

    public void printType() {
        if (capacity == null){
            System.out.println("Данных по грузовому авто недостаточно.");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " до " + capacity.getTo() + " человек.");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается.");
        return true;
    }
}
