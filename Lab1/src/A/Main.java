package A;

public class Main {

    
    public static void main(String[] args) {
        Instructor alan = new Instructor(111, "Alan");
        Instructor sam = new Instructor(112, "Sam");
        Instructor john = new Instructor(113, "John");
        
        Student nam = new Student(01, "Nam", "IT");
        Student jane = new Student(02, "Jane", "Marketting");
        Student bob = new Student(03, "Bob", "Engineering");
        
        Course dpst = new Course(5424, "Design Pattern");
        Course bigdata = new Course(4521, "Big Data");
        
        nam.addCourse(dpst);
        bob.addCourse(bigdata);
        
        University york = new University("York University");
        york.addPerson(sam);
        york.addPerson(john);
        
        System.out.println("Number of people " + york.getNumPeople());
        
    }
    
}
