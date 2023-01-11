
/**
 * Beschreiben Sie hier die Klasse BINÄRBAUM.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BINÄRBAUM
{
    private KNOTEN wurzel;
    
    /**
     * Konstruktor für Objekte der Klasse BINÄRBAUM
     */
    public BINÄRBAUM()
    {
        wurzel = null;
    }

    public KNOTEN getWurzel() {
        return wurzel;
    }
    
    public void setWurzel(KNOTEN k) {
        wurzel = k;
    }
    
    public DATENELEMENT suchen(DATENELEMENT gesuchteDaten) {
        if(wurzel == null) {
            return null;
        }
        else return wurzel.suchen(gesuchteDaten);
    }
    
    public void einfügen(DATENELEMENT neueDaten) {
        if (wurzel == null) {
            wurzel = new KNOTEN(neueDaten);
        } else {
            wurzel.einfügen(neueDaten);
        }
    }
}
