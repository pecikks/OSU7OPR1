public interface Vehicle {
    String getId();
    String getModel();
    String getType();
    double getDailyRate();
    boolean isAvailable();
    void rent();
    void returnVehicle();
    String getDetails();
}
