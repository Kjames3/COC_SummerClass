import java.util.Arrays;
import java.util.Scanner;

public class Chapter5_Program3 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String[] validStudentStatuses = {
                "UG",
                "G",
                "DL"
        };
        double homeworkPoints, quizPoints, midtermPoints, finalPoints;
        double maxHomeworkPoints = 800;
        double maxQuizPoints = 400;
        double maxMidtermPoints = 150;
        double maxFinalPoints = 200;

        String studentStatus = scanner.next();
        homeworkPoints = scanner.nextDouble();
        quizPoints = scanner.nextDouble();
        midtermPoints = scanner.nextDouble();
        finalPoints = scanner.nextDouble();

        if (!Arrays.asList(validStudentStatuses).contains(studentStatus)) {
            System.out.println("Error: student status must be UG, G, or DL");
            return;
        }

        double homeworkGrade = (homeworkPoints / maxHomeworkPoints) * 100;
        double quizGrade = (quizPoints / maxQuizPoints) * 100;
        double midtermGrade = (midtermPoints / maxMidtermPoints) * 100;
        double finalGrade = (finalPoints / maxFinalPoints) * 100;

        homeworkGrade = Math.min(homeworkGrade, 100);
        quizGrade = Math.min(quizGrade, 100);
        midtermGrade = Math.min(midtermGrade, 100);
        finalGrade = Math.min(finalGrade, 100);

        printGrades(homeworkGrade, quizGrade, midtermGrade, finalGrade);

        double courseAverage = 0.0;

        switch (studentStatus) {
            case "UG":
                courseAverage = homeworkGrade * 0.20 + quizGrade * 0.20 + midtermGrade * 0.30 + finalGrade * 0.30;
                System.out.printf("UG average: %.1f%%%n", courseAverage);
                break;
            case "G":
                courseAverage = homeworkGrade * 0.15 + quizGrade * 0.05 + midtermGrade * 0.35 + finalGrade * 0.45;
                System.out.printf("G average: %.1f%%%n", courseAverage);
                break;
            case "DL":
                courseAverage = homeworkGrade * 0.05 + quizGrade * 0.05 + midtermGrade * 0.40 + finalGrade * 0.50;
                System.out.printf("DL average: %.1f%%%n", courseAverage);
                break;
        }

        char courseGrade = 'F';
        if (courseAverage >= 90.0) {
            courseGrade = 'A';
        } else if (courseAverage >= 80.0) {
            courseGrade = 'B';
        } else if (courseAverage >= 70.0) {
            courseGrade = 'C';
        } else if (courseAverage >= 60.0) {
            courseGrade = 'D';
        }

        System.out.printf("Course Grade: %c%n", courseGrade);
    }

    public static void printGrades(double homeworkGrade, double quizGrade, double midtermGrade, double finalGrade) {
        System.out.printf("Homework: %.1f%%%n", homeworkGrade);
        System.out.printf("Quizzes: %.1f%%%n", quizGrade);
        System.out.printf("Midterm: %.1f%%%n", midtermGrade);
        System.out.printf("Final Exam: %.1f%%%n", finalGrade);
    }
}
