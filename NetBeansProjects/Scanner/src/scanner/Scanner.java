/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;

/**
 *
 * @author BRUNOKRAUSENOIADACOS
 */
import java.util.Scanner;

public class Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        
        String nome = entrada.nextline();
        
        System.out.println("Olá " + nome);
    }
    
}
