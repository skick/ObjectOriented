
import java.util.ArrayList;

public abstract class Rakennus{


    private int asuntojenLkm;
    private ArrayList<Asunto> asunnot;

    public Rakennus(int asuntojenLkm) {
        this.asuntojenLkm = asuntojenLkm;
        this.asunnot = new ArrayList<Asunto>();
    }

    public void setAsunto (Asunto asu) { 
        asunnot.add(asu);
    }

    // Palauttaa kopion asunnoista
    public ArrayList<Asunto> getAsunnot () {
        ArrayList<Asunto> asuntoLista = new ArrayList<Asunto>();
        for (Asunto asunto : asunnot) {
            asuntoLista.add(asunto);
        }
        return asuntoLista;
    }


    public void setAsuntojenLkm(int lkm) {
        this.asuntojenLkm = lkm;
    }

    public int getAsuntojenLkm() {
        return this.asuntojenLkm;
    }

    // Palauttaa stringin tämänhetkisestä tilanteesta
    public String toString() {

        //Jos asuntoja on haetaan asuntojen tiedot asunnot.toString metodilla
        if (asunnot != null) {
            String tiedot = "";
            int i = 0;
            // Kerää tiedot asunnoista string muuttujaan
            int j = 1;
            for(Asunto asunto : asunnot){
                if (i == (asuntojenLkm - 1))
                    tiedot = tiedot + "\n(" + j++ + "." + asunto.toString() + ")";
                else
                    tiedot = tiedot + "\n(" + j++ + "." + asunto.toString() + "), ";
                i++;
            }
            return ("Rakennuksessa on " + asuntojenLkm + " asuntoa. " + tiedot);
        }
        //Jos asuntoja ei ole:
        else
            return ("Rakennuksessa ei ole viela asuntoja.");
    }




}