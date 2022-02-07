/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios15;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Parte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("234234", "silvio", 3, 3);
        Persona p2 = new Persona("53029348", "luis", 3 ,3);
        Persona p3 = new Persona("907342", "juan.", 3, 3 );
        Persona p4 = new Persona("698786", "pepe",3, 3);
        TreeMap<Boolean, ArrayList<Persona>> mapa = new TreeMap<>();
        mapa.put(true, new ArrayList<>());
        mapa.put(false, new ArrayList<>());
        mapa.get(true).add(p1);
        mapa.get(true).add(p2);
        mapa.get(false).add(p3);
        mapa.get(false).add(p4);
        System.out.println(mapa.get(true));
        System.out.println(mapa.get(false));
        
    }
    
}
