public class Knoten {
    private Knoten nachfolger;
    public DatenElement objekt;

    public Knoten(DatenElement objekt) {
        this.nachfolger = null;
        this.objekt = objekt;
    }

    public Knoten getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(Knoten nachfolger) {
        this.nachfolger = nachfolger;
    }

    public DatenElement getObjekt() {
        return objekt;
    }

}
