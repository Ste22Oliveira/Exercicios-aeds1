/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 0044725
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int numero ; 
        int operacao=1 ; 
        
        System.out.println("Digite um numero");
        numero=sc.nextInt();
        
        operacao=1 ;
        for(int i=1 ; i<=numero ; i++) {
            operacao=operacao*i ;
        }
        System.out.println(operacao);
    }
    
}
