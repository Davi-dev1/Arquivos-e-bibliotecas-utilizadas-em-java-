/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tiposprimitivos;
import java.util.Scanner;
/**
 *
 * @author Davi
 */
public class Scanner {
    public static void main(String args[]){
        Scanner scaner =  new Scanner(System.in);
        System.out.println("Digite seu nome : ");
        String nome = scaner.nextLine();
        System.out.println("Digite a sua nota");
        float nota = scaner.nextFloat();
        System.out.printf("A nota de %s é %.2f ",nome,nota);
        
    }
}
