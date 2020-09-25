package app;
/*Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью start(), stop().
Метод start – выводит на экран «SportCar поехал», метод stop - «SportCar остановился».
*/

public class SportCar {
    public double max_v;

    public void start(){
        System.out.println("SportCar поехал");
    }
    public void stop(){
        System.out.println("SportCar остановился");
    }
}
