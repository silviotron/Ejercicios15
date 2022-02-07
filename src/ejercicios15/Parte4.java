/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios15;

import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

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
        HashMap<Character, List<String>> mapa = new HashMap<>();
        sc = new java.util.Scanner(System.in); 
        System.out.printf("introduce una string: ");
        String[] array = sc.nextLine().trim().toLowerCase().split(" +");
        for (int i = 0; i < array.length; i++) {
            if(!mapa.containsKey(array[i].charAt(0))){
                mapa.put(array[i].charAt(0), new LinkedList<>());
            }
                mapa.get(array[i].charAt(0)).add(array[i]);
        } 
        Iterator<Character> it = mapa.keySet().iterator();
        while (it.hasNext()) {
            Character next = it.next();
            System.out.println(next.toString().toUpperCase() + ":" + mapa.get(next));
            
        }
        
    }
    
}
