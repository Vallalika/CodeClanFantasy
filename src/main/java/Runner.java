import characters.Cleric;
import characters.Fighter;
import characters.Magician;
import characters.Player;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("WELCOME TO CODECLAN FANTASY LAB!!");
        Scanner in = new Scanner(System.in);
        boolean isValidInput = false;

        while (!isValidInput) {

            System.out.println("Would you like to play a new game? Type Yes or No, then press Return.");
            String startNewQuest = in.nextLine();
            if (startNewQuest.equals("yes") || startNewQuest.equals("Yes")) {
                isValidInput = true;

            } else if (startNewQuest.equals("no") || startNewQuest.equals("No")) {
                System.out.println("Thank you! See you soon :)");
                System.exit(0);

            } else {
                System.out.println("Invalid command.");
            }
        }

        System.out.println("Amazing! Let's create your party first.\rA party has 3 characters. They can fighters, clerics or magicians.");
        ArrayList<String> validClassInput = new ArrayList<>();
        validClassInput.add("fighter");
        validClassInput.add("cleric");
        validClassInput.add("magician");
        boolean isValidClassInput = false;


        while (!isValidClassInput) {
            System.out.println("Which class would you like your first character to be? Type Fighter, Cleric or Magician, then press Return!");
            String inputCharacterOne = in.nextLine();
            Player characterOne;
            System.out.println(inputCharacterOne);
            if (validClassInput.contains(inputCharacterOne.toLowerCase(Locale.ROOT))) {
                inputCharacterOne.toLowerCase(Locale.ROOT);
                isValidClassInput = true;
                System.out.println("Great choice! And how would you like your character to be called?");
                String inputCharacterOneName = in.nextLine();
                switch (inputCharacterOne) {
                    case "fighter":
                        characterOne = new Fighter(inputCharacterOneName, 500, 0);
                        break;
                    case "cleric":
                        characterOne = new Cleric(inputCharacterOneName, 200, 0);
                        break;
                    case "magician":
                        characterOne = new Magician(inputCharacterOneName, 200, 0);
                        break;
                }
                System.out.println("Great! Now let's move on to your second character!");
            } else {
                System.out.println("Sorry, this class doesn't exist!");
            }
        }
    }
}