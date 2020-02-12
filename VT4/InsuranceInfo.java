


public class InsuranceInfo {

    private Property kiinteisto;
    private double vakuutusarvo;

    public InsuranceInfo (Property kiinteisto, double vakuutusarvo) {
        this.kiinteisto = kiinteisto;
        this.vakuutusarvo = vakuutusarvo;
    }

    public void setKiinteisto (Property x) {
        this.kiinteisto = x;
    }

    public Property getKiinteisto () {
        return this.kiinteisto;
    }

    public void setVakuutusarvo (double x) {
        this.vakuutusarvo = x;
    }

    public double getVakuutusarvo () {
        return this.vakuutusarvo;
    }

    public String toString() {
        return(kiinteisto.getTyyppi() + ", " + kiinteisto.getSijainti() + ", " + this.vakuutusarvo);

    }
    

}