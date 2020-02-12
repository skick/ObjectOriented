


public class Subscription {

    private String lehden_nimi;
    private String tilaajan_nimi;
    private String toimitusosoite;
    private double kuukausihinta;



    public Subscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double kuukausiHinta) {

        this.lehden_nimi = lehden_nimi;
        this.tilaajan_nimi = tilaajan_nimi;
        this.toimitusosoite = toimitusosoite;
        this.kuukausihinta = kuukausiHinta;
    }

    public void printInvoice() {
        System.out.println("Tilaajan nimi: " + this.tilaajan_nimi);
        System.out.println("Tilattu lehti: " + this.lehden_nimi);
        System.out.println("Toimitusosoite: "+ this.toimitusosoite);
    }

    public void setLehdenNimi (String uusiNimi) {
        this.lehden_nimi = uusiNimi;
    }

    public String getLehdenNimi () {
        return this.lehden_nimi;
    }

    public void setTilaajanNimi (String uusiNimi) {
        this.tilaajan_nimi = uusiNimi;
    }

    public String getTilaajanNimi () {
        return this.tilaajan_nimi;
    }

    public void setToimitusosoite (String uusiOsoite) {
        this.toimitusosoite = uusiOsoite;
    }

    public String getToimitusosoite () {
        return this.toimitusosoite;
    }

    public void setKuukausiHinta (double uusiHinta) {
        this.kuukausihinta = uusiHinta;
    }

    public double getKuukausiHinta () {
        return this.kuukausihinta;
    }
}