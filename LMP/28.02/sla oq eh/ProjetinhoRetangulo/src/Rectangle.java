import java.lang.RuntimeException;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public double getHeight() {
        return height;
    }

    public boolean setHeight(double height) {
        if(height >= 1 && height <= 20) {
            this.height = height;
            return true;
        } else {
            return false;
        }
    }

    public double getWidth() {
        return width;
    }

    public boolean setWidth(double width) {

        if(width >= 1 && width <= 20) {
            this.width = width;
            return true;
        } else {
            return false;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }
}
