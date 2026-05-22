import java.util.List;

public class Main {
    public static void main(String[] args) {
        RentalService service = new RentalServiceImpl();

        Vehicle car1 = new Car("C001", "Škoda Octavia", 900);
        Vehicle car2 = new Car("C002", "Toyota Corolla", 850);

        Vehicle van1 = new Van("V001", "Ford Transit", 1300, 250);
        Vehicle van2 = new Van("V002", "Mercedes Sprinter", 1600, 300);

        Vehicle bike1 = new Bike("B001", "Author Mountain Bike", 250);
        Vehicle bike2 = new Bike("B002", "Kellys City Bike", 200);

        service.addVehicle(car1);
        service.addVehicle(car2);
        service.addVehicle(van1);
        service.addVehicle(van2);
        service.addVehicle(bike1);
        service.addVehicle(bike2);

        System.out.println("=== SYSTÉM PŮJČOVNY VOZIDEL ===");
        System.out.println();

        System.out.println("=== VŠECHNA VOZIDLA ===");
        service.printAllVehicles();

        System.out.println();
        System.out.println("=== ZAPŮJČENÍ VOZIDEL ===");
        service.rentVehicle("C001");
        service.rentVehicle("V001");
        service.rentVehicle("B001");

        System.out.println();
        System.out.println("=== POKUS O OPAKOVANÉ ZAPŮJČENÍ ===");
        service.rentVehicle("C001");

        System.out.println();
        System.out.println("=== STAV PO ZAPŮJČENÍ ===");
        service.printAllVehicles();

        System.out.println();
        System.out.println("=== VÝPOČET CENY PRONÁJMU ===");
        System.out.println("Cena C001 na 3 dny: " + service.calculateCharge("C001", 3) + " Kč");
        System.out.println("Cena V001 na 3 dny: " + service.calculateCharge("V001", 3) + " Kč");
        System.out.println("Cena B002 na 7 dní: " + service.calculateCharge("B002", 7) + " Kč");

        System.out.println();
        System.out.println("=== FILTR PODLE TYPU: Car ===");

        List<Vehicle> cars = service.findByType("Car");

        for (Vehicle vehicle : cars) {
            System.out.println(vehicle.getDetails());
        }

        System.out.println();
        System.out.println("=== FILTR PODLE TYPU: Bike ===");

        List<Vehicle> bikes = service.findByType("Bike");

        for (Vehicle vehicle : bikes) {
            System.out.println(vehicle.getDetails());
        }

        System.out.println();
        System.out.println("=== DOSTUPNÁ VOZIDLA ===");

        List<Vehicle> availableVehicles = service.findAvailableVehicles();

        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle.getDetails());
        }

        System.out.println();
        System.out.println("=== VRÁCENÍ VOZIDLA ===");
        service.returnVehicle("C001");

        System.out.println();
        System.out.println("=== STAV PO VRÁCENÍ ===");
        service.printAllVehicles();

        System.out.println();
        System.out.println("=== HLEDÁNÍ PODLE ID ===");

        Vehicle found = service.getVehicle("V002");

        if (found != null) {
            System.out.println("Nalezeno: " + found.getDetails());
        } else {
            System.out.println("Vozidlo nebylo nalezeno.");
        }

        Vehicle notFound = service.getVehicle("X999");

        if (notFound != null) {
            System.out.println("Nalezeno: " + notFound.getDetails());
        } else {
            System.out.println("Vozidlo X999 nebylo nalezeno.");
        }
    }
}
