package app;

public class main_class {
    public static void main(String[] args){
        Animal[] animals = new Animal[3];
        Doctor AnnaDoctor = new Doctor();
        animals[0] = new Dog("Bones", "House #1", "Dog");
        animals[1] = new Cat("Fish", "House #2", "Cat");
        animals[2] = new Horse("Grass", "House #3", "Horse");
        for (Animal animal : animals) {
            AnnaDoctor.treatAnimal(animal);
        }
        Dog doggy = new Dog("aa","bb","cc");
        doggy.setWeight(9);
        System.out.println(doggy.getWeight());
    }
}
