/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
class Animal {
    int IDtag;
    String species;
    
    /**
     * @param args the command line arguments
     */
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IDtag: ");
        IDtag = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter species: ");
        species = scanner.nextLine();
    }

    void output() {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }
}
