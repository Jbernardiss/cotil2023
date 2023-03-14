public class TempConversion {

    public static double toCelsius(double fahrenheit) {

        return (fahrenheit - 32)/1.8;
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

}
