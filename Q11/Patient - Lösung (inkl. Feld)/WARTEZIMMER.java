
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

        while (aktueller_patient.getNachfolger() != null) {
            aktueller_patient = aktueller_patient.getNachfolger();
        }

        aktueller_patient.setNachfolger(p);
    }

    public void entfernen() {
        PATIENT aktueller_patient = this.anfang;
        for (int i = 0; i < this.anzahl; i++) {
            aktueller_patient = aktueller_patient.nachfolger()
        }
    }
}
