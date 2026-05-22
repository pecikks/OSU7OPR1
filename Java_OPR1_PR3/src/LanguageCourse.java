public class LanguageCourse extends Course implements Discountable{
    private String language;
    private String level;

    public LanguageCourse(String code, String title, String lecturer, int capacity, double basePrice, String language, String level) {
        super(code, title, lecturer, capacity, basePrice);
        this.language = language;
        this.level = level;
    }

    @Override
    public double getDiscount() {
        return 0.10;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * (1 - getDiscount());
    }

    @Override
    public String getInfo() {
        return getCode() + " - Jazykový kurz: " + language
                + " " + level
                + ", název: " + getTitle()
                + ", lektor: " + getLecturer()
                + ", cena: " + calculatePrice() + " Kč"
                + ", obsazeno " + getParticipantsCount() + "/" + getCapacity()
                + ", sleva " + (int) (getDiscount() * 100) + " %";
    }
}
