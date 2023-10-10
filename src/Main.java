import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int cpuNum;
        int userGuess;
        boolean done = false;
        Scanner scan = new Scanner(System.in);
        cpuNum = (int)(Math.random() * 10) + 1;
        System.out.println("WOAH! The computer has made a random number 1-10. Try to guess!!!!");
        do {
            System.out.println("Enter your guess:");
            if (scan.hasNextInt()) {
                userGuess = scan.nextInt();
                if (userGuess > 0 && userGuess < 11) {
                    System.out.println("The cpu guess was: " + cpuNum);
                    if (cpuNum == userGuess) {
                        System.out.println("You were, RIGHT ON DA MONEYYY$$$");
                    }else if (cpuNum > userGuess){
                        System.out.println("You were too low :(");
                    }else if (userGuess > cpuNum){
                        System.out.println("You were too high :o");
                    }
                    done = true;
                }else{
                    System.out.println("The number you entered was not in the range!");
                    scan.nextLine();
                }
            }else{
                System.out.println("You have entered something invalid!");
                scan.nextLine();
            }
        } while (!done);
    }
}