
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Song> songSearchResults = null;
        ArrayList<Artist> artistSearchResults = null;

        Artist artistObject = null;
        Scanner scanner = new Scanner(System.in);
        int option;
        String name;
        String nationality;
        int duration;
        String album;
        String artist;

        while(true) {
            System.out.println("\nSelect an option: ");
            System.out.println("[1] Add a song");
            System.out.println("[2] Add an artist");
            System.out.println("[3] Search artist by name");
            System.out.println("[4] Search artist by nationality");
            System.out.println("[5] Search song by album");
            System.out.println("[6] Exit");
            System.out.print("> ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    System.out.print("Duration: ");
                    duration = Integer.parseInt(scanner.nextLine());
                    System.out.print("Album: ");
                    album = scanner.nextLine();
                    System.out.print("Artist: ");
                    artist = scanner.nextLine();

                    new Song(name, duration, album, artist);
                    break;

                case 2:
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    System.out.print("Nationality: ");
                    nationality = scanner.nextLine();

                    new Artist(name, nationality);
                    break;

                case 3:

                    artistObject = null;

                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Results:");
                    artistObject = Artist.getArtistByName(name);
                    if(artistObject == null) {
                        System.out.println("There is no artist matching that name");
                        break;
                    }

                    artistObject.printData();
                    break;

                case 4:

                    artistSearchResults = null;

                    System.out.println("Nationality: ");
                    nationality = scanner.nextLine();

                    artistSearchResults = Artist.getArtistByNationality(nationality);

                    System.out.println("Results: ");
                    if(artistSearchResults.isEmpty()) {
                        System.out.println("There are no artists matching that nationality");
                        break;
                    }
                    for(Artist a : artistSearchResults) {
                        a.printData();
                        System.out.println("##################");
                    }


                    break;

                case 5:

                    songSearchResults = null;

                    System.out.print("Album: ");
                    album = scanner.nextLine();
                    songSearchResults = Song.getSongsByAlbum(album);

                    System.out.println("Results: ");
                    if(songSearchResults.isEmpty()) {
                        System.out.println("There are no songs matching that album");
                        break;
                    }
                    for(Song s : songSearchResults) {
                        s.printData();
                        System.out.println("##################");
                    }
                    break;

                case 6:
                    System.exit(0);
            }
        }



    }
}