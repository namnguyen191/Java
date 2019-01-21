package B;

public class Rectangle extends Quadrilateral{

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*(this.getHeight()+this.getWidth());
    }

    @Override
    public String getShapeType() {
        return "Rectangle";
    }
    
}
