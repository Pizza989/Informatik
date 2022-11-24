
/**
 * Beschreiben Sie hier die Klasse Wartezimmer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LISTE
{
    private LISTENELEMENT anfang;

    public LISTE() {
        anfang = new ABSCHLUSS();
    }
    
    public void vorneEinfügen(DATENELEMENT daten) {
        KNOTEN k = new KNOTEN(daten);
        if (anfang == null)
            this.anfang = k;
        else {
            k.setNachfolger(this.anfang);
            this.anfang = k;
        }
    }
    
    public void hintenEinfügen(KNOTEN k) {
        this.anfang = this.anfang.hintenEinfügen(k);
    }
    
    public int getLänge() {
        return this.anfang.getRestlänge();
    }
}