package src;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Hola Mundo");
        System.out.println("Introduce tu nombre: ");
        String nombre = tec.nextLine();
        System.out.println("Hola " + nombre);
    }
}
