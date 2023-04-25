import java.util.ArrayList;

public class Artist {

    /*
    This class is a whole lotta different(maybe too complicated) so I'm gonna clarify some things here.

    -> There's no need for an external Array containing the objects of the artist since that array is contained
    within the class itself

    -> When making an instance, the object is added to a static ArrayList inside the class

    -> That makes a great system for searching the songs since I can just use methods for searching that go through
    that array

    -> That makes the whole thing safer too since the ArrayList is private. Only the class manipulates it.
    */


    static private ArrayList<Artist> artists = new ArrayList<Artist>();
    static int newId = 0;

    private int id;
    private String name;
    private String nationality;

    public Artist(String name, String nationality) {
        this.id = newId;
        this.name = name;
        this.nationality = nationality;

        Artist.newId++;
        Artist.artists.add(this);
    }

    public void printData() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Nationality: " + this.nationality);
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    static public Artist getArtistByName(String name) {
        for(Artist artist : Artist.artists) {
            if(name.equals(artist.getName())) {
                return artist;
            }
        }

        return null;
    }

    static public ArrayList<Artist> getArtistByNationality(String nationality) {
        ArrayList<Artist> returnArray = new ArrayList<Artist>();

        for(Artist artist : Artist.artists) {
            if(nationality.equals(artist.getNationality())) {
                returnArray.add(artist);
            }
        }

        return returnArray;
    }
}
