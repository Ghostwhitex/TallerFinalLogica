package LogicaProyectoFinal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

//Santiago Valencia Ochoa 

public class AgregarNombres {

    public static void main(String[] args) {
        
        //Este sería el array list para almacenar los nombres
        
        ArrayList<String> nombres = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        //VARiable para controlar el bucle
        boolean continuar = true;

     
        while (continuar) {
       
            System.out.print("Ingrese un nombre: ");
            String nombre = sc.nextLine();

            // Agregar el nombre al ArrayList
            nombres.add(nombre);

          
            System.out.print("¿Desea agregar otro nombre? (S/N): ");
            String respuesta = sc.nextLine();

            // Si la respuesta es N o n, salir del bucle
            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }


        sc.close();

        // Imprimir el listado de nombres indicando nombre#
        System.out.println("Listado de nombres:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre#" + (i + 1) + ": " + nombres.get(i));
        }
    }
}
