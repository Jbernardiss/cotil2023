public class Produto {
    private int id;
    private String desc;

    public Produto(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void show() {
        System.out.println("ID: " + id);
        System.out.println("Desc: " + desc);
    }
}
