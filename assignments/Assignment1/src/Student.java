public class Student {

//    Fields
    private String name;
    private int age;
    private String studentID;

    public static String universityName = "Ontario Tech University";

//    Default Constructor
    public Student(){}

//    Constructor that initializes all the fields
    public Student(String name, int age, String studentID){
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

//    Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

//    To print the details of the Student
    public void displayDetails() {
        System.out.println("---- Student Details ----");
        String studentInfo = "College: %s \nStudent Name: %s \nStudent Age: %d \nStudent ID: %s \n";
        String result = String.format(studentInfo, Student.universityName, this.getName(), this.getAge(), this.getStudentID());
        System.out.println(result);
    }

//    Method to change the universityName
    public static void changeUniversityName(String newName) {
        Student.universityName = newName;
    }
}

