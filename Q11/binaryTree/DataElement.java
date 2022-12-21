public interface DataElement {
    public DataElement getData();
    
    public String getWord();
    
    public boolean istGleich(String vergleich);
    
    public boolean istKleinerAls(String vergleich);
    
    public boolean istGrößerAls(String vergleich);
}
