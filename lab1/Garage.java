package lab1;

import java.util.ArrayList;
import java.util.List;

class Garage {
    private String name;
    private List<Vehicle> vehicles = new ArrayList<>();

    public Garage(String name) {
        this.name = name;
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void removeVehicle(Vehicle v) {
        vehicles.remove(v);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public String getName() {
        return name;
    }
}

class Fleet {
    private List<Garage> garages = new ArrayList<>();

    public void addGarage(Garage g) {
        garages.add(g);
    }

    public void removeGarage(Garage g) {
        garages.remove(g);
    }

    public void findVehicle(String brand) {
        System.out.println("Поиск транспорта марки " + brand + ":");
        for (Garage g : garages) {
            for (Vehicle v : g.getVehicles()) {
                if (v.getInfo().contains(brand)) {
                    System.out.println("- Найдено в '" + g.getName() + "': " + v.getInfo());
                }
            }
        }
    }
}