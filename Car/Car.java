package app;
/*Создать абстрактный класс класс Car, и класс Engine
Класс Engine содержит поля - мощность, производитель.
Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, мотор типа Engine.
Абстрактные методы start(), stop(), и реализованные методы turnRight(), turnLeft()
Методы turnRight() и turnLeft() выводят на экран: "Поворот направо" или "Поворот налево".
Абстрактный метод printInfo(), который выводит полную информацию об автомобиле, и моторе. 
*/


public abstract class Car {
    public String brand;
    public String classofcar;
    public double weight;
    public Engine motor;

    public Car(String abrand, String aclassofcar, double aweight, Engine amotor){
        this.brand = abrand;
        this.classofcar = aclassofcar;
        this.weight = aweight;
        this.motor = amotor;
    }

    public abstract void stop();
    public abstract void start();
    public abstract String printInfo();

    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

}
