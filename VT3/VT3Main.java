import java.util.Scanner;

// Jonne Taipale, 2478067

class VT3Main {

    //Luo scannerin, milla otetaan syotteita vastaan
    private static Scanner sc = new Scanner(System.in);

    public static void main (String [] args){

        //Muuttujien alustukset
        String tilaajan_nimi;
        String lehden_nimi;
        String toimitusosoite;
        double kuukausihinta;
        int tilauksen_kesto;
        int alennusprosentti;


        System.out.println("Anna tilaajan nimi: ");
        tilaajan_nimi = sc.nextLine();

        System.out.println("Anna lehden nimi: ");
        lehden_nimi = sc.nextLine();

        System.out.println("Anna toimitusosoite: ");
        toimitusosoite = sc.nextLine();

        System.out.println("Anna lehden kuukausihinta: ");
        kuukausihinta = lueRationaali();

        System.out.println("Tehdaan samasta tilauksesta normaalitilaus ja kestotilaus testausta varten");

        System.out.println("Ensin tehdaan normaalitilaus: ");
        System.out.println("Anna tilauksen kesto kuukausina: ");
        tilauksen_kesto = lueKokonaisluku();
        //Luo olion tilaus1, mika on normaalitilaus
        RegularSubscription tilaus1 = new RegularSubscription(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta, tilauksen_kesto);

        System.out.println("Seuraavaksi tehdaan kestotilaus: ");   
        do {
            System.out.println("Anna tilauksen alennusprosentti valilta 0 - 100: ");
            alennusprosentti = lueKokonaisluku();
        } while(alennusprosentti > 100);

        //Luo olion tilaus2, mika on kestotilaus
        StandingSubscription tilaus2 = new StandingSubscription(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta, alennusprosentti);

        //Tulostaa tilausten laskut kayttaen printSubscriptionInvoice() metodia
        printSubscriptionInvoice(tilaus1);
        printSubscriptionInvoice(tilaus2);

        //Sulkee scannerin
        sc.close();

    }

    // Metodi mikä tulostaa lehden laskun
    static void printSubscriptionInvoice(Subscription sub) {
        sub.printInvoice();
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