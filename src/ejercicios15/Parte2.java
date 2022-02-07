/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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
        String[] array = sc.nextLine().toLowerCase().split(" +");
        ArrayList<String> lista = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.clear();
            for (int j = 0; j < array[i].length(); j++) {
                set.add(array[i].charAt(j));
            }
            lista.add(set.toString().replaceAll(",", "").replaceAll(" +", ""));
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if(mapa.containsKey(lista.get(i).charAt(j))){
                    mapa.put(lista.get(i).charAt(j), mapa.get(lista.get(i).charAt(j))+1);
                }
                
            }
            
        }
        System.out.println(mapa);
    }
    
}
