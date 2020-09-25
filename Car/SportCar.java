package app;
/*Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью start(), stop().
Метод start – выводит на экран «SportCar поехал», метод stop - «SportCar остановился».
*/

public class SportCar extends Car {
    public double max_v;

    public SportCar(String abrand, String aclassofcar, double aweight, Engine amotor, double amax_v){
        super(abrand, aclassofcar, aweight, amotor);
        this.max_v = amax_v;

    }

    public void start(){
        System.out.println("SportCar поехал");
    }
    public void stop(){
        System.out.println("SportCar остановился");
    }
    public String printInfo(){
        return (this.brand + this.classofcar + this.weight + this.max_v + this.motor);
    }
}

