
public class VERANSTALTUNGSLISTE
{
    private LISTENELEMENT anfang;
    
    public void sortiertEinfügen(int tag, int zeitfenster) {
        this.anfang.sortiertEinfügen(tag, zeitfenster);
    }
    
    public int anzahlGeben(int tag, int zeitfenster) {
        return this.anfang.anzahlGeben(tag, zeitfenster);
    }
}
