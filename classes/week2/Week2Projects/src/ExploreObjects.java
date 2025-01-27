public class ExploreObjects {

    public static void main(String[] args) {
        Student s1 = new Student(); // Calling the student constructor
        s1.setFirstName("John");
        s1.setLastName("Smith");
        s1.setAge(22);
        s1.setId("1");

        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getAge());
        System.out.println(s1.getId());

        Student s2 = new Student("1", "John", "Snow", 30);

        System.out.println(s2.getFirstName());
        System.out.println(s2.getLastName());
        System.out.println(s2.getAge());
        System.out.println(s2.getId());

        System.out.println("Full name of second student is: " + s2.showFullName());
    }

}
