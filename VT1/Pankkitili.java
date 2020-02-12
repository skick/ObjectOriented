import java.io;

public class Pankkitili {

    private double saldo;
    private String tilinumero;
    private String omistaja;

    public  Pankkitili(String omistaja, String tilinumero, double saldo) {
        this.saldo = saldo;
        this.tilinumero = tilinumero;
        this.omistaja = omistaja;
        System.out.printf
             ("Pankkitili luotu henkilolle %s\n", omistaja);
    }


    public void tallennus(double summa) {
        if (summa < 0) {
            System.out.println("Et voi tallentaa tilille negatiivista summaa");
            return;
        }
        this.saldo += summa;
    }

    public void otto(double summa) {
        if (summa > this.saldo) {
            System.out.println("Tililla ei ole katetta");
            return;
        }
        else if (summa < 0) {
            System.out.println("Et voi nostaa tililta negatiivista summaa");
            return;
        }
        this.saldo -= summa;
        System.out.printf("Tililta nostettu %f euroa\n", summa); 
    }

    public void tulostaSaldo() {
        System.out.println("Tilin saldo on: " + this.saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double uusiSaldo) {
        this.saldo = uusiSaldo;
    }

    public void setTilinumero(String uusiTili) {
        this.tilinumero = uusiTili;
    }

    public String getTilinumero() {
        return this.tilinumero;
    }

    public void setOmistaja(String nimi) {
        this.omistaja = nimi;
    }

    public String getOmistaja() {
        return this.omistaja;
    }
    
}