package app;

public class Dog extends Animal{
    private double weight;

    public Dog(String aName, String aFood, String aLocation, String aType) {
        super(aName, aFood, aLocation, aType);
    }
    public void setWeight(float aWeight){
        weight = aWeight;
    }
    public double getWeight(){
        return weight;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака " + name +" гавкает и делает кусь");
    }

    @Override
    public void eat() {
        System.out.println("Собака "+ name +" ест тапки и " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Собака " + name +" спит");
    }
}
