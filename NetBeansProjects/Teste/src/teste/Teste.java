/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
import java.util.Scanner;
/**
 *
 * @author BRUNOKRAUSENOIADACOS
 */


public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        
        String nome = entrada.nextLine();
        
        System.out.println("Ola " + nome);
    }
    
}
