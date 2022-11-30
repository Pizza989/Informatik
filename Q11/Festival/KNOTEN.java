
public class KNOTEN extends LISTENELEMENT
{
    private VERANSTALTUNG veranstaltung;
    private LISTENELEMENT nachfolger;
    
    public VERANSTALTUNG getVeranstaltung() {
        return this.veranstaltung;
    }
    
    public LISTENELEMENT getNachfolger() {
        return nachfolger;
    }
    public void setNachfolger(LISTENELEMENT l) {
        this.nachfolger = l;
    }
    public int anzahlGeben(int tag, int zeitfenster) {
        if (tag == this.veranstaltung.getTag() && zeitfenster == this.veranstaltung.getZeitfenster())
            return this.nachfolger.anzahlGeben(tag, zeitfenster) + 1;
        else return this.nachfolger.anzahlGeben(tag, zeitfenster);
    }
    
    public void sortiertEinfügen(int tag, int zeitfenster) {
        if (this.veranstaltung.getTag() > tag && this.veranstaltung.getZeitfenster() > zeitfenster) {
            this.nachfolger.sortiertEinfügen(tag, zeitfenster);
        } else {
            // dazwischen einfügen
        }
    }
}
