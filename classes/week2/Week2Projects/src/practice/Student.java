package practice;

public class Student {

//    Attributes
    private String id;
    private String firstName;
    private String lastName;
    private int age;

//    Skeleton Constructor
    public Student(){}

//    Constructor with the arguments
//    (this) is a reference to the current instance of the class
    public Student(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

//    getter methods
    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

//    setter methods
    public void setId(String id){
        this.id = id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

//    pp
    public String fullName(){
        return this.getFirstName() + " " + this.getLastName();
    }
}

