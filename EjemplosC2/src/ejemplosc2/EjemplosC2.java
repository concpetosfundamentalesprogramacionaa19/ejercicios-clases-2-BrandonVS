/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosc2;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class EjemplosC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese sus nombres: ");
        
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingrese susL apellidos: ");
        
        apellido = entrada.nextLine();
        
        System.out.println("Su nombre es: " + nombre + "\n\n\tSu apellido es: "
                + apellido);
    }

}
