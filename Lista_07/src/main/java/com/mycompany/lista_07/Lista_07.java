/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lista_07;

import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Lista_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.println("Informe um valor para o vetor A:");
            a[i] = sc.nextInt();
        }
        for (i = 0; i < b.length; i++) {
            System.out.println("Informe um valor para o vetor B:");
            b[i] = sc.nextInt();
        }

        for (i = 0; i < c.length; i++) {
            c[i] = a[i] - b[i] * a[i];
            System.out.println("O resultado do vetor c é----->" + c[i]);

        }

    }
}
