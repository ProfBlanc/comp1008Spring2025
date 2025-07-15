package assignment1;


import java.io.Console;
import java.util.Scanner;

public class GradeBook {

    // Array to store the student
    static Student[] students;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        students = new Student[setStudentNumber()];

        // Loop to input each student's name and scores
        for (int i = 0; i < students.length; i++) {

            String studentName = setStudentName(i);
            double[] scores = setSubjectsScores(setStudentSubjectsNumber(studentName), studentName);

            students[i] = new Student(studentName, scores);
            System.out.print("\n");
        }

        // to display each student's average score and grade
        for (Student student : students) {
            System.out.printf("Student: %s, Average: %.2f, Grade %s%n",
                    student.getName(), student.getAverage(), student.getGrade());
        }
    }

    // to set the scores for the subjects for the student.
    private static double[] setSubjectsScores(int subjectsNumber, String studentName) {
        double[] scores = new double[subjectsNumber];
        for (int j = 0; j < scores.length; j++) {
            System.out.print("Enter " + studentName + "'s score " + (j + 1) + ": ");
            double scoreInput;
            // Validate input as a double
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Defaulting to 50.");
                sc.next();
                scoreInput = 50.0;
            } else {
                scoreInput = sc.nextDouble();
            }
            scores[j] = scoreInput >= 0 && scoreInput <= 100 ? scoreInput : 50;
            sc.nextLine();
        }
        return scores;
    }

    // to set the number of subject for every student
    private static int setStudentSubjectsNumber(String studentName) {
        int subjectInput = 3;
        System.out.printf("Enter the number of scores for %s (between 3 and 6): ", studentName);
        // Validate input as integer
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Defaulting to 3 subjects.");
            sc.next();
        } else {
            subjectInput = sc.nextInt();
        }
        // to Check if the input is within the allowed range
        if (subjectInput < 3) {
                System.out.println("Too few subjects. Defaulting to 3.");
                subjectInput = 3;
            } else if (subjectInput > 6) {
                System.out.println("Too many subjects. Defaulting to 6.");
                subjectInput = 6;
            }
            return subjectInput;
        }

    // to set the student name
    private static String setStudentName(int studentNumber) {
        Console console = System.console();
        System.out.print("Enter the name of student " + (studentNumber + 1) + ": ");
        String inputName = console.readLine();
        return inputName.length() >= 3 ? inputName : "Student " + (studentNumber + 1);
    }

    // to set the number of student
    private static int setStudentNumber() {
        int numberOfStudents;
        System.out.print("Enter the number of students: ");
        // Validate input as integer
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Defaulting to 1 student.");
            sc.next();
            numberOfStudents = 1;
        } else {
            int input = sc.nextInt();
            numberOfStudents = (input >= 1 && input <= 50) ? input : 1;
        }
        return numberOfStudents;
    }
}
