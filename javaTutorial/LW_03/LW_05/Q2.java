import java.util.ArrayList;

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Lecturer extends Person {
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo() {
        if (department != null) {
            department.displayInfo();
        }
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching() {
        for (Course c : coursesTeaching) {
            c.displayInfo();
        }
    }
}

class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
    }

    public void displayDegreeInfo() {
        if (degree != null) {
            degree.displayInfo();
        }
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    public void listCoursesEnrolled() {
        for (Course c : coursesEnrolled) {
            c.displayInfo();
        }
    }
}

class Degree {
    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, Integer numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Degree Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }
}

class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        this.coursesOffering = new ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Department Name: " + name);
    }

    public void appointDepartmentHead(Lecturer lecturer) {
        this.departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            departmentHead.displayInfo();
        }
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }
}

class Course {
    private String name;
    private String enrollType;
    private Integer numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, Integer numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Enroll Type: " + enrollType);
        System.out.println("Students Enrolled: " + numberOfStudentsEnrolled);
    }

    public void addLecturerInCharge(Lecturer lecturer) {
        this.lecturerInCharge = lecturer;
    }

    public void addDegreeBelongsTo(Degree degree) {
        this.degreeBelongsTo = degree;
    }
}

public class Q2 {
    public static void main(String[] args) {

        Department se = new Department("Software Engineering");
        Degree cs = new Degree("Computer Science", 120);
        Course oop = new Course("Object-Oriented Programming", "Compulsory", 100);

        Lecturer lec1 = new Lecturer("Dr. Silva", "Senior Lecturer", se);
        Student stu1 = new Student("Kamal", "SE2023/001", "2nd Year");

        se.addLecturer(lec1);
        se.appointDepartmentHead(lec1);
        se.offerCourse(oop);

        cs.offerCourse(oop);

        oop.addLecturerInCharge(lec1);
        oop.addDegreeBelongsTo(cs);

        lec1.addCourse(oop);

        stu1.registerDegree(cs);
        stu1.enrollCourse(oop);

        lec1.displayInfo();
        stu1.displayInfo();
        se.displayInfo();
        oop.displayInfo();
        cs.displayInfo();
    }
}
