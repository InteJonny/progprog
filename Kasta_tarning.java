import java.util.Scanner;

public class kasta_tarning
{
  public static void main(String[] args){//l�ser vad anv�ndare skriver
   Scanner keyboard = new Scanner(System.in);
//Generar tal 1-100
   int a = 1 + (int) (Math.random() * 99),
       guess, 
       count = 0;

   System.out.println("Skriv 0 till 100, tack");
   
   while((guess = keyboard.nextInt()) != a){
       //Hj�lper anv�ndaren med att gissa r�tt.
     if (guess > a && guess < 100)
     {
       System.out.println("l�gre!");
     }
     else if (guess > 100)
     {
       System.out.println("Skriv en siffra under 100, tack");
     }

     else
     {
       System.out.println("h�gre!");
     }
     count++;
   }

   System.out.println("R�tt.   Du gissade "+ count +" g�nger!");
  }

}