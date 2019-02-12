package B;

public class Circle extends Shape{
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*this.radius*this.radius;
    }

    @Override
    public double getPerimeter() {
       return 2*3.14*this.radius;
    }

    @Override
    public String getShapeType() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }
    
    
}
