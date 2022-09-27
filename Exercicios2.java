/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 0044725
 */
public class Exercicios2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, maiores = 0, menores = 0, menor_dezoito=0, maior_dezoito=0;

        for (int i = 1; i <= 10; i++) {
        System.out.println("Digite idade" +i+ " :");
        idade = sc.nextInt();

        if (idade <= 18) {
            menor_dezoito += 1;

        }
        if (idade >= 18) {
            maior_dezoito += 1;

        }
        if (idade > maiores) {
            maiores = idade;
        }
        if (idade > 0) {
            if (menores == 0) {
                menores = idade;
            }
            if (idade < menores) {
                menores = idade;
            }
        }
        
    


     

        
}
    System.out.println("A menor idade é: " + menores + " anos");
        System.out.println("A maior idade é: " + maiores + " anos");
        System.out.println(menor_dezoito  + "São menores de dezoito");
        System.out.println(maior_dezoito  + "São  de dezoito");

    }
}