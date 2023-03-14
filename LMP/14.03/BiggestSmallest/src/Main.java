


public class Main {
    public static void main(String[] args) {

        System.out.println(BiggestSmallest.findExtremes(5, 4, 3, 2, 1, "b"));
        System.out.println(BiggestSmallest.findExtremes(4, 3, 2, 1, "b"));
        System.out.println(BiggestSmallest.findExtremes(3, 2, 1, "b"));
        System.out.println(BiggestSmallest.findExtremes(2, 1, "b"));
        System.out.println(BiggestSmallest.findExtremes(5, 4, 3, 2, 1, "m"));
        System.out.println(BiggestSmallest.findExtremes(5, 4, 3, 2, "m"));
        System.out.println(BiggestSmallest.findExtremes(5, 4, 3, "m"));
        System.out.println(BiggestSmallest.findExtremes(5, 4,"m"));
    }
}