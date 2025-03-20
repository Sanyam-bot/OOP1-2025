package org.dc.exception;

public class Student {
    private String name;
    private Double grades;

    private static final int GRADE_LOWER_THRESHOLD = 0;
    private static final int GRADE_UPPER_THRESHOLD = 100;
    private static final double PASSING_THRESHOLD = 50;


    private static int studentCount = 0;

    public Student() { // Constructor
        studentCount++;
    }

//    Getter and Setters for name and grades
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrades() {
        return grades;
    }

    public void setGrades(Double grades) throws InvalidGradeException{
        if (grades < GRADE_LOWER_THRESHOLD || grades > GRADE_UPPER_THRESHOLD) { // throw an error, if values are outside the range of 50 to 100.
            throw new InvalidGradeException("The grades can only range from " + GRADE_LOWER_THRESHOLD + " to " + GRADE_UPPER_THRESHOLD);
        }
        this.grades = grades;
    }

    public boolean result() { // Returns true, if the student passed.
        return grades >= PASSING_THRESHOLD;
    }
}
