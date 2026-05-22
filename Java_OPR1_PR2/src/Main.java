public class Main {
    public static void main() {
        Pujcovna pujcovna = new Pujcovna();

        Vybaveni kolo1 = new Kolo(
              "K001",
              "MTB",
              250,
              true,
              "horské",
              false
        );

        Vybaveni kolo2 = new Kolo(
                "K002",
                "Elektro blesk",
                400,
                true,
                "městské",
                true
        );

        Vybaveni kolo3 = new Kolo(
                "K003",
                "Silniční střela",
                300,
                false,
                "silniční",
                false
        );

        Vybaveni lyze1 = new Lyze(
                "L001",
                "Sněžná stopa",
                300,
                true,
                170,
                false
        );

        Vybaveni lyze2 = new Lyze(
                "L002",
                "Junior ski",
                220,
                true,
                120,
                true
        );

        pujcovna.pridejVybaveni(kolo1);
        pujcovna.pridejVybaveni(kolo2);
        pujcovna.pridejVybaveni(kolo3);
        pujcovna.pridejVybaveni(lyze1);
        pujcovna.pridejVybaveni(lyze2);

        System.out.println("=== Půjčovna sportovního vybavení ===");
        System.out.println();

        System.out.println("Nabídka vybavení:");
        pujcovna.vypisNabidku();

        System.out.println();
        System.out.println("Cena půjčení na 3 dny:");

        for (Vybaveni v : pujcovna.getVybaveni()) {
            System.out.println(v.infoPronajmu(3));
        }

        System.out.println();
        System.out.println("Dostupné vybavení: ");
        pujcovna.vypisDostupne();

        System.out.println();
        System.out.println("Hledání podle ID: ");

        Vybaveni nalezene = pujcovna.najdiPodleId("K002");

        if (nalezene != null) {
            System.out.println("Nalezeno: " + nalezene.predstavSe());
        } else {
            System.out.println("Vybavení nebylo nalezeno.");
        }

        Vybaveni nenalezene = pujcovna.najdiPodleId("X999");

        if (nenalezene != null) {
            System.out.println("Nalezeno: " + nenalezene.predstavSe());
        } else {
            System.out.println("Vybavení X999 nebylo nalezeno.");
        }

        System.out.println();
        System.out.println("Půjčení a vrácení vybavení:");

        pujcovna.pujcVybaveni("K001");

        System.out.println();
        System.out.println("Dostupné vybavení po půjčení K001:");
        pujcovna.vypisDostupne();

        System.out.println();
        pujcovna.vratVybaveni("K001");

        System.out.println();
        System.out.println("Dostupné vybavení po vrácení K001:");
        pujcovna.vypisDostupne();
    }
}
