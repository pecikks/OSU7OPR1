public class ArtCourse extends Course{
    private double materialCost;

    public ArtCourse(String code, String title, String lecturer, int capacity, double basePrice, double materialCost) {
        super(code, title, lecturer, capacity, basePrice);
        this.materialCost = materialCost;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + materialCost;
    }

    @Override
    public String getInfo() {
        return getCode() + " - Umělecký kurz: " + getTitle()
                + ", lektor: " + getLecturer()
                + ", cena: " + calculatePrice() + " Kč"
                + ", obsazeno " + getParticipantsCount() + "/" + getCapacity()
                + ", materiál: " + materialCost + " Kč";
    }
}
