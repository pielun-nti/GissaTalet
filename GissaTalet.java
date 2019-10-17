/*
GissaTalet in java.
Created 2019-10-17
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class GissaTalet {
    public static void main(String[] args) {
        int guesses = 1;
        for (guesses = 1; guesses > 0; guesses++) {
            Random r = new Random();
            int low = 1;
            int high = 100;
            int result = r.nextInt(high - low) + low;
            int guess;
            String Status = "";
            guess = Integer.parseInt(JOptionPane.showInputDialog("Guess the number (1-100)"));
            if (guess < result) {
                Status = "low";
            } else if (guess > result) {
                Status = "high";
            }
            if (guess == result) { //skulle använt guess.Equals men det fungerade inte här
                JOptionPane.showMessageDialog(null, "You guessed the number " + guess + " and that was correct! You guessed " + guesses + " times.");
            } else if (guess != result) { //skulle använt guess.NotEquals men det fungerade inte här
                JOptionPane.showMessageDialog(null, "You guessed the number " + guess + " and that was incorrect! You guessed " + guesses + " times." + "\nThe guess was too " + Status + "." + "\n Guess again.");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }


    }
}