/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_07;

/**
 *
 * @author Leona
 */
public class exercicio_02 {

    public static void main(String[] args) {
        int vet[] = new int[100];
        int numero = 0, contador = 0;

        while (vet[99] == 0) {
            if (numero % 7 != 0 || numero % 10 == 7) {
                vet[contador] = numero;
                contador++;
            }
            numero++;
            if (numero > 100) {
                break;
            }
        }
        for (int i = 0; i < vet.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            if (vet[i] != 0) {
                System.out.print(vet[i] + " ");
            }
        }
    }
}

