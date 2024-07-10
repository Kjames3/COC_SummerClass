import java.util.Scanner;

public class Chapter13_Program3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Course myCourse = new Course();
        OfferedCourse myOfferedCourse = new OfferedCourse();

        String courseNumber, courseTitle;
        String oCourseNumber, oCourseTitle, instructorName, location, classTime;

        courseNumber = scanner.nextLine();
        courseTitle = scanner.nextLine();

        oCourseNumber = scanner.nextLine();
        oCourseTitle = scanner.nextLine();
        instructorName = scanner.nextLine();
        location = scanner.nextLine();
        classTime = scanner.nextLine();

        myCourse.setCourseNumber(courseNumber);
        myCourse.setCourseTitle(courseTitle);
        myCourse.printInfo();

        myOfferedCourse.setCourseNumber(oCourseNumber);
        myOfferedCourse.setCourseTitle(oCourseTitle);
        myOfferedCourse.setInstructorName(instructorName);
        myOfferedCourse.setLocation(location);
        myOfferedCourse.setClassTime(classTime);
        myOfferedCourse.printInfo();

        System.out.println("    Instructor Name: " + myOfferedCourse.getInstructorName());
        System.out.println("    Location: " + myOfferedCourse.getLocation());
        System.out.println("    Class Time: " + myOfferedCourse.getClassTime());
    }
}
