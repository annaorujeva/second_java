package app;
/*Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузов, реализовать методы start(), stop().
        Метод start – выводит на экран «Грузовик поехал», метод stop - «грузовик остановился».
*/
public class Lorry extends Car {
    public double gruzopod;

    public void start(){
        System.out.println("Грузовик поъехал");
    }
    public void stop(){
        System.out.println("Грузовик остановился");
    }

}