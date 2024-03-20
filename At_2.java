/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste_target;
import java.util.Scanner;

/**
 *
 * @author victo
 */
public class At_2 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        int a = 0, b = 1, soma = 0;
        boolean verificacao = false;

        System.out.println("Sequência Fibonacci até o número " + numeroInteiro + ":");
        while (soma <= numeroInteiro) {
            System.out.print(a + " ");
            soma = a + b;
            a = b;
            b = soma;
            if (soma == numeroInteiro) {
                verificacao = true;
                break;
}
        }

        if (verificacao) {
            System.out.println("\nSeu número pertence à sequência Fibonacci.");
        } else {
            System.out.println("\nSeu número não pertence à sequência Fibonacci.");
        }

        scanner.close();
    }
}
