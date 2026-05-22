import java.util.ArrayList;

public class CourseManager {
    private ArrayList<Course> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findCourseByCode(String code) {
        for (Course course : courses) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        return null;
    }

    public boolean enroll(String courseCode, Participant participant) {
        Course course = findCourseByCode(courseCode);

        if (course == null) {
            return false;
        }
        return course.addParticipant(participant);
    }

    public void printAllCourses() {
        for (Course course : courses) {
            System.out.println(course.getInfo());
        }
    }

    public void printOnlyAvailableCourses() {
        for (Course course : courses) {
            if (!course.isFull()) {
                System.out.println(course.getCode() + " - volná místa: " + course.getFreePlaces());
            }
        }
    }

    public void printParticipants(String courseCode) {
        Course course = findCourseByCode(courseCode);

        if (course == null) {
            System.out.println("Kurz " + courseCode + " neexistuje.");
        }

        System.out.println("Účastnící kurzu " + courseCode + ":");

        for (Participant participant : course.getParticipants()) {
            System.out.println(participant);
        }
    }

    public int getTotalParticipantsCount() {
        int total = 0;

        for (Course course : courses) {
            total += course.getParticipantsCount();
        }
        return total;
    }
}
