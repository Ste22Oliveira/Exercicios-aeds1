/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosmetodos;

import java.util.Scanner;

/**
 *
 * @author 0044725
 */
public class Exerci4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      receptor();
    }
    public static void receptor(){
        int valores [] = new  int[3];
        Scanner sc = new Scanner(System.in);
        
        
        for(int i=0; i<valores.length; i++){
            System.out.println("Digite o valor para o elemento"+i);
            valores[i]=sc.nextInt();
        }
        System.out.println("O menor valor é : "+(menor_valor(valores)));
    }
    public static int menor_valor(int []valores){
        int menor=0;
       menor=valores[0];
       for(int i=0; i<valores.length; i++){
          
           if(valores[i]<menor){
               menor=valores[i];
       }
               
           }
       return menor;
       }
    
}
