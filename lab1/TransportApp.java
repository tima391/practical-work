package lab1;

public class TransportApp {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022, 4, "Auto");
        Motorcycle moto1 = new Motorcycle("BMW", "S1000RR", 2023, "Sport", false);

        Garage cityGarage = new Garage("Центральный гараж");
        cityGarage.addVehicle(car1);
        cityGarage.addVehicle(moto1);

        Fleet myFleet = new Fleet();
        myFleet.addGarage(cityGarage);

        car1.startEngine();
        myFleet.findVehicle("BMW");

        cityGarage.removeVehicle(moto1);
        System.out.println("После удаления мотоцикла:");
        myFleet.findVehicle("BMW");
    }
}