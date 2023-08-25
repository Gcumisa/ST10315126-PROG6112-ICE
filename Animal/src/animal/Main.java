/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author lab_services_student
 */
public class Main {
    public static void main(String[] args) {
        Bird brd = new Bird();
        Reptile rept = new Reptile();

        System.out.println("Input values for Bird:");
        brd.input();

        System.out.println("Input values for Reptile:");
        rept.input();

        System.out.println("\nBird Details:");
        brd.output();

        System.out.println("\nReptile Details:");
        rept.output();
    }
}
