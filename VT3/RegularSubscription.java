

public class RegularSubscription extends Subscription {

    private int tilauksen_kesto;

    public RegularSubscription (String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double kuukausiHinta, int tilauksen_kesto) {

        super(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausiHinta);
        this.tilauksen_kesto = tilauksen_kesto;
        
    }

    public void printInvoice() {
        super.printInvoice();
        System.out.println("Tilauksen tyyppi on normaalitilaus");
        System.out.println("Tilauksen kesto: " + this.tilauksen_kesto);
        System.out.println("Tilauksen hinta: " + this.getKuukausiHinta() * (double)this.tilauksen_kesto);
    }


    public void setTilauksenKesto (int uusiKesto) {
        this.tilauksen_kesto = uusiKesto; 
    }

    public int getTilauksenKesto () {
        return this.tilauksen_kesto;
    }

}
