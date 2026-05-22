import java.util.HashSet;

abstract class Course {
    private String code;
    private String title;
    private String lecturer;
    private int capacity;
    private double basePrice;
    private HashSet<Participant> participants;

    public Course(String code, String title, String lecturer, int capacity, double basePrice) {
        this.code = code;
        this.title = title;
        this.lecturer = lecturer;
        this.capacity = capacity;
        this.basePrice = basePrice;
        this.participants = new HashSet<>();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getLecturer() {
        return lecturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public HashSet<Participant> getParticipants() {
        return participants;
    }

    public boolean addParticipant(Participant p) {
        if (isFull()) {
            return false;
        }

        return participants.add(p);
    }

    public boolean removeParticipant(String participantId) {
        return participants.removeIf(p -> p.getId().equals(participantId));
    }

    public boolean isFull() {
        return participants.size() >= capacity;
    }

    public int getFreePlaces() {
        return capacity - participants.size();
    }

    public int getParticipantsCount() {
        return participants.size();
    }

    public abstract double calculatePrice();

    public String getInfo() {
        return code + " - " + title
                + ", lektor: " + lecturer
                + ", cena: " + calculatePrice() + " Kč"
                + ", obsazeno " + participants.size() + "/" + capacity;
    }
}
