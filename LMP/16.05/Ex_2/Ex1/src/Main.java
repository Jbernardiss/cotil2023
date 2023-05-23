public class Main {
    public static void main(String[] args) {

        Object o = null;
        try {
            o.toString();
        } catch (NullPointerException e) {
            System.out.println("Can't turn a null object into a string");
        }


    }
}