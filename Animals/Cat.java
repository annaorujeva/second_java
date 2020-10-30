package app;

public class Cat extends Animal{
    private int numofkittens;

    public Cat(String aName, String aFood, String aLocation, String aType) {
        super(aName, aFood, aLocation, aType);
    }
    public void setNumofkittens(int countKittens){
        this.numofkittens = countKittens;
    }
    public int getNumofkittens(){
        return numofkittens;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот " + name +" мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кот " + name + " ест " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Кот " + name +" спит");
    }
}
