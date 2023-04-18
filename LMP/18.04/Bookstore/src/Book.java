public class Book extends GenericItem {

    private String author;

    public Book(int id, String name, double price, String author) {
        super(id, name, price);
        this.author = author;
    }

    @Override
    public String toString() {
        String returnString = super.toString();
        returnString += "Author: " + author + "\n";

        return returnString;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
