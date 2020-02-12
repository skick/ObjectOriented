import java.util.Scanner;


class VT2Main {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main (String [] args){
        
        // Alustukset
        Tontti tontti;
        int asuntojenLkm;

        //Rakennus rakennus = new Rakennus(2);
        
        System.out.println("Anna tontin nimi: ");
        String nimi = sc.nextLine();

        System.out.println("Anna tontin osoite: ");
        String osoite = sc.nextLine();

        System.out.println("Anna tontin pinta-ala: ");
        double pintaAla = lueRationaali();

        // Luo uuden tontin
        tontti = new Tontti(nimi, osoite, pintaAla);
        System.out.println("Tontti on pystytetty...");

        // Tulostaa tämän hetkisen tilanteen
        String tilanne = tontti.toString();
        System.out.printf(tilanne);

        System.out.println("Anna rakennuksen tyyppi kirjaimella: ");
        System.out.println("(O)makotitalo ");
        System.out.println("(R)ivitalo ");
        System.out.println("(K)errostalo ");
        String valinta = sc.nextLine();

        switch (valinta) {
            case "O":
            case "o":
                System.out.println("Valitsit omakotitalon");
                // Kysyy käyttäjältä kuinka monta asuntoa tulee rakennukseen
                System.out.println("Anna asuntojen lukumaara kokonaislukuna:");
                asuntojenLkm = lueKokonaisluku();
                Omakotitalo omakotitalo = new Omakotitalo(asuntojenLkm);
                System.out.println("Omakotitalo on rakennettu tontille");
                tontti.setRakennusTonttiin(omakotitalo);
                luoAsunnot(asuntojenLkm, omakotitalo);
                break;
            case "R":
            case "r":
                System.out.println("Valitsit rivitalon");
                // Kysyy käyttäjältä kuinka monta asuntoa tulee rakennukseen
                System.out.println("Anna asuntojen lukumaara kokonaislukuna:");
                asuntojenLkm = lueKokonaisluku();
                Rivitalo rivitalo = new Rivitalo(asuntojenLkm);
                System.out.println("Rivitalo on rakennettu tontille");
                tontti.setRakennusTonttiin(rivitalo);
                luoAsunnot(asuntojenLkm, rivitalo);
                break;
            case "K":
            case "k":
                System.out.println("Valitsit kerrostalon");
                // Kysyy käyttäjältä kuinka monta asuntoa tulee rakennukseen
                System.out.println("Anna asuntojen lukumaara kokonaislukuna:");
                asuntojenLkm = lueKokonaisluku();
                Kerrostalo kerrostalo = new Kerrostalo(asuntojenLkm);
                System.out.println("Kerrostalo on rakennettu tontille");
                tontti.setRakennusTonttiin(kerrostalo);
                luoAsunnot(asuntojenLkm, kerrostalo);
                break;
            default:
                System.out.println("Ei oikeaa valintaa");
                return;
        }
        tilanne = tontti.toString();
        System.out.printf(tilanne);
        sc.close();
    }




    // Funktio luo asukkaat asuntoon;
    public static void luoAsukkaat(Asunto asu) {
        int asukkaidenLkm = 0;
        int i, j;
        // Kysyy käyttäjältä kuin monta asukasta muuttaa rakennukseen
        System.out.println("Monta asukasta muuttaa asuntoon?");
        do {
            asukkaidenLkm = lueKokonaisluku();
            if (asukkaidenLkm < 1)
                System.out.println("Liian pieni luku!");
            
        }   while (asukkaidenLkm < 1);

        j = 1;
        for (i = 0; i < asukkaidenLkm; i++) {
            System.out.println("Anna " + j + ". asukkaan nimi: ");
            String asukkaanNimi = sc.nextLine();
            System.out.println("Anna " + j++ + ". asukkaan syntyma-aika");
            String syntymaAika = sc.nextLine();
            Asukkaat asukas = new Asukkaat(asukkaanNimi, syntymaAika);
            asu.setAsukas(asukas);
            
            System.out.println("Asukas tallennettu...");
        }
    }
    // Funktio luo asunnot rakennukseen
    public static void luoAsunnot(int maara, Rakennus r) {
        int i, j;
        Asunto asunto;
        System.out.println("Rakennetaan asunnot rakennukseen...");
        j = 1;
        for (i = 0; i < maara; i++) {
            System.out.println("Anna " + j + ". asunnon pinta-ala: ");
            double asPintaAla = lueRationaali();
            System.out.println("Anna " + j++ + ". asunnon huoneiden lukumaara");
            int huoneidenLkm = lueKokonaisluku();
            asunto = new Asunto(asPintaAla, huoneidenLkm);
            luoAsukkaat(asunto);
            r.setAsunto(asunto);
            System.out.println("Asunto tallennettu...");
        }
    }

    // Tämä funktio ottaa vastaan käyttäjältä ainoastaan reaaliluvun mikä on positiivinen
    public static double lueRationaali() {
        
        //Scanner sc = new Scanner(System.in);
        double tulos;
        do {
            while(!sc.hasNextDouble()){
                System.out.println("Anna luku positiivisena reaalilukuna!");
                sc.nextLine();
            }
            tulos = sc.nextDouble();
            if (tulos <= 0)
                System.out.println("Anna luku positiivisena reaalilukuna!");
                sc.nextLine();
        } while (tulos <= 0);
        return tulos;

    }

    // Tämä funktio ottaa vastaan käyttäjältä ainoastaan kokonaisluvun mikä on positiivinen
    public static int lueKokonaisluku() {
        
        //Scanner sc = new Scanner(System.in);
        int tulos;
        do {
            while(!sc.hasNextInt()){
                System.out.println("Anna luku positiivisena kokonaislukuna!");
                sc.nextLine();
            }
            tulos = sc.nextInt();
            if (tulos <= 0)
                System.out.println("Anna luku positiivisena kokonaislukuna!");
                sc.nextLine();
        } while (tulos <= 0);
        return tulos;

    }
    

}