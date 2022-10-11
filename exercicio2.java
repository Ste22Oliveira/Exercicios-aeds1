/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativide1;

import java.util.Scanner;

/**
 *
 * @author 0044725
 */
public class exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        double notas ;
        double vetor[]=new double[10];
        int cont=0;
        
        for(int i=0; i<10 ; i++){
        System.out.println("Digite um numero: ");
        notas=sc.nextDouble();
        vetor[i]=notas;
        if(notas>=60){
            cont=cont +1 ;
        }
    }
       
        System.out.println(cont+ "notas são maiores que 60");
        
        
        
    }
        
        
        
    }
    

