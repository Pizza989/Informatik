import java.util.ArrayList;

/**
 * Beschreiben Sie hier die Klasse PLAYLIST.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PLAYLIST
{
    
    private MUSIKPLAYER musikplayer;
    private int aktuellerSong;
    
    private ArrayList<SONG> songs;

    /**
     * Konstruktor für Objekte der Klasse PLAYLIST
     */
    public PLAYLIST()
    {
        songs = new ArrayList<SONG>();
        musikplayer = new MUSIKPLAYER();
    }
    
    public int getAktuellerSong() {
        return aktuellerSong;
    }
    
    public void initialisieren() {
        aktuellerSong = 0;
    }

    public void starten() {
        SONG song = songs.get(aktuellerSong);
        String interpret = song.getInterpret();
        String titel = song.getTitel();
        String dateiname = interpret + "-" + titel;
        musikplayer.starten(dateiname + ".mp3");
    }

    public void stoppen() {
        musikplayer.stoppen();
        
    }

    public void nächsterSong() {
        if (aktuellerSong + 1 < songs.size()) {
            aktuellerSong += 1;
            starten();
        }
    }
    
    public void hinzufügen(SONG s) {
        songs.add(s);
    }
    
    public void entfernen(SONG s) {
        songs.remove(s);
    }
    
}