package app;

public class Dog extends Animal{
    private double weight;

    public Dog(String aFood, String aLocation, String aType) {
        super(aFood, aLocation, aType);
    }
    public void setWeight(float aWeight){
        this.weight = aWeight;
    }
    public double getWeight(){
        return weight;
    }
}
