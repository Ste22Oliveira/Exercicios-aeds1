/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosmetodos;

/**
 *
 * @author 0044725
 */
public class Exe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(nota(80));
    }
    
    public static String nota(double nota){
        if (nota>=60){
            return "Aprovado" ;
        }
        else {
            return "Reprovado" ;
        }
    }
}
