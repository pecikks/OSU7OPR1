public class Main {
    public static void main(String[] args) {
        Knihovna knihovna = new Knihovna();

        Publikace kniha = new Kniha(
                "Hobit",
                "J. R. R. Tolkien",
                1937,
                320
        );

        Publikace casopis = new Casopis(
                "Věda dnes",
                "Redakce",
                2024,
                8
        );

        Publikace ebook = new EBook(
                "Java pro začátečníky",
                "Petr Novák",
                2023,
                12.5
        );

        knihovna.pridejPublikaci(kniha);
        knihovna.pridejPublikaci(casopis);
        knihovna.pridejPublikaci(ebook);

        System.out.println("=== Městská knihovna ===");
        knihovna.vypisVsechny();

        System.out.println();
        System.out.println("=== Výpůjčky ===");
        knihovna.vypujcVsechny();

        System.out.println();
        System.out.println("=== Hledání podle názvu ===");

        Publikace nalezena = knihovna.najdiPodleNazvu("Hobit");

        if (nalezena != null) {
            System.out.println("Nalezena publikace: " + nalezena.info());
        } else {
            System.out.println("Publikace nebyla nalezena.");
        }

        Publikace nenalezena = knihovna.najdiPodleNazvu("Neexistující kniha");

        if (nenalezena != null) {
            System.out.println("Nalezena publikace: " + nenalezena.info());
        } else {
            System.out.println("Publikace nebyla nalezena.");
        }
    }
}
