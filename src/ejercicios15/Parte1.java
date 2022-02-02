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
public class Parte1 {
    private static java.util.Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Character, Integer> mapa = new TreeMap<>();
        sc = new java.util.Scanner(System.in);        
        System.out.print("Introduce la primera frase: ");
        String s = sc.nextLine();
        char[] array = s.toLowerCase().toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(mapa.containsKey(array[i])){
                mapa.put(array[i], mapa.get(array[i]) + 1);
            }else{
                mapa.put(array[i], 1);
            }
            
            
        }
        //if(mapa.containsKey(' ')){
        mapa.remove(' ');
        //}
        System.out.println(mapa);
    }
    
}
