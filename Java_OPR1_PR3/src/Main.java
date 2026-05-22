public class Main {
    public static void main() {
        CourseManager manager = new CourseManager();

        Course java = new LanguageCourse(
                "JAVA01",
                "Java pro začátečníky",
                "Novotná",
                3,
                3000,
                "Angličtina",
                "B1"
        );

        Course joga = new SportCourse(
                "FIT01",
                "Jóga pro začátečníky",
                "Svoboda",
                4,
                1800,
                false
        );

        Course keramika = new ArtCourse(
                "ART01",
                "Keramika",
                "Malá",
                5,
                2000,
                400
        );

        manager.addCourse(java);
        manager.addCourse(joga);
        manager.addCourse(keramika);

        Participant jana = new Participant("P001", "Jana Nováková", "jana@email.cz");
        Participant petr = new Participant("P002", "Petr Dvořák", "petr@email.cz");
        Participant eva = new Participant("P003", "Eva Malá", "eva@email.cz");
        Participant tomas = new Participant("P004", "Tomáš Veselý", "tomas@email.cz");
        Participant lucie = new Participant("P005", "Lucie Černá", "lucie@email.cz");

        System.out.println("=== REZERVAČNÍ SYSTÉM KURZŮ ===");
        System.out.println();

        System.out.println("Přidávám účastníky...");

        System.out.println("Jana byla přihlášena do kurzu JAVA01: "
                + manager.enroll("JAVA01", jana));

        System.out.println("Petr byl přihlášen do kurzu JAVA01: "
                + manager.enroll("JAVA01", petr));

        System.out.println("Jana byla znovu přihlášena do kurzu JAVA01: "
                + manager.enroll("JAVA01", jana));

        System.out.println("Jana byla přihlášena do kurzu FIT01: "
                + manager.enroll("FIT01", jana));

        System.out.println("Petr byl přihlášen do kurzu FIT01: "
                + manager.enroll("FIT01", petr));

        System.out.println("Eva byla přihlášena do kurzu FIT01: "
                + manager.enroll("FIT01", eva));

        System.out.println("Tomáš byl přihlášen do kurzu FIT01: "
                + manager.enroll("FIT01", tomas));

        System.out.println("Lucie byla přihlášena do plného kurzu FIT01: "
                + manager.enroll("FIT01", lucie));

        System.out.println("Lucie byla přihlášena do kurzu ART01: "
                + manager.enroll("ART01", lucie));

        System.out.println();
        System.out.println("=== VŠECHNY KURZY ===");
        manager.printAllCourses();

        System.out.println();
        System.out.println("=== DOSTUPNÉ KURZY ===");
        manager.printOnlyAvailableCourses();

        System.out.println();
        Course fit = manager.findCourseByCode("FIT01");

        if (fit != null) {
            System.out.println("Odebrání účastníka P003 z kurzu FIT01: "
                    + fit.removeParticipant("P003"));
        }

        System.out.println();
        System.out.println("=== DOSTUPNÉ KURZY PO ODEBRÁNÍ ===");
        manager.printOnlyAvailableCourses();

        System.out.println();
        System.out.println("=== ÚČASTNÍCI KURZU JAVA01 ===");
        manager.printParticipants("JAVA01");

        System.out.println();
        System.out.println("Celkový počet přihlášení ve všech kurzech: "
                + manager.getTotalParticipantsCount());
    }
}
