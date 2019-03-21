package laxor;

import java.util.ArrayList;
import java.util.Scanner;

public class SecureDoors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hur många ska ut o in");
        int antal = scanner.nextInt();// skriv antal gånger någon går in och ut
        ArrayList<String> base = new ArrayList<>();
        for (int i = 0; i < antal; i++) {
            String track = scanner.next();
            String name = scanner.next();
          
            if (track.equals("entry")) { //skriv "entry name"
                System.out.print(name + " entered");
             
                if (base.contains(name))
                    System.out.println(" (ANOMALY)");// om samma person entry 2 gånger så blir det anomaly
               
                else {
                    base.add(name);
                    System.out.println();
                }
            
            } else {
                System.out.print(name + " exited"); //skriv "exit name"
                if (!base.contains(name))
                    System.out.println(" (ANOMALY)"); // om samma person e 2 gånger så blir det anomaly
            
                else {
                    base.remove(name);
                    System.out.println();
                }
            }
        }
        scanner.close();
    }
}