package Student;

public class Main {
    public static void main(String[] args) {
    
        Student s = new Student("Sarah Mae Suyat", "IT21C", "Trust the timing of your life");
        
        System.out.println("Name: " + s.getName());
        System.out.println("Section: " + s.getSection());
        System.out.println("Motto: " + s.getMotto());
    }
}