
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

    public int getLänge() {
        return this.anfang.getRestlänge();
    }
    
    public void hintenEinfügen(DATENELEMENT daten) {
        this.anfang = this.anfang.hintenEinfügen(new KNOTEN(daten));
    }
}