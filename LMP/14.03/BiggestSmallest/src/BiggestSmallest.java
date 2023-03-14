
import java.lang.Math;

public class BiggestSmallest {

    public static int findExtremes(int a, int b, int c, int d, int e, String bigMin) {

        if(bigMin == "b") {
            return Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
        } else if(bigMin == "m") {
            return Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        } else {
            return -1;
        }
    }

    public static int findExtremes(int a, int b, int c, int d, String bigMin) {

        if(bigMin == "b") {
            return Math.max(a, Math.max(b, Math.max(c, d)));
        } else if(bigMin == "m") {
            return Math.min(a, Math.min(b, Math.min(c, d)));
        } else {
            return -1;
        }


    }

    public static int findExtremes(int a, int b, int c, String bigMin) {

        if(bigMin == "b") {
            return Math.max(a, Math.max(b, c));
        } else if(bigMin == "m") {
            return Math.min(a, Math.min(b, c));
        } else {
            return -1;
        }
    }

    public static int findExtremes(int a, int b, String bigMin) {

        if(bigMin == "b") {
            return Math.max(a, b);
        } else if(bigMin == "m") {
            return Math.min(a, b);
        } else {
            return -1;
        }
    }
}
