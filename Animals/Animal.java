package app;
/*Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
Пусть этот метод распечатывает food и location пришедшего на прием животного.
В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
В цикле отправляйте их на прием к ветеринару.*/
public class Animal {
    public String food;
    public String location;
    public String typeofanimal;

    public Animal(String aFood, String aLocation, String atypeofanimal) {
        this.food = aFood;
        this.location = aLocation;
        this.typeofanimal = atypeofanimal;
    }


    public void makeNoise(){
        System.out.println("Животное не спит");
    }
    public void eat(){
        System.out.println("Животное ест");
    }
    public void sleep(){
        System.out.println("Животное спит");
    }

    public String getFood(){
        return food;
    }
    public String getLocation(){
        return location;
    }
    public String getTypeofanimal(){
        return typeofanimal;
    }
    public void setFood(String aFood){
        this.food = aFood;
    }
    public void setLocation(String aLocation){
        this.location = aLocation;
    }
    public void setTypeofanimal(String aTypeofanimal){
        this.location = aTypeofanimal;
    }

}
