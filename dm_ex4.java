import java.util.Random;
import java.util.Scanner;

public class dm_ex4{
	

	public static void main(String args[]){
		int win = 0;
        int lose = 0;
        String name;

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Who are you?");

        name = scan.next();

        System.out.println("Hello, " + name + "!");
        
        System.out.println("Tossing a coin...");

        for (int i = 0; i < 3; i++) {
        	if (rand.nextInt(2) == 1) {
        		System.out.println("Round " + i + ": Heads");
        		win++;
        	}else{
        		System.out.println("Round " + i + ": Tails");
        		lose++;
        	}
        }

        System.out.println("Heads: " + win + ", Tails: " + lose);

        if (win > lose) System.out.println(name + " won!");
        else System.out.println(name + " lost!");

    }
}