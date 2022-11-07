public class Circle implements Shape {

    double radius;
    Double area;

    @Override
    public void calcArea() {
        this.area = Math.pow(this.radius, 2) * Math.PI;
        
    }

    @Override
    public boolean isGoodInput(String input) {
        return new CheckInput().isGoodInput(input);
    }
    
}
