import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        super();
        setLocation(x, y);  // Set the location (x, y)
        setSize(width, height);  // Set the size (width, height)
    }
    public int getArea() {
        return width * height;
    }
    public int getPerimeter() {
        return 2 * (width + height);
    }
}
