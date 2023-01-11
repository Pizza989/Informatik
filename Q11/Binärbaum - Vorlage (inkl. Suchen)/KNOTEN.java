
/**
 * Beschreiben Sie hier die Klasse KNOTEN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KNOTEN
{
    private KNOTEN linkerNachfolger, rechterNachfolger;
    private DATENELEMENT daten;
    
    public KNOTEN(DATENELEMENT d) {
        daten = d;
        linkerNachfolger = null;
        rechterNachfolger = null;
    }
    
    public DATENELEMENT getDaten() {
        return daten;
    }
    
    public void setDaten(DATENELEMENT d) {
        daten = d;
    }
    
    public KNOTEN getLinkerNachfolger() {
        return linkerNachfolger;
    }
    
    public void setLinkerNachfolger(KNOTEN k) {
        linkerNachfolger = k;
    }
    
    public KNOTEN getRechterNachfolger() {
        return rechterNachfolger;
    }
    
    public void setRechterNachfolger(KNOTEN k) {
        rechterNachfolger = k;
    }
    
    public DATENELEMENT suchen(DATENELEMENT gesuchteDaten) {
        if(daten.istGleich(gesuchteDaten)) {
            return daten;
        }
        else if(daten.istKleinerAls(gesuchteDaten) && rechterNachfolger != null) {
            return this.rechterNachfolger.suchen(gesuchteDaten);
        }
        else if(daten.istGrößerAls(gesuchteDaten) && linkerNachfolger != null) {
            return this.linkerNachfolger.suchen(gesuchteDaten);
        }
        else return null;
    }
    
    public void einfügen(DATENELEMENT neueDaten) {
        if (daten.istKleinerAls(neueDaten)) {
            if (rechterNachfolger != null) {
                rechterNachfolger.einfügen(neueDaten);
            } else rechterNachfolger = new KNOTEN(neueDaten);
        } else if (daten.istGrößerAls(neueDaten)) {
            if (linkerNachfolger != null) {
                linkerNachfolger.einfügen(neueDaten);
            } else linkerNachfolger = new KNOTEN(neueDaten);
        } else return;
    }
}
