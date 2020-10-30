package app;

public class Triangle implements Shape{
    public double a;
    public double b;
    public double c;

    public  Triangle(double A, double B, double C){
        a = A;
        b = B;
        c = C;
    }

    public double square(){
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
