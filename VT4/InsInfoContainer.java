
import java.util.ArrayList;
import java.util.Iterator;

public class InsInfoContainer {

    private ArrayList<InsuranceInfo> sailio;


    public InsInfoContainer () {
        sailio = new ArrayList<InsuranceInfo>();
    }

    public InsInfoContainer (ArrayList<InsuranceInfo> sailio) {
        this.sailio = sailio;
    }

    public void lisaaSailioon (InsuranceInfo tiedot) {
        sailio.add( tiedot );
    }

    public void tulostaKokoSailio () {
		for (InsuranceInfo tiedot : sailio) {
			System.out.println(tiedot.toString());
		}
    }

    public void tulostaSuuremmat (double x) {
		for (InsuranceInfo tiedot : sailio) {
            if (tiedot.getVakuutusarvo() > x)
			    System.out.println(tiedot.toString());
		}
    }

    public void tulostaPienemmat (double x) {
		for (InsuranceInfo tiedot : sailio) {
            if (tiedot.getVakuutusarvo() < x)
			    System.out.println(tiedot.toString());
		}
    }

}