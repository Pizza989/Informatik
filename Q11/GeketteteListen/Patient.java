
public class Patient implements DatenElement
{
    private String name;
    private String krankheit;
    private Patient nachfolger;
    
    public Patient(String n, String k) {
        name = n;
        krankheit = k;
        nachfolger = null;
    }

    // Getter- und Setter-Methoden
    public void setName(String n) {
        name = n;    
    }
    
    public String getName() {
        return name;
    }
    
    public void setKrankheit(String k) {
        krankheit = k;
    }
    
    public String getKrankheit() {
        return krankheit;
    }

    public void setNachfolger(Patient p) {
        nachfolger = p;
    }

    public Patient getNachfolger(){
        return nachfolger;
    }

    @Override
    public String ausgeben() {
        return String.format("%s, %s", name, krankheit);
    }
}
