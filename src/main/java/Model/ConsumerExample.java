package Model;

import Model.Planes.CargoPlane;
import Model.Planes.Plane;

import java.util.ArrayList;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        List<CargoPlane> cargoPlanes = getCargoPlanes();
        List<Plane> planes = getPlanes();

        CargoPlane cargoPlane = new CargoPlane("Airbus", "A320");

        fillCargo(cargoPlanes, cargoPlane);
        // для компіляції данного коду нам потрібно щоб наш код став контрваріантним
        //для цього в методі fillCargo я використаю wildcard super
        fillCargo(planes, cargoPlane);

        List<? super CargoPlane> superPlanes = new ArrayList<>();
      //  superPlanes.add(new CargoPlane());
    }

    /*
    Що детально відбуваєтся під капотом коли ми працюємо з колекцією параметризованою
    wildcard suoer
     */



    public static void fillCargo(List<? super CargoPlane> planes, CargoPlane plane) { // чому так ?
        int size = planes.size();                        // колекція planes являєтся Consumer
        for (int i = 0; i < size; i++) {
            planes.add(i, plane);    // ми вкиклакаемо метод add та  додаємо певні значення
        }
    }

    public static List<CargoPlane> getCargoPlanes() {
        List<CargoPlane> cargoPlanes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cargoPlanes.add(null);
        }
        return cargoPlanes;
    }

    public static List<Plane> getPlanes() {
        List<Plane> cargoPlanes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cargoPlanes.add(null);
        }
        return cargoPlanes;
    }

}
