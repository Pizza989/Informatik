
/**
 * Beschreiben Sie hier die Klasse GeketteteListe.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Warteschlange {
    private Song anfang;
    private int anzahl;

    public Warteschlange() {
        this.anfang = null;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public Knoten getAnfang() {
        return this.anfang.objekt;
    }

    public void einfügen(Knoten objekt) {
        if (this.anfang == null) {
            this.anfang = objekt;
        } else {
            Knoten aktueller_patient = this.anfang;

            while (aktueller_patient.getNachfolger() != null) {
                aktueller_patient = aktueller_patient.getNachfolger();
            }

            aktueller_patient.setNachfolger(objekt);

        }
        this.anzahl++;
    }

    public void entfernen() {
        this.anfang = this.anfang.getNachfolger();
    }
}
