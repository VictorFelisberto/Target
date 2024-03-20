/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste_target;

/**
 *
 * @author victo
 */
public class At_5 {
    public static void main(String... args) {
        String original = "VICTOR";
        String invertida = inverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
    
    public static String inverterString(String str) {
        StringBuilder invertida = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida.append(str.charAt(i));
}
        return invertida.toString();
    }
}
