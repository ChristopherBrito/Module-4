public class Shape {
    int numOfSides = 0;
    
    public Shape(int numOfSides) {
    this.numOfSides = numOfSides;
        
    }
    
    public void setNumOfSide(int numOfSides){
     this.numOfSides = numOfSides;   
    }
    
    public int getNumOfSides(){
    return numOfSides;    
    }
    
    @Override
    public String toString() {
        return "Shape [Number of sides: " + numOfSides + "]";
    }
    
	public static void main(String[] args) {
	
	Shape shape1 = new Circle(0);
	Shape shape2 = new Rectangle(4);
	Shape shape3 = new Shape(9);
	
	System.out.println(shape1);
	System.out.println(shape2);
	System.out.println(shape3);
	    
	}
}
