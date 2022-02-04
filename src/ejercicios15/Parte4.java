/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios15;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Parte4 {
    private static java.util.Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap<Character, ArrayList<String>> mapa = new TreeMap<>();
        sc = new java.util.Scanner(System.in); 
        System.out.printf("introduce una string: ");
        String[] array = sc.nextLine().toLowerCase().split(" +");
        for (int i = 0; i < array.length; i++) {
            if(mapa.containsKey(array[i].charAt(0))){
                mapa.get(array[i].charAt(0)).add(array[i]);
            }else{
                mapa.put(array[i].charAt(0), new ArrayList<>());
            }
            
            
        } 
        Iterator<Character> it = mapa.keySet().iterator();
        
        while (it.hasNext()) {
            Character next = it.next();
            System.out.println(next.toString().toUpperCase() + ": " + mapa.get(next));
            
        }
        
    }
    
}
