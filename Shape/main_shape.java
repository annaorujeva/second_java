package app;

public class main_shape {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(3, 5, 4);
        shape[1] = new Circle(2);
        shape[2] = new Rectangle(1, 2);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}
