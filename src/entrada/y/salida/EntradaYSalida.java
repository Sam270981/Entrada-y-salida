/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrada.y.salida;
import java.util.Scanner;

public class EntradaYSalida {

   
    public static void main(String[] args) {
      
        int Edad;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escribe tu edad");
         Edad = entrada.nextInt();
         System.out.println("Tu edad es ="  + Edad);
    }
    
}
