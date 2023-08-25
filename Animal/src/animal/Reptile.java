/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
class Reptile extends Animal {
    double bloodTemp;

    @Override
    void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bloodTemp = scanner.nextDouble();
    }

    @Override
    void output() {
        super.output();
        System.out.println("Blood temperature: " + bloodTemp);
    }
}


