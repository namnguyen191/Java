package A;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Course> courses;
    private String major;
        
    public Student(int id, String name, String major) {
        super(id, name);
        this.major = major;
        courses = new ArrayList<>();
    }
    
    public void addCourse(Course course){
        this.courses.add(course);
    }
    
    public ArrayList<Course> getCourses(){
        return this.courses;
    }
    
    public String getMajor(){
        return this.major;
    }
    
}
