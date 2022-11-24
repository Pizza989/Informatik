
/**
 * Beschreiben Sie hier die Klasse FAKULTÄT.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FAKULTÄT
{
    public FAKULTÄT() {
        
    }
    
    public double berechneFakultätRekursiv(int n) {
        if(n < 2) {
            return 1;
        }
        else {
            return n * berechneFakultätRekursiv(n - 1);
        }
    }
    
    public double berechneFakultätIterativ(int n) {
        double x = 1;
        for (int i = 2; i <= n; i++) {
            x *= i;
        }
        return x;
    }
}
