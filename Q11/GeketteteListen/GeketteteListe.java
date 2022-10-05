public class GeketteteListe {
    private Knoten anfang;
    private int anzahl;

    public GeketteteListe() {
        this.anfang = null;
    }

    public int getAnzahl() {
        return anzahl;
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
