package app;
/*Создать интерфейс Shape с методом square, который возвращает площадь фигуры.
Создать классы: Circle, Triangle, Rectangle реализующие этот интерфейс
Метод main должен выглядеть так:
public static void main(String[] args) {
Shape[] shape = new Shape[3];
shape[0] = new Triangle();
shape[1] = new Circle();
shape[2] = new Rectangle();
for (Shape sh: shape){
System.out.println("Площадь фигуры: "+sh.square());
}
}
*/

public interface Shape {
    public double square();
}
