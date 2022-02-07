/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Parte5 {
    public static final String RED = "\033[0;31m"; // rojo
    public static final String RESET = "\033[0m";  // Text Reset    
    private static java.util.Scanner sc;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap<Character, LinkedHashSet<String>> mapa = new TreeMap<>();
        HashSet<String> yaProcesados = new HashSet<>();
        sc = new java.util.Scanner(System.in); 
        System.out.print("Introduce un texto: ");
        String[] array = sc.nextLine().toLowerCase().replaceAll("[^a-z\\d\\s]", "").split("\\s+");
        char letra;
        for (int i = 0; i < array.length; i++) {
            if(!yaProcesados.contains(array[i])){
                for (int j = 0; j < array[i].length(); j++) {
                    letra = array[i].charAt(j);
                    if(!mapa.containsKey(letra)){
                        mapa.put(letra , new LinkedHashSet<>());

                    }
                    mapa.get(letra).add(array[i]);
                }
            }
            yaProcesados.add(array[i]);
            
        }
        Iterator<Character> it = mapa.keySet().iterator();
        System.out.println("");
        while (it.hasNext()) {
            Character next = it.next();
            
            System.out.println(next + ": " + mapa.get(next).size() +" -> " + mapa.get(next).toString().replaceAll(next + "", RED + next + RESET));
            
        }
        System.out.println("");
        
    }
    
//    public static void main(String[] args) {
//        TreeMap<String, HashSet<String>> mapa = new TreeMap<>();
//        sc = new java.util.Scanner(System.in); 
//        System.out.print("Introduce un texto: ");
//        String[] array = sc.nextLine().toLowerCase().replaceAll("[^a-z\\d\\s]", "").split("\\s+");
//        int contador = 0;
//        char letra;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length(); j++) {
//                letra = array[i].charAt(j);
//                contador = 0;
//                for (int k = 0; k < array[i].length(); k++) {
//                    if(array[i].charAt(k) == letra){
//                        contador++;
//                    }
//                }
//                if(!mapa.containsKey(letra + ": " + contador)){
//                    mapa.put(letra + ": " + contador, new HashSet<>());
//                    
//                }
//                mapa.get(letra + ": " + contador).add(array[i]);
//            }
//            
//        }
//        Iterator<String> it = mapa.keySet().iterator();
//        
//        while (it.hasNext()) {
//            String next = it.next();
//            
//            System.out.println(next + " -> " + mapa.get(next).toString().replaceAll(next + "", RED + next + RESET));
//            
//        }
//        
//    }
    
}
