import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RentalServiceImpl implements RentalService {
    private HashMap<String, Vehicle> vehicles;

    public RentalServiceImpl() {
        vehicles = new HashMap<>();
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getId(), vehicle);
    }

    @Override
    public Vehicle getVehicle(String id) {
        return vehicles.get(id);
    }

    @Override
    public void rentVehicle(String id) {
        Vehicle vehicle = getVehicle(id);

        if (vehicle == null) {
            System.out.println("Vozidlo s ID " + id + " nebylo nalezeno.");
            return;
        }

        if (!vehicle.isAvailable()) {
            System.out.println("Vozidlo " + id + " už je zapůjčené.");
            return;
        }

        vehicle.rent();
        System.out.println("Vozidlo " + id + " bylo zapůjčeno.");
    }

    @Override
    public void returnVehicle(String id) {
        Vehicle vehicle = getVehicle(id);

        if (vehicle == null) {
            System.out.println("Vozidlo s ID " + id + " nebylo nalezeno.");
            return;
        }

        if (vehicle.isAvailable()) {
            System.out.println("Vozidlo " + id + " už je dostupné.");
            return;
        }

        vehicle.returnVehicle();
        System.out.println("Vozidlo " + id + " bylo vráceno.");
    }

    @Override
    public double calculateCharge(String id, int days) {
        Vehicle vehicle = getVehicle(id);

        if (vehicle == null) {
            return 0;
        }

        if (vehicle instanceof Car) {
            return ((Car) vehicle).calculateCharge(days);
        }

        if (vehicle instanceof Van) {
            return ((Van) vehicle).calculateCharge(days);
        }

        if (vehicle instanceof Bike) {
            return ((Bike) vehicle).calculateCharge(days);
        }

        return vehicle.getDailyRate() * days;
    }

    @Override
    public List<Vehicle> findByType(String type) {
        List<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : vehicles.values()) {
            if (vehicle.getType().equalsIgnoreCase(type)) {
                result.add(vehicle);
            }
        }

        return result;
    }

    @Override
    public List<Vehicle> findAvailableVehicles() {
        List<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : vehicles.values()) {
            if (vehicle.isAvailable()) {
                result.add(vehicle);
            }
        }

        return result;
    }

    @Override
    public void printAllVehicles() {
        for (Vehicle vehicle : vehicles.values()) {
        System.out.println(vehicle.getDetails());
        }

    }
}