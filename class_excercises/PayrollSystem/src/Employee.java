public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    private static final double taxRate = 0.25;

//    Default constructor
    public Employee(){}

//    Constructor with the parameters
    public Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

//    Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    method that computes the net salary
    public double calculateNetSalary(){
        return (this.salary - (this.salary * Employee.taxRate));
    }

//    method to display employee details
    public void displayDetails(){
        System.out.println("Employee's ID: " + this.getId());
        System.out.println("Employee's Name: " + this.getName());
        System.out.println("Employee's Department: " + this.getDepartment());
        System.out.println("Employee's Salary: " + this.getSalary());
        System.out.println("Employee's Net Salary: " + this.calculateNetSalary() + "\n");
    }
}
