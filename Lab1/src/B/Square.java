package B;

public class Square extends Rectangle{
    double size;
      
    public Square(double size){
        super(size, size);
    }
    
   
    public String getShapeType(){
        return "Square";
    }
    
}
