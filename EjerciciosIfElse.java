package ejercicios.pkgif.pkgelse;
import java.util.Scanner;

public class EjerciciosIfElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
    // Ejercicio 1
    System.out.print("ejercicio 1 "); 
    
      System.out.print("Introduzca primer número: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduzca segundo número: ");
        int n2 = teclado.nextInt();
        if (n1 == n2) {
            System.out.println("Los números introducidos son IGUALES");
        } else {
            System.out.println("Los números introducidos NO son iguales");
        }

    // ejercicio 2
    System.out.print("ejercicio 2 ");
       System.out.print("pone un numero ");
       int n3 = teclado.nextInt();
       System.out.print("pone otro ");
       int n4 = teclado.nextInt();
        if (n3 > n4) {
            System.out.println(n3 + " es el MAYOR");
        } else if (n4 > n3) {
            System.out.println(n4 + " es el MAYOR");
        } else {
            System.out.println("Los números son IGUALES");
        }
    // Ejercicio 3
    System.out.print("ejercicio 3 ");
    System.out.print("introduzca un numero ");
    int n5 = teclado.nextInt();
    System.out.print("introduzca otro numero ");
    int n6 = teclado.nextInt();
    int ultimaCifra1 = n5 % 10;
    int ultimaCifra2 = n6 % 10;
      if (ultimaCifra1 == ultimaCifra2) {
            System.out.println("Los números ACABAN con la MISMA cifra");
        } else {
            System.out.println("Los números NO acaban con la misma cifra");
        }
    
    // Ejercicio 4 
    System.out.print("ejercicio 4 ");
    System.out.print("Introduzca un número entero: ");
        int numero = teclado.nextInt();
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Es múltiplo de 3 Y de 5");
        } else {
            System.out.println("NO es múltiplo de ambos");
    }
    // Ejercicio 5
    System.out.print("ejercicio 5 ");
     System.out.print("Introduzca un año: ");
        int año = teclado.nextInt();
        
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " ES BISIESTO");
        } else {
            System.out.println(año + " NO es bisiesto");
        }
    // Ejercicio 6
    System.out.print("ejercicio 6 ");
    System.out.print("Introduzca primer número: ");
        int n7 = teclado.nextInt();
        
        System.out.print("Introduzca segundo número: ");
        int n8 = teclado.nextInt();
        
        System.out.print("Introduzca tercer número: ");
        int n9 = teclado.nextInt();
        
        if (n7 >= n8 && n7 >= n9) {
            System.out.println("El mayor es: " + n7);
        } else if (n8 >= n7 && n8 >= n9) {
            System.out.println("El mayor es: " + n8);
        } else {
            System.out.println("El mayor es: " + n9);
        }
    // Ejercicio 7
    System.out.print("ejercicio 7 ");
     System.out.print("Introduzca calificación (0-10): ");
        int nota = teclado.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("Calificación NO VÁLIDA");
        } 
        else if (nota < 5) {
            System.out.println("Insuficiente");
        } 
        else if (nota < 6) {
            System.out.println("Suficiente");
        } 
        else if (nota < 7) {
            System.out.println("Bien");
        } 
        else if (nota < 9) {
            System.out.println("Notable");
        } 
        else {
            System.out.println("Sobresaliente");
        }
}
} 
    

