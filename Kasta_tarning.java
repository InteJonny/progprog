import java.util.Scanner;

public class kasta_tarning
{
  public static void main(String[] args){//läser vad användare skriver
   Scanner keyboard = new Scanner(System.in);
//Generar tal 1-100
   int a = 1 + (int) (Math.random() * 99),
       guess, 
       count = 0;

   System.out.println("Skriv 0 till 100, tack");
   
   while((guess = keyboard.nextInt()) != a){
       //Hjälper användaren med att gissa rätt.
     if (guess > a && guess < 100)
     {
       System.out.println("lägre!");
     }
     else if (guess > 100)
     {
       System.out.println("Skriv en siffra under 100, tack");
     }

     else
     {
       System.out.println("högre!");
     }
     count++;
   }

   System.out.println("Rätt.   Du gissade "+ count +" gånger!");
  }

}