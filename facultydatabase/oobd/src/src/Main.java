package src;

public class Main {
    public static void main(String[] args) {

        Database db = new Database();

        // Add Departments
        db.addDepartment(new Department("Computer Science"));
        db.addDepartment(new Department("Engineering"));

        // Add Faculty
        db.addFaculty(new Faculty("Dr. Ali", "ali@uni.edu", "Computer Science"));
        db.addFaculty(new Faculty("Dr. Sara", "sara@uni.edu", "Engineering"));

        // Add Courses
        db.addCourse(new Course("OOP", 3));
        db.addCourse(new Course("Database Systems", 4));

        // Show all faculty
        System.out.println("=== All Faculty ===");
        for (Faculty f : db.getAllFaculty()) {
            System.out.println(f.getId() + ": " + f.getName() + " - " + f.getDepartment());
        }

        // Update faculty example
        db.updateFaculty(1, "Dr. Ali Hassan", "alih@uni.edu", "Computer Science");

        // Delete faculty example
        db.deleteFaculty(2);

        System.out.println("\n=== After Update & Delete ===");
        for (Faculty f : db.getAllFaculty()) {
            System.out.println(f.getId() + ": " + f.getName() + " - " + f.getDepartment());
        }
    }
}