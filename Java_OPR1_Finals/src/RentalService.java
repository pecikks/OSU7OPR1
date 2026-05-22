import java.util.List;

public interface RentalService {
    void addVehicle(Vehicle vehicle);
    Vehicle getVehicle(String id);
    void rentVehicle(String id);
    void returnVehicle(String id);
    double calculateCharge(String id, int days);
    List<Vehicle> findByType(String type);
    List<Vehicle> findAvailableVehicles();
    void printAllVehicles();
}
