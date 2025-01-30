import java.util.Scanner;

public class PayrollSystem {
    static Employee[] employees = new Employee[5];
    public static void main(String[] args) {
        System.out.println();

        //            To keep track of the index of the employees arrays
        int employeeIndex = 0;

        Scanner inputScanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("\n---- Employee payroll menu ----\n");
            System.out.println("1. Add a new employee");
            System.out.println("2. View all employees");
            System.out.println("3. Search for an employee by ID");
            System.out.println("4. Update an employee’s salary");
            System.out.println("5. Exit the program");

            System.out.print("Select from 1 to 5: ");
            int userInput = inputScanner.nextInt();

            switch(userInput) {
                case 1:
//                Add a new employee
//                Create an instance of the Employee
//                ID
                    System.out.print("Employee ID: ");
                    int employeeId = inputScanner.nextInt();
                    inputScanner.nextLine(); // It consumes the \n character.d
//                Name
                    System.out.print("Employee Name: ");
                    String employeeName = inputScanner.nextLine();
//                Department
                    System.out.print("Employee Department: ");
                    String employeeDepartment = inputScanner.nextLine();
//                Salary
                    System.out.print("Employee Salary: ");
                    double employeeSalary = inputScanner.nextDouble();

                    employees[employeeIndex] = new Employee(employeeId, employeeName, employeeDepartment, employeeSalary);
                    System.out.println("\n---- Employee Details ----");
                    employees[employeeIndex].displayDetails();
                    employeeIndex++;
                    break;
                case 2:
//               View all employees
                    boolean isEmployeesNull = true;

//                    To check if there aren't any employees in the array
                    for (Employee e1 : employees){
                        if (e1 != null) {
                            isEmployeesNull = false;
                            break;
                        }
                    }

                    if (isEmployeesNull) {
                        System.out.println("No available data for employees.");
                    }
                    else {
                        for (Employee e1: employees){
                            if (e1 != null) {
                                System.out.println("\n---- Employee Details ----");
                                e1.displayDetails();
                            }
                        }
                    }
                    break;
                case 3:
//                Search for an employee by ID
                    System.out.println("\n--- Search for an employee by ID: ----");

                    System.out.print("What's the Id of the employee: ");
//                Ask for the employee ID, and then search it.
                    Employee employeeFound = searchEmployeeById(inputScanner.nextInt());

                    if (employeeFound != null){
                        System.out.print("\n");
                        employeeFound.displayDetails();
                    }
                    else {
                        System.out.println("There's no employee with this ID.");
                    }
                    break;
                case 4:
//                Update an employee’s salary
                    System.out.println("--- Update an employee’s salary: ----");
                    System.out.print("What's the Id of the employee: ");

//                Ask for the employee ID
                    Employee employeeFoundToUpdate = searchEmployeeById(inputScanner.nextInt());
                    if (employeeFoundToUpdate != null) {
                        System.out.print("Updated Salary: ");
                        employeeFoundToUpdate.setSalary(inputScanner.nextDouble());
                    }
                    else {
                        System.out.println("There's no employee with this ID.");
                    }
                    break;
                case 5:
//                Exit the program
                    run = false;
                    break;
                default:
                    System.out.println("\nThe value needs to be between 1 to 5.\n");
            }
        }
    }

    public static Employee searchEmployeeById(int searchId){
        boolean employeeFound = false;

        for (Employee e1 : employees){
            if (e1 != null && e1.getId() == searchId){ // To check if the e1 is not null
//                            Print the employee's details
                employeeFound = true;
                return e1;
            }
        }
        return null;
    }
}
