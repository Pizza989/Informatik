
/**
 * Beschreiben Sie hier die Klasse Knoten.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Knoten {
    private Knoten nachfolger;
    public Knoten objekt;

    public Knoten(Knoten objekt) {
        this.nachfolger = null;
        this.objekt = objekt;
    }

    public Knoten getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(Knoten nachfolger) {
        this.nachfolger = nachfolger;
    }

    public Knoten getObjekt() {
        return objekt;
    }

}
