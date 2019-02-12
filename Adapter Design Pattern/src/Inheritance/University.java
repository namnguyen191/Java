package A;

import java.util.ArrayList;

public class University {
    private ArrayList<Person> people;
    private String name;
    private ArrayList<Course> courses;
    
    public University(String name){
        this.name = name;
        this.people = new ArrayList<Person>();
    }
    
    public void addPerson(Person person){
        this.people.add(person);
    }
    
    public ArrayList<Person> getPeople(){
        return this.people;
    }
    
    public int getNumPeople(){
        int numPeople = (this.people).size();
        return numPeople;
    }
    
    public void addCourse(Course course){
        this.courses.add(course);
    }
    
    public int getNumCourses(){
        int numCourses = 0;
        return numCourses;
    }
    
    public ArrayList<Course> getCourses(){
        return this.courses;
    }
    
    public String getName(){
        return  this.name;
    }
    
}
