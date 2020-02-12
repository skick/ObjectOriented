import java.util.Scanner;

class VT4Main {

    //Luo scannerin, milla otetaan syotteita vastaan
    private static Scanner sc = new Scanner(System.in);

    public static void main (String [] args){

        //muuttujien alustukset
        //int j;
        String tyyppi;
        String sijainti;
        double vakuutusarvo;
        double arvo1, arvo2;

        //System.out.println("Kuinka monta haluat tallentaa: ");
        //j = lueKokonaisluku();

        //Luo sailion
        InsInfoContainer sailio = new InsInfoContainer();

        for (int i=0; i<5; i++) {

            System.out.println("Anna kiinteiston tyyppi: ");
            tyyppi = sc.nextLine();

            System.out.println("Anna kiinteiston sijainti: ");
            sijainti = sc.nextLine();

            Property kiinteisto = new Property(tyyppi, sijainti); 

            System.out.println("Anna vakuutusarvo kiinteistolle: ");
            vakuutusarvo = lueRationaali();
        
            InsuranceInfo tallennettava = new InsuranceInfo(kiinteisto, vakuutusarvo);
            sailio.lisaaSailioon(tallennettava);

        }

        System.out.println("Tulostetaan koko sailio: ");
        sailio.tulostaKokoSailio();

        System.out.println("Anna tulostettavien kiinteistojen maksimi vakuutusarvo: ");
        arvo1 = lueRationaali();
        System.out.println("Tulostetaan sailiosta kiinteistot joiden vakuutusarvo on pienempi kuin " + arvo1);
        sailio.tulostaPienemmat(arvo1);

        System.out.println("Anna tulostettavien kiinteistojen minimi vakuutusarvo: ");
        arvo2 = lueRationaali();
        System.out.println("Tulostetaan sailiosta kiinteistot joiden vakuutusarvo on suurempi kuin " + arvo1);
        sailio.tulostaSuuremmat(arvo2);



        //Sulkee scannerin
        sc.close();

    }

    // Tämä funktio ottaa vastaan käyttäjältä ainoastaan reaaliluvun mikä on positiivinen
    public static double lueRationaali() {

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