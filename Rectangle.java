public class Rectangle extends Shape {
 
 public Rectangle(int numOfSides) {
    super(numOfSides);
    }
    
    @Override
    public String toString() {
        return "Rectangle [Number of sides: " + getNumOfSides() + "]";
    }

}
