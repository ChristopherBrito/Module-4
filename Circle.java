public class Circle extends Shape {
    
    public Circle(int numOfSides) {
    super(numOfSides);
    
    }
    @Override
    public String toString() {
        return "Circle [Number of sides: " + getNumOfSides() + "]";
    }
    
}
