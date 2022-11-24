
/**
 * Beschreiben Sie hier die Klasse KNOTEN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KNOTEN extends LISTENELEMENT
{
    private DATENELEMENT daten;
    private LISTENELEMENT nachfolger;   

    public KNOTEN(DATENELEMENT d) {
        daten = d;
        nachfolger = null;
    }

    // Getter- und Setter-Methoden
    public void setNachfolger(LISTENELEMENT k){
        nachfolger = k;
    }

    public LISTENELEMENT getNachfolger() {
        return nachfolger;
    }

    public void setDaten(DATENELEMENT d) {
        daten = d;
    }

    public DATENELEMENT getDaten() {
        return daten;
    }

    public void ausgeben() {
        daten.ausgeben();
    }
    
    @Override
    public int getRestlänge() {
        return this.nachfolger.getRestlänge() + 1;
    }
    
    public KNOTEN hintenEinfügen(KNOTEN k) {
        this.nachfolger = this.nachfolger.hintenEinfügen(k);
        return this;
    }
}