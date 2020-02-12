import java.util.ArrayList;
import java.io.*;
import java.nio.charset.Charset;



public class Sanalista {

    private ArrayList<String> sanat;
    private String tiedosto;

    public Sanalista(String tiedostonimi) throws Exception{
        this.tiedosto = tiedostonimi;
        sanat = new ArrayList<String>();
        Charset utf8 = Charset.forName("UTF-8");
        try (BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(tiedosto), utf8))) {
            String rivi;
            System.out.println("Tiedoston avaaminen onnistui \n");
            while ((rivi = file.readLine()) != null) {
                rivi = rivi.toLowerCase();
                sanat.add(rivi);
            }
        }catch( IOException ioe) {
            System.out.println("Virhe tiedoston lukemisessa");
            ioe.printStackTrace();
            System.exit(0);
        }
        System.out.println("Sanalista luotu");
    } 

    public ArrayList<String> annaSanat() {
        return this.sanat;
    }

    public void setSanat(ArrayList<String> uusiLista) {
        this.sanat = uusiLista;
    }

    public String getTiedostoNimi () {
        return this.tiedosto;
    }

    public void setTiedostoNimi(String uusiNimi) {
        this.tiedosto = uusiNimi;
    }

}