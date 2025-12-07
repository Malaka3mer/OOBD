package src;

import java.util.ArrayList;

public class Database {

    private ArrayList<Faculty> faculties = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();
    // -------------------------------
    // Faculty CRUD
    // -------------------------------
    public void addFaculty(Faculty f) {
        f.setId(faculties.size() + 1);
        faculties.add(f);
    }

    public ArrayList<Faculty> getAllFaculty() {
        return faculties;
    }

    public Faculty getFacultyById(int id) {
        for (Faculty f : faculties) {
            if (f.getId() == id)
                return f;
        }
        return null;
    }

    public boolean updateFaculty(int id, String newName, String newEmail, String newDept) {
        Faculty f = getFacultyById(id);
        if (f != null) {
            f.setName(newName);
            f.setEmail(newEmail);
            f.setDepartment(newDept);
            return true;
        }
        return false;
    }

    public boolean deleteFaculty(int id) {
        Faculty f = getFacultyById(id);
        if (f != null) {
            faculties.remove(f);
            return true;
        }
        return false;
    }

    // -------------------------------
    // Course CRUD
    // -------------------------------
    public void addCourse(Course c) {
        c.setId(courses.size() + 1);
        courses.add(c);
    }

    public ArrayList<Course> getAllCourses() {
        return courses;
    }

    // -------------------------------
    // Department CRUD
    // -------------------------------
    public void addDepartment(Department d) {
        d.setId(departments.size() + 1);
        departments.add(d);
    }

    public ArrayList<Department> getAllDepartments() {
        return departments;
    }
}