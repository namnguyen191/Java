package A;

public class Course {
    private String name;
    private int number;
    
    public Course(int number, String name){
        this.number = number;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getNumber(){
        return this.number;
    }
}
