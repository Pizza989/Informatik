
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
        this.anzahl = 0;
        this.anfang = null;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void einfügen(PATIENT p) {
        if (this.anfang == null) {
            this.anfang = p;
        } else {
            PATIENT aktueller_patient = this.anfang;

            while (aktueller_patient.getNachfolger() != null) {
                if (aktueller_patient == p) {
                    System.err.println("p existiert schon in der Liste und wird nicht eingefügt");
                    return;
                }
                aktueller_patient = aktueller_patient.getNachfolger();
            }

            aktueller_patient.setNachfolger(p);

        }
        this.anzahl++;

    }

    public void entfernen() {
        this.anfang = this.anfang.getNachfolger();
    }
}
