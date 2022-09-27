
/**
 * Beschreiben Sie hier die Klasse Wartezimmer.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WARTEZIMMER {
    private int anzahl;
    private PATIENT anfang;

    public WARTEZIMMER() {
        anzahl = 0;
        anfang = null;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void einfügen(PATIENT p) {
        PATIENT aktueller_patient = this.anfang;
        
        while (aktueller_patient != null) {
            aktueller_patient = aktueller_patient.getNachfolger();
        }

        aktueller_patient = p;
    }

    public void entfernen() {
        this.anfang = this.anfang.getNachfolger();
    }
}
