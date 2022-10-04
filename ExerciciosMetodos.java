/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosmetodos;

/**
 *
 * @author 0044725
 */
public class ExerciciosMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Construa um método que receba como parâmetro um número e calcule e retorne o valor do seu fatoriale o imprima na main.
      System.out.println(fatorial(10));
       
    }
    public static int fatorial(int valor){
        int fatorial=1;
        for (int i=1 ; i<valor; i++){
        fatorial=fatorial*i;
       
        }
        return fatorial;
    }
   
}
