
package com.mycompany.namethatbox;
import java.util.Scanner;

public class NameThatBox {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Step 1: Create an array to store 5 names
        String[] studentNames = new String[5];

        // Step 2: Use a loop to get input from the user
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();
        }

        // Step 3: Print all the names using a loop
        System.out.println("\n📋 List of Students:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Box " + i + " contains: " + studentNames[i]);
        }
    
    }
}
