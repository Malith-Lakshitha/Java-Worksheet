public class Q4 {

    static class Course {
        private String courseName;
        private String courseCode;
        private Lecturer lecturer;

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        public Lecturer getLecturer() {
            return lecturer;
        }

        public void setLecturer(Lecturer lecturer) {
            this.lecturer = lecturer;
        }
    }

    static class Lecturer {
        private String lecturerName;
        private String courseTeaching;

        public String getLecturerName() {
            return lecturerName;
        }

        public void setLecturerName(String lecturerName) {
            this.lecturerName = lecturerName;
        }

        public String getCourseTeaching() {
            return courseTeaching;
        }

        public void setCourseTeaching(String courseTeaching) {
            this.courseTeaching = courseTeaching;
        }
    }

    static class Student {
        private String studentName;
        private String degreeName;
        private String courseFollowing;

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public String getCourseFollowing() {
            return courseFollowing;
        }

        public void setCourseFollowing(String courseFollowing) {
            this.courseFollowing = courseFollowing;
        }
    }

    public static void main(String[] args) {

        Lecturer lec = new Lecturer();
        lec.setLecturerName("Dr. Perera");
        lec.setCourseTeaching("Object Oriented Programming");

        Course course = new Course();
        course.setCourseName("OOP");
        course.setCourseCode("CS101");
        course.setLecturer(lec);

        Student stu = new Student();
        stu.setStudentName("Malith");
        stu.setDegreeName("BSc Computer Science");
        stu.setCourseFollowing("OOP");

        System.out.println(course.getCourseName());
        System.out.println(course.getCourseCode());
        System.out.println(course.getLecturer().getLecturerName());
        System.out.println(stu.getStudentName());
        System.out.println(stu.getDegreeName());
        System.out.println(stu.getCourseFollowing());
    }
}

