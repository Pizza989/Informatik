public class TaxiStand
{
    int anzahl;
    Taxi[] warteschlange;

    public TaxiStand(int anzahl, Taxi... taxis){
        this.anzahl = anzahl;
        this.warteschlange = new Taxi[this.anzahl];
        
        for (Taxi t : taxis) {
            this.anstellen(t);
        }
    }

    Integer getAntahl(){
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
        for (int i = 0; i < this.warteschlange.length; i ++) {
            this.warteschlange[i] = this.warteschlange[i + 1];
        }
    }

    Taxi abfahren(){
        Taxi taxi = this.warteschlange[0];
        this.aufrücken();

        return taxi;
    }
}
