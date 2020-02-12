
import java.util.ArrayList;

public class Asunto {

    private double pinta_ala;
    private int huoneidenLkm;
    private ArrayList<Asukkaat> asukkaat;

    public Asunto(double pinta_ala, int huoneidenLkm) {

        this.pinta_ala = pinta_ala;
        this.huoneidenLkm = huoneidenLkm;
        this.asukkaat = new ArrayList<Asukkaat>();
    }

    public void setAsukas(Asukkaat asu) {
        asukkaat.add(asu);
    }

    public void setAsukkaat(ArrayList<Asukkaat> lista) {
        asukkaat = lista;
    }

    //Antaa käyttäjälle kopion asukkaista, jotka asuvat tässä rakennuksessa
    public ArrayList<Asukkaat> getAsukkaat () {
        ArrayList<Asukkaat> asukasLista = new ArrayList<Asukkaat>();
        for (Asukkaat asukas : asukkaat) {
            asukasLista.add(asukas);
        }
        return asukasLista;
    }

    public void setHuoneidenLkm(int lkm) {
        this.huoneidenLkm = lkm;
    }

    public int getHuoneidenLkm() {
        return this.huoneidenLkm;
    }

    public void setPintaAla(double pintaAla){
        this.pinta_ala = pintaAla;
    }

    public double getPintaAla(){
        return pinta_ala;
    }

    //Palauttaa stringinä asukkaiden tiedot
    public String toString() {
    
        //Jos asukkaita on haetaan asukkaiden tiedot asukkaat.toString metodilla
        if (asukkaat != null) {
            //int asukkaidenLkm = asukkaat.length;
            String tiedot = "";
            // Kerää tiedot asukkaista string muuttujaan
            for(Asukkaat asukas : asukkaat){
                tiedot = tiedot + "(" + asukas.toString() + ")";
            }
            return (" asunnon pinta-ala on " + pinta_ala + " ja huoneiden lukumaara on " + huoneidenLkm + ". Asunnossa asuu: " + tiedot);
        }
        //Jos asuntoja ei ole:
        else
            return (" asunnon pinta-ala on " + pinta_ala + " ja huoneiden lukumaara on " + huoneidenLkm + ". Asunnossa ei asu ketaan.");
    }


}