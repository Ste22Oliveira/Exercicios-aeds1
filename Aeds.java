/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aeds;

import java.util.Scanner;

/**
 *
 * @author 0044725
 */
public class Aeds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
       Scanner leia= new Scanner(System.in);
       n=leia.nextInt();
       verificarNota(n);
    }
        
    public static void verificarNota(int nota){
        if(nota>=60){
            System.out.println("Nota maior do que 60");
        }
        else{
            System.out.println("Nota menor do que 60");
        }
    }
}
