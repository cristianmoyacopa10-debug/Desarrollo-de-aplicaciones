
package ejerciciosif.else2;
 import java.util.Scanner;
public class EjerciciosIfElse2 { 
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
       
       // Ejercicio 1
        System.out.println("Pone tu edad:");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Sos mayor de edad");
        } else {
            System.out.println("Sos menor de edad");
        }

        teclado.nextLine(); // limpiar buffer

        // Ejercicio 2
        System.out.println("Introduzca la contraseña:");
        String contra = "NoseJaja";
        String contraguardada = teclado.nextLine();

        if (contra.equalsIgnoreCase(contraguardada)) {
            System.out.println("La contra es correcta");
        } else {
            System.out.println("La contra es incorrecta");
        }

        // Ejercicio 3
        System.out.println("Introduzca un numero:");
        double num1 = teclado.nextDouble();
        System.out.println("Introduzca otro numero:");
        double num2 = teclado.nextDouble();

        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        }

        // Ejercicio 4
        System.out.println("Introduzca su edad:");
        int edadUsuario = teclado.nextInt();
        System.out.println("Introduzca sus ingresos:");
        int ingresos = teclado.nextInt();

        if (edadUsuario >= 16 && ingresos >= 1000) {
            System.out.println("Tenes que tributar");
        } else {
            System.out.println("No tenes que tributar");
        }

        // Ejercicio 5
        System.out.print("Ingrese su puntuación: ");
        double puntuacion = teclado.nextDouble();

        double dinero = puntuacion * 2400;

        if (puntuacion == 0.0) {
            System.out.println("Nivel: Inaceptable");
        } else if (puntuacion == 0.4) {
            System.out.println("Nivel: Aceptable");
        } else if (puntuacion >= 0.6) {
            System.out.println("Nivel: Meritorio");
        } else {
            System.out.println("Puntuación inválida");
        }

        System.out.println("Dinero recibido: €" + dinero);

        // Ejercicio 6
        System.out.print("Ingrese la edad del cliente: ");
        int edadCliente = teclado.nextInt();

        if (edadCliente < 4) {
            System.out.println("Entrada gratis");
        } else if (edadCliente <= 18) {
            System.out.println("Debe pagar €5");
        } else {
            System.out.println("Debe pagar €10");
        }

        teclado.nextLine(); // limpiar buffer

        // Ejercicio 7
        System.out.print("¿Quiere pizza vegetariana? (si/no): ");
        String respuesta = teclado.nextLine();

        String ingrediente;

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingredientes: Pimiento, Tofu");
            ingrediente = teclado.nextLine();
            System.out.println("Pizza vegetariana con " + ingrediente);
        } else {
            System.out.println("Ingredientes: Peperoni, Jamón, Salmón");
            ingrediente = teclado.nextLine();
            System.out.println("Pizza no vegetariana con " + ingrediente);
            

        }
        }
    }
            

