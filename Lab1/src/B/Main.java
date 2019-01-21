package B;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(3,4));
        shapes.add(new Square(3));
        shapes.add(new Triangle(3,5,3,2));
     
        for(Shape s : shapes){
            System.out.println(s.toString());
        }
        
        System.out.print("Sorting...\nSorted Arraylist:\n");
        shapes.sort(new ShapeComparator());
        for (Shape s : shapes){
            System.out.println("Id: " + s.getId() + ". " + s.toString() + " with a perimeter of: " + s.getPerimeter());
        }
        
    }
    
}
