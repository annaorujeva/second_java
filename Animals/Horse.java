package app;

public class Horse extends Animal{
        private double height;
        public Horse(String aFood, String aLocation, String aType) {
            super(aFood, aLocation, aType);
        }
        public void setHeight(float aHeight){
            this.height = aHeight;
        }
        public double getHeight(){
            return height;
        }
}
