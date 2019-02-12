package B;

public abstract class Shape implements Comparable<Shape>{
    private int id;
    private static int NUMSHAPES = 0;
    
    public Shape(){
        this.id = NUMSHAPES;
        NUMSHAPES++;
    }
    
    public static int getNumShapes(){
        return NUMSHAPES;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int compareTo(Shape s){
        return (int)(this.getPerimeter() - s.getPerimeter());
    }
    
    public String toString(){
        return this.getShapeType();
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    public abstract String getShapeType();
}
