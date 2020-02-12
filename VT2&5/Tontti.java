

public class Tontti {

    private String nimi;
    private String osoite;
    private double pintaAla;
    private Rakennus rakennus;


    public Tontti(String nimi, String osoite, double pintaAla) {
        this.nimi = nimi;
        this.osoite = osoite;
        this.pintaAla = pintaAla;
        this.rakennus = null;
    }

    public void setRakennusTonttiin( Rakennus r ){
        this.rakennus = r;
     }

     //public Rakennus getRakennusTontista() {
        // Antaa käyttäjälle kopion rakennuksesta, mikä sijaitsee tässä tontissa
       // return new Rakennus(rakennus);
    // }

     //Palauttaa käyttäjälle stringinä tämänhetkisen tilanteen
     public String toString(){
        if( rakennus != null )
            //Jos tontilla on rakennus, lisätään stringin perään rakennus.toString metodin string.
           return ( nimi + " tontti on pinta-alaltaan " + pintaAla + " neliota ja sen osoite on " + osoite + ". " + rakennus.toString() + "\n");
        else
            //Jos tontilla ei ole rakennusta:
           return ( nimi + " tontti on pinta-alaltaan " + pintaAla + " neliota ja sen osoite on " + osoite + ". Tontilla ei ole rakennusta.\n");
     }
     

    public void setTontinNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getTontinNimi() {
        return this.nimi;
    }

    public void setTontinOsoite(String uusiOsoite) {
        this.osoite = uusiOsoite;
    }

    public String getTontinOsoite() {
        return this.osoite;
    }


    public void setTontinPintaAla(double pintaAla) {
        this.pintaAla = pintaAla;
    }

    public double getTontinPintaAla() {
        return this.pintaAla;
    }

}