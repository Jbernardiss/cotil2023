public class Livro extends Produto{

    private String title;

    public Livro(int id, String desc, String title) {
        super(id, desc);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void read() {
        System.out.println("Reading book...");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Title: " + title);
    }
}
