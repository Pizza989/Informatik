public class TaxiStand
{
    int anzahl;
    Taxi[] warteschlange;

    public TaxiStand(int anzahl){
        this.anzahl = anzahl;
        this.warteschlange = new Taxi[this.anzahl];
    }

    int getAntahl(){
        return this.anzahl;
    }

    void anstellen(Taxi taxi){
        for (int i = 0; i < this.warteschlange.length; i++) {
            if (this.warteschlange[i] == null) {
                this.warteschlange[i] = taxi;
                break;
            }
        }
    }

    void aufrücken(){
        for (int i = 0; i < this.warteschlange.length - 1; i++) {
            if (this.warteschlange[i] == null) break;
            this.warteschlange[i] = this.warteschlange[i + 1];
        }
        this.warteschlange[this.warteschlange.length - 1] = null;
    }

    Taxi abfahren(){
        Taxi taxi = this.warteschlange[0];
        this.aufrücken();

        return taxi;
    }
}
