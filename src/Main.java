import cars.*;
import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic<Car> petr = new Mechanic<>("Петр","Иванов","ООО Машинки рулят");
        Mechanic<Car> sasha = new Mechanic<>("Александр","Александров","Лукойл");
        Mechanic<Car> fedor = new Mechanic<>("Федор","Величко","Шиномонтаж у Феди");
        Mechanic<Car> pasha = new Mechanic<>("Павел","Федоров","ГлобалТайм");
        Mechanic<Car> lena = new Mechanic<>("Елена","Петровна","Жена на час");

        Sponsor luk = new Sponsor("Лукойл",150_000);
        Sponsor gazprom = new Sponsor("Газпром",200_000);
        Sponsor tinkoff = new Sponsor("Тинькофф",80_000);
        Sponsor sber = new Sponsor("Сбербанк",100_000);
        Sponsor samokat = new Sponsor("Самокат",20_000);

        DriverB sany = new DriverB("Сашка Серый", "Да", 35, "B");
        DriverB dimas = new DriverB("Дмитрий Разин", "Да", 15, "B");
        DriverB nikita = new DriverB("Никита Резкий", "Да", 7, "B");
        DriverC toly = new DriverC("Анатлоий", "Да", 7, "С");
        DriverD demid = new DriverD("Демид", "Да", 10, "D");

        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7f, TypeOfBody.SEDAN);
//        System.out.println(lada);
//        lada.pitStop();
//        lada.bestTimeRound();
//        lada.maxSpeed();
        lada.addDriverB(sany);
        lada.addMechanic(petr, lena);
        lada.addSponsor(samokat);

        PassengerCar kia = new PassengerCar("KIA", "Rio", 2.7, TypeOfBody.SEDAN);
//        System.out.println(kia);
//        kia.pitStop();
//        kia.bestTimeRound();
//        kia.maxSpeed();
        kia.addDriverB(dimas);
        kia.addMechanic(sasha);
        kia.addSponsor(tinkoff);

        PassengerCar bmw = new PassengerCar("BMW", "Q8", 3.0, TypeOfBody.CROSSOVER);
//        System.out.println(bmw);
//        bmw.pitStop();
//        bmw.bestTimeRound();
//        bmw.maxSpeed();
        bmw.addDriverB(nikita);
        bmw.addMechanic(lena);
        bmw.addSponsor(gazprom);

//        PassengerCar mazda = new PassengerCar("Mazda", "6", 2.4, null);
//        System.out.println(mazda);
//        mazda.pitStop();
//        mazda.bestTimeRound();
//        mazda.maxSpeed();

        Trucks kamaz = new Trucks("КАМАЗ", "4208-A3", 2.7, Weight.N1);
//        System.out.println(kamaz);
//        kamaz.pitStop();
//        kamaz.bestTimeRound();
//        kamaz.maxSpeed();
        kamaz.addDriverC(toly);
        kamaz.addMechanic(fedor);
        kamaz.addSponsor(gazprom, sber);

//        Trucks hyundai = new Trucks("Huyndai", "HD 170", 2.0, Weight.N2);
//        System.out.println(hyundai);
//        hyundai.pitStop();
//        hyundai.bestTimeRound();
//        hyundai.maxSpeed();
//        Trucks gaz = new Trucks("ГАЗ", "33081", 2.0, Weight.N3);
//        System.out.println(gaz);
//        gaz.pitStop();
//        gaz.bestTimeRound();
//        gaz.maxSpeed();
//        Trucks howo = new Trucks("HOWO", "ZZ3167", 2.7, Weight.N2);
//        System.out.println(howo);
//        howo.pitStop();
//        howo.bestTimeRound();
//        howo.maxSpeed();

        Bus daewoo = new Bus("Daewoo", "BS090", 2.4, Capacity.SMALL);
//        System.out.println(daewoo);
//        daewoo.pitStop();
//        daewoo.bestTimeRound();
//        daewoo.maxSpeed();
        daewoo.addDriverD(demid);
        daewoo.addMechanic(pasha);
        daewoo.addSponsor(luk);

//        Bus baw = new Bus("BAW", "Street Line", 2.4, Capacity.MEDIUM);
//        System.out.println(baw);
//        baw.pitStop();
//        baw.bestTimeRound();
//        baw.maxSpeed();
//        Bus lotos = new Bus("Lotos", "206", 2.4, Capacity.EXTRA_LARGE);
//        System.out.println(lotos);
//        lotos.pitStop();
//        lotos.bestTimeRound();
//        lotos.maxSpeed();
//        Bus scania = new Bus("Scania", "A80", 2.4, Capacity.LARGE);
//        System.out.println(scania);
//        scania.pitStop();
//        scania.bestTimeRound();
//        scania.maxSpeed();

//        kia.printType();
//        mazda.printType();
//        scania.printType();
//        kamaz.printType();
//
//        service(kia, lada, bmw, mazda,
//                kamaz, hyundai, gaz, howo,
//                daewoo, baw, lotos, scania);

        List<Car> cars = List.of(lada, kia, bmw,
                kamaz, daewoo);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addPassengerCar(lada);
        serviceStation.addPassengerCar(kia);
        serviceStation.addPassengerCar(bmw);
        serviceStation.addTruck(kamaz);
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();

        for (Car car: cars) {
            printInfoAll(car);
        }
    }

    private static void printInfoAll(Car car) {
        System.out.println("Информация по автомобилю: " + car.getBrand() + " " + car.getModel());
        System.out.println("Водитель: ");
        for (DriverB driverB: car.getDriverBs()) {
            System.out.println(driverB.getFullName());
        }
        for (DriverC driverC: car.getDriverCs()) {
            System.out.println(driverC.getFullName());
        }
        for (DriverD driverD: car.getDriverDs()) {
            System.out.println(driverD.getFullName());
        }

        System.out.println("Механики: ");
        for (Mechanic<?> mechanic: car.getMechanics()) {
            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + " из компании " + mechanic.getCompany());
        }

        System.out.println("Спонсоры и их пожертвования: ");
        for (Sponsor sponsor: car.getSponsors()) {
            System.out.println(sponsor.getName() + ". Сумма: " + sponsor.getAmount());
        }
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