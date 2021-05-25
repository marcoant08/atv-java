/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeiro;

/**
 *
 * @author marco
 */
public class Main {
    public static void main (String[] args){
        System.out.println("Olá, mundo!");
        
        int[] A = {12,32,54,6,8,89,64,64,6};
        int S = 20;
        
        boolean tem = test(A, S);
        
        if(tem){
            System.out.println("TRUE: O array contem dois valores que somados são S.");
        }else{
            System.out.println("FALSE: O array contem dois valores que somados são S.");
        }
    }
    
    public static boolean test(int[] A, int S){
        boolean tem = false;

        for(int num1 : A){
            for(int num2 : A){
                if(num1 + num2 == S){
                    System.out.println("Soma encontrada: " + num1 + " + " + num2 + " = " + S);
                    tem = true;
                }
            }
        }

        if(!tem) System.out.println("Nenhuma soma encontrada.");

        return tem;
    }
}
