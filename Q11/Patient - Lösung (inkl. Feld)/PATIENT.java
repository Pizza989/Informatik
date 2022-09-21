
/**
 * Beschreiben Sie hier die Klasse Patient.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PATIENT
{
    private String name;
    private String krankheit;
    private PATIENT nachfolger;
    
    public PATIENT(String n, String k) {
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

    public void setNachfolger(PATIENT p) {
        nachfolger = p;
    }

    public PATIENT getNachfolger(){
        return nachfolger;
    }
}
