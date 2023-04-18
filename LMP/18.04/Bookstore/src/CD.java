public class CD extends GenericItem{

    private int numberOfTracks;

    public CD(int id, String name, double price, int numberOfTracks) {
        super(id, name, price);
        this.numberOfTracks = numberOfTracks;
    }

    @Override
    public String toString() {
        String returnString = super.toString();
        returnString += "Number of tracks: " + numberOfTracks + "\n";

        return returnString;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }
}
