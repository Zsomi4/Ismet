import java.util.Scanner;

public class ShapeArea {
    public void triangle() {
       try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Alap: ");
           String baseStr = scan.nextLine();
           System.out.println("Magasság: ");
           String heightStr = scan.nextLine();

           Triangle triangle = new Triangle();
           boolean good = true;
           good = triangle.isGoodInput(baseStr);
           good = triangle.isGoodInput(heightStr);
           if (good) {
            triangle.base = Double.parseDouble(baseStr);
            triangle.height = Double.parseDouble(heightStr);
            triangle.calcArea();
            System.out.println("Háromszög területe: " + triangle.area);
           }
    } catch (NumberFormatException e) {
        e.printStackTrace();
    }
    }
    
}
