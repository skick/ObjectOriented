

public class Property {

    private String tyyppi;
    private String sijainti;

    public Property(String tyyppi, String sijainti) {

        this.tyyppi = tyyppi;
        this.sijainti = sijainti;

    }

    public void setTyyppi (String x) {
        this.tyyppi = x;
    }

    public String getTyyppi () {
        return this.tyyppi;
    }

    public void setSijainti (String x) {
        this.sijainti = x;
    }

    public String getSijainti () {
        return this.sijainti;
    }


}