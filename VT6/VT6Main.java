import java.util.Scanner;
//import java.io.*;
//import java.util.InputMismatchException;
//import java.util.List;
//import java.util.ArrayList;


class VT6Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main (String [] args) throws Exception{
        
        Character arvaus;
        int arvaukset;

        // Pelin alustukset
        System.out.println("Anna sanatiedoston nimi: ");
        String tiedosto = sc.nextLine(); 
        System.out.println("Anna arvauksien maara: ");
        arvaukset = lueKokonaisluku();
        Sanalista sanalista = new Sanalista(tiedosto);
        Hirsipuu hirsipuu = new Hirsipuu(sanalista.annaSanat(), arvaukset);

        // Pelin looppi
        do {
            System.out.println("Anna kirjain: ");
            arvaus = sc.next().charAt(0);
            if(hirsipuu.arvaa(arvaus))
                System.out.println("Arvauksesi oli oikein, sanassa on kirjain: " + arvaus);
            else
                System.out.println("Arvauksesi oli vaarin, arvauksia jaljella " + hirsipuu.arvauksiaOnJaljella());
            if(hirsipuu.onLoppu()) {
            	System.out.println("Voitit pelin! Sana on: " + hirsipuu.sana());
            	return;
            }
            System.out.println(hirsipuu.peliTilanne());
        } while (hirsipuu.arvauksiaOnJaljella() != 0); // Jos arvauksia ei enaa ole, peli loppuu ja pelaaja haviaa
        System.out.println("Sinulla ei ole enaa arvauksia, havisit pelin. Oikea sana on: " + hirsipuu.sana());




    }



    // Tama funktio ottaa vastaan kayttajalta ainoastaan reaaliluvun mika on positiivinen
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

    // Tama funktio ottaa vastaan kayttajalta ainoastaan kokonaisluvun mika on positiivinen
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