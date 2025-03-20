// Name: Sanyam Singh Sachdeva (100963204 )
// Date: March 19, 2025
// Description: Practicing exception handling in Java.
package org.dc.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            int passedStudents = 0; // To store passed students
            int failedStudents = 0; // To store failed students

//            Run until the user says no
            while (true) {
                System.out.println("\n*****Add a new student******");
                System.out.print("Name of the Student: "); // Ask for the name of the student
                String studentName = myScanner.nextLine();

                System.out.print("Student grade: "); // Ask for the grade of the student
                String studentGrade = myScanner.nextLine();

    //        Initialize a student object with the provided name and grade
                Student student = new Student();
                student.setName(studentName);
                try {
                    student.setGrades(Double.parseDouble(studentGrade));
//                    Check if the student passed or not
                    if (student.result()) passedStudents++;
                    else failedStudents++;
                } catch (NumberFormatException e) {
                    System.out.println("The input needs to number.");
                } catch (InvalidGradeException e) {
                    System.out.println(e.getMessage());
                }

//                Ask the user, if they want to continue
                System.out.println("Do you want to add more students? (y/n): ");
                String userResponse = myScanner.nextLine();
                if (!userResponse.equals("y")) {
                    break;
                }
            }

//        Display the number of students who passed and failed
            System.out.println("The number of students who passed the tests: " + passedStudents);
            System.out.println("The number of students who failed the tests: " + failedStudents);

        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}