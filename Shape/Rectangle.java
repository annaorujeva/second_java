package app;

public class Rectangle implements Shape{
    public double a;
    public double b;
    public Rectangle(double A, double B){
         a = A;
         b = B;
    }

    public double square(){
        return a * b;
    }

}
