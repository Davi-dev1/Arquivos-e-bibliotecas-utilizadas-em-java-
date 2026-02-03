/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;
//o java.lang já vem importado , então com isso subetende-se que você não precisa importar nada
/**
 *
 * @author Davi
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    float nota =8.5f;
    String nome =(String)"Gustavo";
    String name=(String)"Eduardo";
        System.out.println("A nota do aluno é : " +nota);
        System.out.printf("A nota de %s é %.1f\n",nome, nota);//2 casas decimais posso colocar mais
        System.out.format("A nota de %s é %.2f\n ",name,nota);
    }
    
}
