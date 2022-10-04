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
public class Exer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(media(somatorio(),5));
       
    }
    public static float somatorio(){
        Scanner sc = new Scanner (System.in);
        float valor=0  ; 
        
        for(int i=1 ; i<=5; i++){
            System.out.println("Digite o valor do elemento : "+i);
        valor+= sc.nextFloat();
       
    }
        return valor ;
       
    }
    public static float media(float soma, float elementos ){
        return soma /elementos ;
    }
}
