package laxor;

import java.util.ArrayList;
import java.util.Scanner;

public class SecureDoors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hur m�nga ska ut o in");
        int antal = scanner.nextInt();// skriv antal g�nger n�gon g�r in och ut
        ArrayList<String> base = new ArrayList<>();
        for (int i = 0; i < antal; i++) {
            String track = scanner.next();
            String name = scanner.next();
          
            if (track.equals("entry")) { //skriv "entry name"
                System.out.print(name + " entered");
             
                if (base.contains(name))
                    System.out.println(" (ANOMALY)");// om samma person entry 2 g�nger s� blir det anomaly
               
                else {
                    base.add(name);
                    System.out.println();
                }
            
            } else {
                System.out.print(name + " exited"); //skriv "exit name"
                if (!base.contains(name))
                    System.out.println(" (ANOMALY)"); // om samma person e 2 g�nger s� blir det anomaly
            
                else {
                    base.remove(name);
                    System.out.println();
                }
            }
        }
        scanner.close();
    }
}