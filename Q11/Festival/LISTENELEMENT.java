
public abstract class LISTENELEMENT
{
    private LISTENELEMENT nachfolger;
    public abstract LISTENELEMENT getNachfolger();
    public abstract void setNachfolger(LISTENELEMENT l);
    public abstract int anzahlGeben(int tag, int zeitfenster);
    public abstract void sortiertEinfügen(int tag, int zeitfenster);
}
