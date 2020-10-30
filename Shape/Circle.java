package app;

public class Circle implements Shape{
    public double r;
    public Circle(double radius){
        r = radius;
    }

    public double square(){
        return Math.PI*(r * r);
    }
}
