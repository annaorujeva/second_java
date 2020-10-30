//Здесь тестируются написанные классы
package app;

public class main_class {
    public static void main(String[] args){
        Animal[] animals = new Animal[3];
        Doctor AnnaDoctor = new Doctor();
        animals[0] = new Dog("Oddi","Bones", "House #1", "Dog");
        animals[1] = new Cat("Jane","Fish", "House #2", "Cat");
        animals[2] = new Horse("Qwer","Grass", "House #3", "Horse");
        for (Animal animal : animals) {
            AnnaDoctor.treatAnimal(animal);
        }
        Dog doggy = new Dog("Никки","корм","квартира","маленький пес");
        doggy.setWeight(5);
        System.out.println(doggy.getWeight());
        System.out.println(doggy.getTypeofanimal());
        doggy.sleep();
        doggy.eat();
        doggy.makeNoise();
        animals[2].eat();
        animals[2].makeNoise();
        animals[2].sleep();
    }
}
