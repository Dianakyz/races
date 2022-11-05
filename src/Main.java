import cars.*;
import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;

public class Main {
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7f, TypeOfBody.SEDAN);
        System.out.println(lada);
        lada.pitStop();
        lada.bestTimeRound();
        lada.maxSpeed();
        PassengerCar kia = new PassengerCar("KIA", "Rio", 2.7, TypeOfBody.SEDAN);
        System.out.println(kia);
        kia.pitStop();
        kia.bestTimeRound();
        kia.maxSpeed();
        PassengerCar bmw = new PassengerCar("BMW", "Q8", 3.0, TypeOfBody.CROSSOVER);
        System.out.println(bmw);
        bmw.pitStop();
        bmw.bestTimeRound();
        bmw.maxSpeed();
        PassengerCar mazda = new PassengerCar("Mazda", "6", 2.4, null);
        System.out.println(mazda);
        mazda.pitStop();
        mazda.bestTimeRound();
        mazda.maxSpeed();

        Trucks kamaz = new Trucks("КАМАЗ", "4208-A3", 2.7, Weight.N1);
        System.out.println(kamaz);
        kamaz.pitStop();
        kamaz.bestTimeRound();
        kamaz.maxSpeed();
        Trucks hyundai = new Trucks("Huyndai", "HD 170", 2.0, Weight.N2);
        System.out.println(hyundai);
        hyundai.pitStop();
        hyundai.bestTimeRound();
        hyundai.maxSpeed();
        Trucks gaz = new Trucks("ГАЗ", "33081", 2.0, Weight.N3);
        System.out.println(gaz);
        gaz.pitStop();
        gaz.bestTimeRound();
        gaz.maxSpeed();
        Trucks howo = new Trucks("HOWO", "ZZ3167", 2.7, Weight.N2);
        System.out.println(howo);
        howo.pitStop();
        howo.bestTimeRound();
        howo.maxSpeed();

        Bus daewoo = new Bus("Daewoo", "BS090", 2.4, Capacity.SMALL);
        System.out.println(daewoo);
        daewoo.pitStop();
        daewoo.bestTimeRound();
        daewoo.maxSpeed();
        Bus baw = new Bus("BAW", "Street Line", 2.4, Capacity.MEDIUM);
        System.out.println(baw);
        baw.pitStop();
        baw.bestTimeRound();
        baw.maxSpeed();
        Bus lotos = new Bus("Lotos", "206", 2.4, Capacity.EXTRA_LARGE);
        System.out.println(lotos);
        lotos.pitStop();
        lotos.bestTimeRound();
        lotos.maxSpeed();
        Bus scania = new Bus("Scania", "A80", 2.4, Capacity.LARGE);
        System.out.println(scania);
        scania.pitStop();
        scania.bestTimeRound();
        scania.maxSpeed();

        DriverB alex = new DriverB("Alex", "Yes", 5, "B");
        alex.driveCar(kia);

        DriverC max = new DriverC("Max", "Yes", 10, "C");
        max.driveCar(kamaz);

        DriverD dan = new DriverD("Dan", "Yes", 8, "D");
        dan.driveCar(scania);

        kia.printType();
        mazda.printType();
        scania.printType();
        kamaz.printType();

        service(kia, lada, bmw, mazda,
                kamaz, hyundai, gaz, howo,
                daewoo, baw, lotos, scania);
    }

    private static void service(Car... cars) {
        for (Car car : cars) {
                serviceCar(car);
            }
        }


    private static void  serviceCar (Car car) {
        try {
            if (!car.service()) {
                throw new RuntimeException("Автомобиль " + car.getBrand() + " " + car.getModel() + " не прошел диагностику!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}