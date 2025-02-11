public class Main {
    public static void main(String[] args) {

//        Instantiate Student objects
        Student student1 = new Student("Sanyam", 19, "100963204");
        Student student2 = new Student("Mohammed Karim", 21, "10100075");

//        Calling displayDetails() on Student1 and Student2
        student1.displayDetails();
        student2.displayDetails();

//        Updating Student2 info with setter methods
        student2.setName("Baljinder");
        student2.setAge(23);
        student2.setStudentID("100852145");

//        Print the Updated details for Student2
        System.out.println("---- Updated Student 2 Details ----\n");
        String studentInfo = "College: %s \nStudent Name: %s \nStudent Age: %d \nStudent ID: %s \n";
        String result = String.format(studentInfo, Student.universityName, student2.getName(), student2.getAge(), student2.getStudentID());
        System.out.println(result);

//        Using the changeUniversityName() to change the university name
        Student.changeUniversityName("Durham College");

//        Checking if the change is reflected for all the instances of Student
        System.out.println("----Displaying student details with updated college name.----\n");
        student1.displayDetails();
        student2.displayDetails();
    }
}