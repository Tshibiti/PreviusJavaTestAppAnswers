
package EstateAgentReport;

import java.util.Scanner;


public class MoctTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current estate agent name: ");
        String name = input.nextLine();
        
        System.out.print("Enter the property price: ");
        double price = input.nextDouble();
        
        EstateAgentSales myClass = new EstateAgentSales(name,price);
        
        myClass.printProperty();
    }
}
