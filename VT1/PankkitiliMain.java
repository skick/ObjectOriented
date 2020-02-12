import java.io;
import java.util.Scanner;


class PankkitiliMain {

    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        String nimi, tilinumero;
        double saldo;

        System.out.println("Anna nimesi >");
        nimi = sc.nextLine();

        System.out.println("Anna tuleva tilinumerosi");
        tilinumero = sc.nextLine();

        System.out.println("Anna saldosi");
 
        saldo = lueRationaali();

        Pankkitili p1 = new Pankkitili(nimi, tilinumero, saldo);
        
        p1.tulostaSaldo();
        System.out.printf("Tilinumero on %s\n", p1.getTilinumero());
        System.out.printf("Omistaja on %s\n", p1.getOmistaja());
        
        System.out.println("Paljonko haluat tallentaa tilille?");
        p1.tallennus(lueRationaali());

        System.out.println("Paljonko haluat nostaa tililta?");
        p1.otto(lueRationaali());

        p1.tulostaSaldo();
        System.out.printf("Tilinumero on %s\n", p1.getTilinumero());
        System.out.printf("Omistaja on %s\n", p1.getOmistaja());

    
    }

    public static double lueRationaali() {
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble() == false){
            System.out.println("Anna luku numerona!");
            sc.next();
        }

        return sc.nextDouble();

    }





}