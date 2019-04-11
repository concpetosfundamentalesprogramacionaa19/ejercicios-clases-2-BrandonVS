package EjerciciosClase;

import ejemplosc2.*;
import java.util.Scanner;

/**
 *
 * @author Brandon
 */
public class MiEjercicio {

    public static void main(String[] args) {
        
        // Declaramos las variables
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        int nota1;
        int nota2;
        double promedio;  
        
        Scanner entrada = new Scanner(System.in);

        // Le pedimos al usuario sus datos
        System.out.println("Por favor ingrese sus nombres: ");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingrese sus apellidos: ");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Por favor ingrese su ciudad: ");
        ciudad = entrada.nextLine();
        
        System.out.println("Por favor ingrese su pais: ");
        pais = entrada.nextLine();
        
        System.out.println("Por favor ingrese su primera nota: ");
        nota1 = entrada.nextInt();
        
        System.out.println("Por favor ingrese su segunda nota: ");
        nota2 = entrada.nextInt();
        
        // Calculamos su promedo con las notas que el ingreso
        promedio = (nota1 + nota2) / 2;
        
        // Le mostramos al usuario sus datos
        System.out.printf("Sus nombres y apellidos: %s %s\nEdad: %s\nCiudad: "
                + "%s\nPais: %s\nNotas: %s, %s\nPromedio: %s", nombre, apellido,
                edad, ciudad, pais, nota1, nota2, promedio);
    }

}
