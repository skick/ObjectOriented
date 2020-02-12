

public class StandingSubscription extends Subscription {

    private int tilauksenKesto;
    private int alennusprosentti;

    public StandingSubscription (String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double kuukausiHinta, int alennusprosentti) {

        super(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausiHinta);
        this.alennusprosentti = alennusprosentti;
        this.tilauksenKesto = 12;

    }


    public void printInvoice() {
        super.printInvoice();
        System.out.println("Tilauksen tyyppi on kestotilaus");
        System.out.println("Tilauksen kesto: " + this.tilauksenKesto);
        System.out.println("Tilauksen hinta: " + this.getKuukausiHinta() * tilauksenKesto * (double)(1.0 - (alennusprosentti * 0.01)));
    }


    public void setTilauksenKesto (int uusiKesto){
        this.tilauksenKesto = uusiKesto;
    }

    public int getTilauksenKesto (){
        return this.tilauksenKesto;
    }

    public void setAlennusProsentti (int uusiAlennusProsentti){
        this.alennusprosentti = uusiAlennusProsentti;
    }

    public int getAlennusProsentti (){
        return this.alennusprosentti;
    }
}