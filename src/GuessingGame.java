/*
   java game that allow users to guess random number that is randomly generated
   user guess random number between 1 and 10
    */
import javax.swing.*;
import java.awt.*;

public class GuessingGame {
   public static void main(String[] args) {
       int userAnswer = 0;
       int tries = 1;
       int randomlyGeneratedNumber = (int)(Math.random() * 100 + 1);
       System.out.println(randomlyGeneratedNumber);

       while(userAnswer != randomlyGeneratedNumber) {
           String response = JOptionPane.showInputDialog(null,"Enter a guess between 10 and 100: ", "Guessing Game", 3);
           if(response == null || response.equals("")) {
               JOptionPane.showMessageDialog(null,"Not a number. Try again");
           }
           userAnswer = Integer.parseInt(response);
           JOptionPane.showMessageDialog(null,""+determineGuess(userAnswer, randomlyGeneratedNumber, tries));
           tries++;

       }



   }

    public static String determineGuess(int userAnswer, int randomlyGeneratedNumber, int tries) {
        if(userAnswer == randomlyGeneratedNumber) {
            return "Correct Answer. It took you "+tries+" tries";
        } else if(userAnswer > 100) {
            return "Your guess exceeds 100, the max guess limit.";
        } else if(userAnswer < 10) {
            return "Your guess is lower than 10, the minimum guess limit.";
        } else if(userAnswer > randomlyGeneratedNumber) {
            return "Incorrect Answer. Guess lower.";
        } else if(userAnswer < randomlyGeneratedNumber) {
            return "Incorrect Answer. Guess higher.";
        } else {
            return "Not a number. Try again.";
        }
    }

    //TODO make window larger / full screen.
    //TODO change background color of window.
    //TODO extra challenge: make sound for winning using sound class in java.
    //TODO practice swing


}
