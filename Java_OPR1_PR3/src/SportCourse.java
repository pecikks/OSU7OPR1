public class SportCourse extends Course{
    private boolean equipmentIncluded;

    public SportCourse(String code, String title, String lecturer, int capacity, double basePrice, boolean equipmentIncluded) {
        super(code, title, lecturer, capacity, basePrice);
        this.equipmentIncluded = equipmentIncluded;
    }

    @Override
    public double calculatePrice() {
        if (equipmentIncluded) {
            return getBasePrice() + 300;
        }
        return getBasePrice();
    }

    @Override
    public String getInfo() {
        String equipmentText = equipmentIncluded ? "ano" : "ne";

        return getCode() + " - Sportovní kurz: " + getTitle()
                + ", lektor: " + getLecturer()
                + ", cena: " + calculatePrice()
                + ", obsazeno " + getParticipantsCount() + "/" + getCapacity()
                + ", vybavení v ceně: " + equipmentText;
    }
}
