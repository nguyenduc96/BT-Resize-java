import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 100);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "infinity", true);
        shapes[2] = new Square(x, "melinda", true);
        for (Shape a : shapes){
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize(Math.random() * 100);
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(shapes));
    }
}
