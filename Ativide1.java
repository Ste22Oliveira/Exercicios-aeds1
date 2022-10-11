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
public class Ativide1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        double num ,media ,soma=0 ;
        double vetor[]=new double[10];
        int tamanho;
        
        for(int i=0; i<10 ; i++){
        System.out.println("Digite um numero: ");
        num=sc.nextDouble();
        vetor[i]=num;
        soma=soma+num ;
    }
        media=soma/10;
        System.out.println("A media dos numeros é: "+media);
        
        
        
    }
        
        
        
    }
    

