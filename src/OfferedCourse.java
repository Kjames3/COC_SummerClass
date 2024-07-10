public class OfferedCourse {
    // TODO: Declare private fields
    private String instructorName;
    private String location;
    private String classTime;
    private Course course;

    // TODO: Define mutator methods -
    // setInstructorName(), setLocation(), setClassTime()
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public void setCourseNumber(String courseNumber) {
        course = new Course();
        course.setCourseNumber(courseNumber);
    }


    // TODO: Define accessor methods -
    // getInstructorName(), getLocation(), getClassTime()
    public String getInstructorName() {
        return instructorName;
    }

    public String getLocation() {
        return location;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setCourseTitle(String courseTitle) {
        course.setCourseTitle(courseTitle);
    }

    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + course.getCourseNumber());
        System.out.println("   Course Title: " + course.getCourseTitle());
//        System.out.println("   Instructor: " + instructorName);
//        System.out.println("   Location: " + location);
//        System.out.println("   Class Time: " + classTime);
    }
}
