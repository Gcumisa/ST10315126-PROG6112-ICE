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
class Bird extends Animal {
    int colour;

    @Override
    void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather colour (1=grey, 2=white, 3=black): ");
        colour = scanner.nextInt();
    }

    @Override
    void output() {
        super.output();
        System.out.println("Feather colour: " + colour);
    }

}
