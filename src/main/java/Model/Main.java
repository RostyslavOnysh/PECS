package Model;

import Model.Planes.CargoPlane;
import Model.Planes.MilitaryPlane;
import Model.Planes.PassangerPlane;
import Model.Planes.Plane;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // PECS - Producer Extends Consumer Super

    /*
    застосовуєтся в основному при роботі з колекціями
     */
    public static void main(String[] args) {
        MilitaryPlane militaryPlane1 = new MilitaryPlane("Military Boeing - 1", "A123");
        MilitaryPlane militaryPlane2 = new MilitaryPlane("Military Boeing - 2", "A321");
        MilitaryPlane militaryPlane3 = new MilitaryPlane("Military Boeing - 3", "A777");

        militaryPlane1.setCountry("Ukraine");
        militaryPlane2.setCountry("USA");
        militaryPlane3.setCountry("France");

        CargoPlane cargoPlane1 = new CargoPlane("Cargo Plane - 1", "C111", 2018);
        CargoPlane cargoPlane2 = new CargoPlane("Cargo Plane - 2", "C121", 2019);
        CargoPlane cargoPlane3 = new CargoPlane("Cargo Plane - 3", "C120", 2020);

        cargoPlane1.setMaxWeight(100.0);
        cargoPlane2.setMaxWeight(150.0);
        cargoPlane3.setMaxWeight(190.0);

        PassangerPlane passangerPlane1 = new PassangerPlane("Passanger plane - 1", "P321", 2008);
        PassangerPlane passangerPlane2 = new PassangerPlane("Passanger plane - 2", "P433", 2013);
        PassangerPlane passangerPlane3 = new PassangerPlane("Passanger plane - 3", "P022", 2022);

        passangerPlane1.setCapacity(77);
        passangerPlane2.setCapacity(129);
        passangerPlane3.setCapacity(345);

        List<MilitaryPlane> mp = List.of(militaryPlane1, militaryPlane2, militaryPlane3);
        List<CargoPlane> cp = List.of(cargoPlane1, cargoPlane2, cargoPlane3);
        List<PassangerPlane> pp = List.of(passangerPlane1, passangerPlane2, passangerPlane3);

        getAverageYear(mp);
        getAverageYear(cp);
        getAverageYear(pp);

    }

    public static double getAverageYear(List<? extends Plane> planes) {   // List <? extends Plane> ----> пряме використання covariant
        if (planes.isEmpty()) {
            return 0;
        }
        int yearSum = 0;
        for (Plane plane : planes) {
            yearSum += plane.getYear();
        }
        return (double) yearSum / planes.size();
    }
}

/*
В данному коді ми розглядаємо Producer extends

список наших підтипів не являєтся тим самим що і список наших типів тому потрібно досягати коваріантності
считування інфи то продюсер
 */