
/**
 * Tragen Sie hier eine Beschreibung des Interface DATENELEMENT ein.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public interface DATENELEMENT
{
    public String getWort();
    
    public boolean istGleich(DATENELEMENT vergleich);
    
    public boolean istKleinerAls(DATENELEMENT vergleich);
    
    public boolean istGrößerAls(DATENELEMENT vergleich);
    
    public boolean istGleich(String vergleich);
    
    public boolean istKleinerAls(String vergleich);
    
    public boolean istGrößerAls(String vergleich);
}
