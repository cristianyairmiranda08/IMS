/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
import java.util.Scanner;
import persona.Persona;
/**
 *
 * @author crist
 */
public class operaciones {
 public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String n = scanner.next();
        System.out.println("Introduce tu edad: ");
        int ed = scanner.nextInt();
        System.out.println("Introduce tu sexo (H o M): ");
        char sx = scanner.next().charAt(0);
        System.out.println("Introduce tu peso: ");
        double p = scanner.nextDouble();
        System.out.println("Introduce tu altura: ");
        double al = scanner.nextDouble();

        Persona o1 = new Persona (n, ed, "", sx, p, al);  
        
        o1.setNombre(n);
        o1.setEdad(ed);
        o1.calcularIMC();
        o1.esMayorDeEdad();
        System.out.println(o1);

    }
}