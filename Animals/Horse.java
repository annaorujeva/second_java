package app;

public class Horse extends Animal{
        private double height;
        public Horse(String aName, String aFood, String aLocation, String aType) {
            super(aName, aFood, aLocation, aType);
        }
        public void setHeight(float aHeight){
            this.height = aHeight;
        }
        public double getHeight(){
            return height;
        }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь " + name +" сказала иго-го");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь " + name + " жует " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь " + name + " просто спит");
    }
}
