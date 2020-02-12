import java.util.ArrayList;

public class Rivitalo extends Rakennus {

    public Rivitalo (int asuntojenLkm) {
        super(asuntojenLkm);
    }
    public void setAsunto (Asunto asu) { 
        super.setAsunto(asu);
    }

    public ArrayList<Asunto> getAsunnot () {
        ArrayList<Asunto> asuntoLista = super.getAsunnot();
        return asuntoLista;
    }

    public String toString() {
        return ("Rakennus on rivitalo. " + super.toString());
    }

}