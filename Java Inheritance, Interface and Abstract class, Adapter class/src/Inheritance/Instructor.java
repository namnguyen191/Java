package A;

public class Instructor extends Person {
    private Course course;

    public Instructor(int id, String name) {
        super(id, name);
    }
    
    public void setCourse(Course course){
        this.course = course;
    }
    
    public Course getCourse(){
        return this.course;
    }
    
}
