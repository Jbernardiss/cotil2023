public class DVD extends GenericItem{

    private int length;

    public DVD(int id, String name, double price, int length) {

        super(id, name, price);
        this.length = length;
    }

    @Override
    public String toString() {

        String returnString = super.toString();
        returnString += "Length: " + length + "min\n";

        return returnString;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
