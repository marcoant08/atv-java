/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.terceiro;

/**
 *
 * @author marco
 */
public class Main {
    public static void main (String[] args){
        System.out.println("Olá, mundo!");
        
        int minutos = calcular(10, 30, 20);
        
        System.out.println("Total de minutos: " + minutos);
    }
    
    public static int calcular (int A1, int A2, int A3){
        int minutos = 0;
        
        if (A1 >= A3 && (A3 + A2) <= A1) { // A1 tem mais pessoas, maquina fica no 1 andar
            minutos = (A2 * 2) + (A3 * 4);
        }
        
        if ((A2 >= A3 && A2 >= A1)){ // A2 tem mais pessoas, maquina fica no 2 andar
            minutos = (A3 * 2) + (A1 * 2);
        }
        
        if (A3 >= A1 && (A1 + A2) <= A3) { // A3 tem mais pessoas, maquina fica no 3 andar
            minutos = (A1 * 4) + (A2 * 2);
        }
        
        return minutos;
    }
}
