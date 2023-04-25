import java.util.ArrayList;

public class Song {

    /*
    This class is a whole lotta different(maybe too complicated) so I'm gonna clarify some things here.

    -> There's no need for an external Array containing the objects of the songs since that array is contained
    within the class itself

    -> When making an instance, the object is added to a static ArrayList inside the class

    -> That makes a great system for searching the songs since I can just use methods for searching that go through
    that array

    -> That makes the whole thing safer too since the ArrayList is private. Only the class manipulates it.
     */

    static private ArrayList<Song> songs = new ArrayList<Song>();
    static int newId = 0;

    private int id;
    private String name;
    private int duration;
    private String album;
    private String artist;

    public Song(String name, int duration, String album, String artist) {
        this.id = newId;
        this.name = name;
        this.duration = duration;
        this.album = album;
        this.artist = artist;

        Song.newId++;
        Song.songs.add(this);
    }

    public void printData() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Durations: " + this.duration + "min");
        System.out.println("Album: " + this.album);
        System.out.println("Artist: " + this.artist);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    static public ArrayList<Song> getSongsByAlbum(String album) {
        ArrayList<Song> returnArray = new ArrayList<Song>();

        for(Song s : songs) {
            if(album.equals(s.getAlbum())) {
                returnArray.add(s);
            }
        }

        return returnArray;
    }
}
