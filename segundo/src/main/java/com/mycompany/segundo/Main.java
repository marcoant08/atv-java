/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segundo;

/**
 *
 * @author marco
 */
public class Main {
    public static void main (String[] args){
        System.out.println("Olá, mundo!");
        
        // textos da atv
        // String texto = "Hoje subi no onibus correndo";
        String texto = "Na casa do vizinho a grama é amarga";
        // String texto = "A arara azul é linda";
        
        //textos bonus kk
        // String texto = "aaa a a aaNa casa do vizinho a grama é amargaaaa demais seloco";
        // String texto = "bônus: socorram me subi no onibus em marrocos hoje de manhã";
        
        System.out.println("Texto: " + texto);
        System.out.println("Resposta: " + longestPalindromeString(texto));
    }
    
    static String formarFraseFinal(String texto, String palindromo){
        int index = texto.replaceAll(" ", "").indexOf(palindromo);
        int numberOfSpaces = texto.substring(0, index).split(" ").length;
        
        String fraseFinal =  texto.substring(index + numberOfSpaces);
        
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        
        int index2 = textoInvertido.replaceAll(" ", "").indexOf(palindromo);
        int numberOfSpaces2 = textoInvertido.substring(0, index2).split(" ").length;
        
        String removerInvertido = textoInvertido.substring(0, index2 + numberOfSpaces2 - 1);
        String remover = new StringBuilder(removerInvertido).reverse().toString();
        
        fraseFinal = fraseFinal.replace(remover, "");
        
        return fraseFinal;
    }
    
    static public String intermediatePalindrome(String s, int left, int right) {
        if (left > right) return null;
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return s.substring(left + 1, right);
    }

    public static String longestPalindromeString(String texto) {
        String s = texto.replaceAll(" ", "");
        
        if (s == null) return null;
        
        String maior = s.substring(0, 1);
        
        for (int i = 0; i < s.length() - 1; i++) {
            String palindrome = intermediatePalindrome(s, i, i);
            
            if (palindrome.length() > maior.length()) {
                maior = palindrome;
            }
            
            palindrome = intermediatePalindrome(s, i, i + 1);
            
            if (palindrome.length() > maior.length()) {
                maior = palindrome;
            }
        }
        
        return formarFraseFinal(texto, maior);
    }
}
