/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_07;

import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[6];
        int somaPar = 0;
        int qtdImpar = 0;
        System.out.println("Informe 6 numeros");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.println("Numeros pares");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
                somaPar += vet[i];
            }
        }
        System.out.println("\nSoma pares: " + somaPar);
        System.out.println("Numeros Impares");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 != 0) {
                System.out.print(vet[i] + " ");
                qtdImpar++;
            }
        }
        System.out.println("\nQuantidade impares: " + qtdImpar);
    }
}
