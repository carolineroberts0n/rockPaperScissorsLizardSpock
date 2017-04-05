/*
 Caroline Robertson
 March 31st, 2017
 Rock paper scissors lizard spock
 */

package rpslsp;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author carob8920
 */
public class RPSLSp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaring variables and info
        int computer, player; 
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        System.out.println("ROCK PAPER SCISSORS LIZARD SPOCK");
        System.out.println("\n ROCK = 1 \n PAPER = 2 \n SCISSORS = 3 \n LIZARD = 4 \n SPOCK = 5");
        System.out.println("\nEnter your throw: "); 
        
        player = input.nextInt(); //player input
        computer = r.nextInt(5)+1; //computer is random
        input.close();
        
        switch (player){ //what comes up if player throw whatever
            case 1: System.out.println("You threw ROCK"); break;
            case 2: System.out.println("You threw PAPER"); break;
            case 3: System.out.println("You threw SCISSORS"); break;
            case 4: System.out.println("You threw LIZARD"); break;
            case 5: System.out.println("You threw SPOCK"); break;
                
        }
        switch (computer){ //what comes up if computer throws whatever
            case 1: System.out.println("Computer threw ROCK"); break;
            case 2: System.out.println("Computer threw PAPER"); break;
            case 3: System.out.println("Computer threw SCISSORS"); break;
            case 4: System.out.println("Computer threw LIZARD"); break;
            case 5: System.out.println("Computer threw SPOCK"); break;
        }
        
        if (player == 1 && computer == 2){ //if rock
            System.out.println("\nYou lose: paper covers rock");
        } else if (player == 1 && computer == 3){
            System.out.println("\nYou win: rock smashes scissors");
        } else if (player == 1 && computer == 4){
            System.out.println("\nYou win: rock crushes lizard");
        } else if (player == 1 && computer == 5){
            System.out.println("\nYou lose: Spock vaporizes rock");
        }
        
        if (player == 2 && computer == 1){ //if paper
            System.out.println("\nYou win: paper covers rock");
        } else if (player == 2 && computer == 3){
            System.out.println("\nYou lose: scissors cuts paper");
        } else if (player == 2 && computer == 4){
            System.out.println("\nYou lose: lizard eats paper");
        } else if (player == 2 && computer == 5){
            System.out.println("\nYou win: paper disproves Spock");
        }
        
        if (player == 3 && computer == 1) { //if scissors
            System.out.println("\nYou lose: rock smashes scissors");
        } else if (player == 3 && computer == 2){
            System.out.println("\nYou win: scissors cut paper");
        } else if (player == 3 && computer == 4){
            System.out.println("\nYou win: scissors decapitate lizard");
        } else if (player == 3 && computer == 5){
            System.out.println("\nYou lose: Spock smashes scissors");
        }
        
        if (player == 4 && computer == 1){ //if lizard
            System.out.println("\nYou lose: rock curshes scissors");
        } else if (player == 4 && computer == 2){
            System.out.println("\nYou win: lizard eats paper");
        } else if (player == 4 && computer == 3){
            System.out.println("\nYou lose: scissors decapitate lizard");
        } else if (player == 4 && computer == 5){
            System.out.println("\nYou win: lizard poisons Spock");
        }
        
        if (player == 5 && computer == 1){ //if spock
            System.out.println("\nYou win: Spock vaporizes rock");
        } else if (player == 5 && computer == 2){
            System.out.println("\nYou lose: paper disproves Spock");
        } else if (player == 5 && computer == 3){
            System.out.println("\nYou win: Spock smashes scissors");
        } else if (player == 5 && computer == 4){
            System.out.println("\nYou lose: lizard poisons Spock");
        }
        
        if (player == computer){ //if they are equal
            System.out.println("\nIt's a tie");
        }
    }
    
}
