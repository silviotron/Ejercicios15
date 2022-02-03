/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios15;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Parte2 {
    private static java.util.Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Character, Integer> mapa = new TreeMap<>();
        mapa.put('a', 0);
        mapa.put('e', 0);
        mapa.put('i', 0);
        mapa.put('o', 0);
        mapa.put('u', 0);
        sc = new java.util.Scanner(System.in);        
        System.out.print("Introduce la primera frase: ");
        char[] array = sc.nextLine().toLowerCase().toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(mapa.containsKey(array[i])){
                mapa.put(array[i], mapa.get(array[i]) + 1);
            }
            
        }
        System.out.println(mapa);
    }
    
}
