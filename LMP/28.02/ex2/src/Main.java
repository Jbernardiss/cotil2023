public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(001, "item lessgooo", 5, 10);

        System.out.println("ID: " + item1.getId());
        System.out.println("Desc: " + item1.getDescription());
        System.out.println("Units sold: " + item1.getUnitsSold());
        System.out.println("Price: " + item1.getPrice());
        System.out.println("Total Gross Revenue: " + item1.getTotal());
    }
}