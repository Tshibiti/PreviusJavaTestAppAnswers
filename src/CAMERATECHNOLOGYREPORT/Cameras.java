/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CAMERATECHNOLOGYREPORT;
public class Cameras {

    public static void main(String[] args) {
        String[] cameraTech = {"Mirrorless", "DSLR"};
        String[] cameras = {"CANON", "SONY", "NIKON"};
        double[][] price = {
            {10500.00, 8500.00},
            {9500.00, 7200.00},
            {12000.00, 8000.00}
        };

        System.out.println("-----------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("-----------------------------------------");

        // Print headers
        System.out.print("Brand\t\t");
        for (int x = 0; x < cameraTech.length; x++) {
            System.out.print(cameraTech[x] + "\t\t");
        }
        System.out.println();

        // Print price table
        for (int x = 0; x < cameras.length; x++) {
            System.out.print(cameras[x] + "\t\t");
            for (int y = 0; y < cameraTech.length; y++) {
                System.out.print("R " + price[x][y] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

        // Difference calculation
        double maxDifference = 0;
        int index = -1;

        System.out.println("PRICE DIFFERENCES (Mirrorless - DSLR):");
        for (int x = 0; x < price.length; x++) {
            double difference = price[x][0] - price[x][1];
            System.out.print(cameras[x] + "\t" + difference);

            if (difference > 2500) {
                System.out.print(" ***");
            }
            System.out.println();

            // Check for max difference
            if (difference > maxDifference) {
                maxDifference = difference;
                index = x;
            }
        }

        System.out.println();
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + cameras[index]);
    }
}
