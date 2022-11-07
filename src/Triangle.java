public class Triangle implements Shape {

    double base;
    double height;
    Double area;

    @Override
    public void calcArea() {
        this.area = this.area * this.height / 2;
        
    }

    @Override
    public boolean isGoodInput(String input) {
        return new CheckInput().isGoodInput(input);
    }
    
}
