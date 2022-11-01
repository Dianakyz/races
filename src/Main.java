import cars.Bus;
import cars.PassengerCar;
import cars.Trucks;
import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;

public class Main {
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7f);
        System.out.println(lada);
        lada.pitStop();
        lada.bestTimeRound();
        lada.maxSpeed();
        PassengerCar kia = new PassengerCar("KIA", "Rio", 2.7);
        System.out.println(kia);
        kia.pitStop();
        kia.bestTimeRound();
        kia.maxSpeed();
        PassengerCar bmw = new PassengerCar("BMW", "Q8", 3.0);
        System.out.println(bmw);
        bmw.pitStop();
        bmw.bestTimeRound();
        bmw.maxSpeed();
        PassengerCar mazda = new PassengerCar("Mazda", "6", 2.4);
        System.out.println(mazda);
        mazda.pitStop();
        mazda.bestTimeRound();
        mazda.maxSpeed();

        Trucks kamaz = new Trucks("КАМАЗ", "4208-A3", 2.7);
        System.out.println(kamaz);
        kamaz.pitStop();
        kamaz.bestTimeRound();
        kamaz.maxSpeed();
        Trucks hyundai = new Trucks("Huyndai", "HD 170", 2.0);
        System.out.println(hyundai);
        hyundai.pitStop();
        hyundai.bestTimeRound();
        hyundai.maxSpeed();
        Trucks gaz = new Trucks("ГАЗ", "33081", 2.0);
        System.out.println(gaz);
        gaz.pitStop();
        gaz.bestTimeRound();
        gaz.maxSpeed();
        Trucks howo = new Trucks("HOWO", "ZZ3167", 2.7);
        System.out.println(howo);
        howo.pitStop();
        howo.bestTimeRound();
        howo.maxSpeed();

        Bus daewoo = new Bus("Daewoo", "BS090", 2.4);
        System.out.println(daewoo);
        daewoo.pitStop();
        daewoo.bestTimeRound();
        daewoo.maxSpeed();
        Bus baw = new Bus("BAW", "Street Line", 2.4);
        System.out.println(baw);
        baw.pitStop();
        baw.bestTimeRound();
        baw.maxSpeed();
        Bus lotos = new Bus("Lotos", "206", 2.4);
        System.out.println(lotos);
        lotos.pitStop();
        lotos.bestTimeRound();
        lotos.maxSpeed();
        Bus scania = new Bus("Scania", "A80", 2.4);
        System.out.println(scania);
        scania.pitStop();
        scania.bestTimeRound();
        scania.maxSpeed();

        DriverB alex = new DriverB("Alex", "Yes", 5);
        alex.driveCar(kia);

        DriverC max = new DriverC("Max", "Yes", 10);
        max.driveCar(kamaz);

        DriverD dan = new DriverD("Dan", "Yes", 8);
        dan.driveCar(scania);




    }
}