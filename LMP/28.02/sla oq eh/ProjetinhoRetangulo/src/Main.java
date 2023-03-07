
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double height;
        double width;

        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the the rectangle's height(between 1u and 20u): ");
        height = scanner.nextDouble();
        System.out.print("Enter the the rectangle's width(between 1u and 20u): ");
        width = scanner.nextDouble();

        if(rectangle.setWidth(width) && rectangle.setHeight(height)) {
            System.out.println("Area: " + rectangle.getArea());
            System.out.println("Perimeter: " + rectangle.getPerimeter());
        } else {
            System.out.println("Number out of range");
        }
    }
}
