public class Van implements Vehicle{
    private String id;
    private String model;
    private double dailyRate;
    private boolean available;
    private double cargoFeePerDay;

    public Van(String id, String model, double dailyRate, double cargoFeePerDay) {
        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
        this.cargoFeePerDay = cargoFeePerDay;
        this.available = true;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getType() {
        return "Van";
    }

    @Override
    public double getDailyRate() {
        return dailyRate;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void rent() {
        available = false;
    }

    @Override
    public void returnVehicle() {
        available = true;
    }

    public double calculateCharge(int days) {
        if (days <= 0) {
            return 0;
        }

        return (dailyRate + cargoFeePerDay) * days;
    }

    @Override
    public String getDetails() {
        String stav = available ? "dostupné" : "zapůjčené";

        return getType() + " | ID: " + id
                + ", model: " + model
                + ", cena/den: " + dailyRate + " Kč"
                + ", příplatek/den: " + cargoFeePerDay + " Kč"
                + ", stav: " + stav;
    }
}
