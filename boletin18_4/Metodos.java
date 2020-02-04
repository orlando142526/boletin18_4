
package boletin18_4;

import java.util.Scanner;

/**
 *
 * @author DANIELCASTELAO\oyagualendara
 */
public class Metodos {
  String letras [] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    Scanner sc = new Scanner (System.in);
    
    public void calcularLetra(){
        System.out.println("Dime o teu DNI (sen a letra):");
        int dni = sc.nextInt();
        int letra = dni % 23;
        System.out.println("A letra do teu DNI é: " + letras[letra]);
        
    }
}
