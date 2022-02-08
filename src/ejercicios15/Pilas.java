/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios15;

import java.util.Stack;

/**
 *
 * @author alumno
 */
public class Pilas {

    private static java.util.Scanner sc;

    public static void primero() {
        Stack<Integer> resto = new Stack<>();
        sc = new java.util.Scanner(System.in);
        int numero = 0;
        boolean notDone = true;
        do {
            System.out.print("Introduce el numero en base 10: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                notDone = false;
            } else {
                System.out.println("ERR0R.");
            }
        } while (notDone);
        int base = -1;
        do {
            System.out.print("Introduce la base a la que quiere pasarlo: ");
            if (sc.hasNextInt()) {
                base = sc.nextInt();
            } else {
                System.out.println("ERR0R.");
            }
        } while (base <= 0);

        do {
            resto.add(numero % base);
            numero = numero / base;

        } while (numero / base != 0);
        resto.add(numero % base);
        System.out.println("");
        while (!resto.empty()) {
            System.out.print(resto.pop());
        }
        String subindice = "\u2080";
        switch (base) {
            case 1:
                subindice = "\u2081";
                break;
            case 2:
                subindice = "\u2082";
                break;
            case 3:
                subindice = "\u2083";
                break;
            case 4:
                subindice = "\u2084";
                break;
            case 5:
                subindice = "\u2085";
                break;
            case 6:
                subindice = "\u2086";
                break;
            case 7:
                subindice = "\u2087";
                break;
            case 8:
                subindice = "\u2088";
                break;
            case 9:
                subindice = "\u2089";
                break;
        }
        System.out.println(subindice);

    }

}
