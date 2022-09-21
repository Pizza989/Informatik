public class Taxi
{
    String kennzeichen;
    String fahrname;
    
    public Taxi(String kennzeichen, String fahrname) {
        this.kennzeichen = kennzeichen;
        this.fahrname = fahrname;
    }
    
    String getKennzeichen(){
        return this.kennzeichen;
    }

    void setKennzeichen(String kennzeichen){
        this.kennzeichen = kennzeichen;
    }

    String getFahrname(){
        return this.fahrname;
    }

    void setFahrname(String fahrname){
        this.fahrname = fahrname;
    }

}
