
/**
 * Beschreiben Sie hier die Klasse Wartezimmer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LISTE
{
    private KNOTEN anfang;

    public LISTE() {
        anfang = null;
    }

    public void einfügen(int index, DATENELEMENT daten) throws IndexOutOfBoundsException {
        KNOTEN k = new KNOTEN(daten);
        if (this.getLänge() != 0) {
            index = (index % this.getLänge()) + index;
        } else {
            if (index == 0)
                this.anfang = k;
            else
                throw new IndexOutOfBoundsException(index);
            return;
        }

        KNOTEN davor = this.getElement(index);
        KNOTEN danach = davor.getNachfolger();

        davor.setNachfolger(k);
        k.setNachfolger(danach);
    }

    public KNOTEN entfernen() {
        KNOTEN nächster = anfang;
        anfang = anfang.getNachfolger();
        return nächster;
    }

    private KNOTEN getElement(int index, KNOTEN aktuell) {
        if (index == 0) {
            return this.anfang;
        }
        return this.getElement(index - 1, aktuell.getNachfolger());
    }

    public KNOTEN getElement(int index) {
        return this.getElement(index, this.anfang);
    }

    public void ausgeben() {
        KNOTEN aktuell = this.anfang;
        System.out.print("[");
        for (int i = 0; i < this.getLänge(); i++) {
            System.out.printf("%s, ", aktuell.getClass().getName());
            aktuell = aktuell.getNachfolger();
        }
        System.out.print("]\n");
    }

    public int getLänge() {
        if(anfang == null) {
            return 0;
        }
        else {
            return anfang.getRestlänge();   
        }        
    }

    public void alleInfosAusgeben() {
        if(anfang == null) {
            System.out.println("Es ist kein Song in der Playlist...");
        }
        else {
            anfang.restlicheInfosAusgeben();
        }
    }

}