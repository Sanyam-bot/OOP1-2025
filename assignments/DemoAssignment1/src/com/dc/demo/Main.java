import com.dc.demo.Product;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date1 = new Date();
        date1.setYear(2025);
        date1.setMonth(1);
        date1.setDate(28);

        Date date2 = new Date();
        date2.setYear(2035);
        date2.setMonth(1);
        date2.setDate(28);

        Product P1 = new Product(1, "Car", 1000000, date2, date2, 5000);

        P1.printProductDescription();

        System.out.println("The manufacturer is " + P1.manufacturer_name);
        System.out.println("The manufacturer is " + Product.manufacturer_name);
        Product.manufacturer_name = "Toyota";
        System.out.println("The manufacturer is " + P1.manufacturer_name);
        System.out.println("The manufacturer is " + Product.manufacturer_name);

        
    }
}