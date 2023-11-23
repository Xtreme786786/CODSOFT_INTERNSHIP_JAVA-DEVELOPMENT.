import java.util.Random;
import java.util.Scanner;


public class Codsoft_TaskNo_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int attempt=0;
        int maxAttempt = 10;
        int score=0;
        int sum=0;
        boolean playagain=true;
        while(playagain){
            System.out.println("WELCOME TO 'GUESS THE NUMBER GAME':");
            int rndmguess = random.nextInt(1,100);
            while(attempt<maxAttempt){
                System.out.println("Enter a number between 1 to 100: ");
                int userguess = sc.nextInt();
                attempt++;
                if(userguess<rndmguess){
                    System.out.println("wrong! please guess a higher number. ");
                }
                else if(userguess>rndmguess){
                    System.out.println("wrong! please guess a smaller number.");
                }
                else{
                    System.out.println("Awesome you guessed it right in "+attempt+" attempt");
                    score+=(maxAttempt-attempt+1);
                    break;
                }
            }
            if(attempt==maxAttempt){
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct answer is "+rndmguess);
            }
            System.out.println("Want to play again Type (yes/no):");
            String play = sc.next().toLowerCase();
            playagain=play.equals("yes");
            attempt=0;
        }
        System.out.println("THANK YOU FOR PLAYING. YOUR TOTAL SCORE IS "+score);

    }
}
