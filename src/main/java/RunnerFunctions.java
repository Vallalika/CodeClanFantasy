import characters.Cleric;
import characters.Fighter;
import characters.Magician;
import characters.Player;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class RunnerFunctions {

    private Scanner in = new Scanner(System.in);
    private Player characterOne;
    private Player characterTwo;
    private Player characterThree;

    public void initiateGame() {
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

    }

    public void createCharacterOne() {

        System.out.println("Amazing! Let's create your party first.");
        System.out.println("A party has 3 characters. They can be fighters, clerics or magicians.");
        ArrayList<String> validClassInput = new ArrayList<>();
        validClassInput.add("fighter");
        validClassInput.add("cleric");
        validClassInput.add("magician");
        boolean isValidClassInput = false;


        while (!isValidClassInput) {
            System.out.println("Which class would you like your first character to be? Type Fighter, Cleric or Magician, then press Return!");
            String inputCharacterOne = in.nextLine();
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
                System.out.println("Great! " + characterOne.getName() + " is your new " + inputCharacterOne +"!");
            } else {
                System.out.println("Sorry, this class doesn't exist!");
            }
        }
    }
}