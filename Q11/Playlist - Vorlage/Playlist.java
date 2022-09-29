public class Playlist {
    private Warteschlange songs;
    private MUSIKPLAYER musikplayer;

    public Playlist() {
        this.songs = new Warteschlange();
        this.musikplayer = new MUSIKPLAYER();
    }

    public void starten() {
        Song song = this.songs.getAnfang();
        this.musikplayer.starten(String.format("%s-%s.mp3", song.getInterpret(), song.getTitle()));
    }

    public void stoppen() {
        this.musikplayer.stoppen();
    }

    public void hinzufügen(Song song) {
        this.songs.einfügen(new Knoten(song));
    }

}
