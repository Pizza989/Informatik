
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
    
    public PATIENT(String n, String k) {
        name = n;
        krankheit = k;
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
}
