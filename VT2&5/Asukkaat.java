
public class Asukkaat {

    private String nimi;
    private String syntymaAika;

    public Asukkaat(String nimi, String syntymaAika) {
        this.nimi = nimi;
        this.syntymaAika = syntymaAika;
    }


    public Asukkaat(Asukkaat a) {
        this.nimi = a.nimi;
        this.syntymaAika = a.syntymaAika;
    }

    public Asukkaat getAsukkaat() {
        return new Asukkaat(this.nimi, this.syntymaAika);
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setSyntymaAika(String syntymaAika) {
        this.syntymaAika = syntymaAika;
    }

    public String getSyntymaAika() {
        return this.syntymaAika;
    }

    //Palauttaa stringinä asukkaiden tiedot
    public String toString() {
        return nimi + ", " + syntymaAika;
    }

}