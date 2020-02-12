import java.util.ArrayList;
import java.util.Random;
import java.io.*;


public class Hirsipuu {

    private String sana;
    private int arvaukset;
    private ArrayList<Character> arvausLista;
    private ArrayList<Character> merkit;

    public Hirsipuu (ArrayList<String> sanalista, int arvaustenMaara){
        
        Random luku = new Random();
        this.sana = sanalista.get(luku.nextInt(sanalista.size()));
        arvaukset = arvaustenMaara;
        arvausLista = new ArrayList<Character>();
        merkit = new ArrayList<Character>();
        char merkki;
        for (int i = 0; i < this.sana.length(); i++) {
        	merkki = sana.charAt(i);
        	if (!merkit.contains(merkki))
        		merkit.add(merkki);
        	
        }
        
    }

    // Tarkistaa onko arvattu kirjain oikeassa sanassa
    public boolean arvaa(Character merkki) {

        for (int i= 0; i < this.sana.length(); i++) {
            if (sana.charAt(i) == merkki) {
                arvausLista.add(merkki);
                return true;
            }
        }
        --this.arvaukset;
        return false;
    }

    public ArrayList<Character> arvaukset() {
        return arvausLista;
    }

    public int arvauksiaOnJaljella() {
        return arvaukset;
    }

    public String sana() {
        return sana;
    }

    // Palauttaa true jos peli on voitettu, muulloin false
    public boolean onLoppu() {

        if (this.arvausLista.containsAll(merkit))
            return true;
        else
        	return false;

    }
    
    // Palauttaa kayttajalle sanan missa nakyy vain arvatut kirjaimet
    public String peliTilanne() {
    	
    	String tilanne = "";
    	for (int i = 0; i < sana.length(); i++) {
    		if (arvausLista.contains(sana.charAt(i)))
    				tilanne += sana.charAt(i);
    		else
    			tilanne += "-";
    	}
    	
    	return tilanne;
    }

}