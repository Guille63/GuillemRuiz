package src;

public class HolaMundo2 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Introduce tu nombre:");
        String nombre = System.console().readLine();
        System.out.println("Hola " + nombre);
    }
}
