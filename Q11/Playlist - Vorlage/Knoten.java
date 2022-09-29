
/**
 * Beschreiben Sie hier die Klasse Knoten.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Knoten {
    private Knoten nachfolger;
    public Song objekt;

    public Knoten(Song objekt) {
        this.nachfolger = null;
        this.objekt = objekt;
    }

    public Knoten getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(Knoten nachfolger) {
        this.nachfolger = nachfolger;
    }

    public Song getObjekt() {
        return objekt;
    }

}
