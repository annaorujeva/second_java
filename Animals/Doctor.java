package app;

public class Doctor{
    public  void treatAnimal(Animal animal){
        System.out.println(animal.getFood() + " " + animal.getLocation() + " " + animal.typeofanimal);
    }
}
