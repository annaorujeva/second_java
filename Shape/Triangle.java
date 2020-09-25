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
        double p = (this.a + this.b + this.c)/2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }
}
