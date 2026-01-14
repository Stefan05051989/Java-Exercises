package Com_PlayersGuide_KiersStefan.Challenge_25;
import Com_PlayersGuide_KiersStefan.Challenge_20.TakingANumber;

import java.util.Scanner;

/**
 * Main
 * Challenge: Com_PlayersGuide_KiersStefan.Challenge_25_1
 *
 * @author Stefan Kiers
 * @since 29-12-2025
 */
public class Main {
    public static void main(String[] args) {
        /* TODO:
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, I am Vin Fletcher");
        System.out.println("Choose your arrows as you wish.");
        System.out.println();

        int arrowLength = TakingANumber.AskForNumber(scanner, "Choose the length for the shaft -> ",
                60, 100);

        System.out.println("Your choice : " + arrowLength);
        System.out.println();

        // choose arrowhead
        System.out.println("Choose arrowhead");
        System.out.println("1 : Steel");
        System.out.println("2 : Wood");
        System.out.println("3 : Obsidian");
        System.out.println("Enter your choice : ");
        int arrowHeadChoice = scanner.nextInt();
        Arrowhead selectedArrowhead;
        switch (arrowHeadChoice) {
            case 1:
                selectedArrowhead = Arrowhead.STEEL;
                break;
            case 2:
                selectedArrowhead = Arrowhead.WOOD;
                break;
            case 3:
                selectedArrowhead = Arrowhead.OBSIDIAN;
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }
        System.out.println("Selected arrowhead : " + selectedArrowhead);
        System.out.println();

        // choose fletching
        System.out.println("Choose fletching");
        System.out.println("1 : Plastic");
        System.out.println("2 : Turkey Feathers");
        System.out.println("3 : Goose Feathers");
        System.out.println("Enter your choice : ");

        int fletchingChoice = scanner.nextInt();
        Fletching selectedFletching;
        switch (arrowHeadChoice) {
            case 1:
                selectedFletching = Fletching.PLASTIC;
                break;
            case 2:
                selectedFletching = Fletching.TURKEYFEATHERS;
                break;
            case 3:
                selectedFletching = Fletching.GOOSEFEATHERS;
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }
        System.out.println("Selected arrowhead : " + selectedFletching);
        System.out.println();

        // create arrow and display cost.
        Arrow customArrow = new Arrow(arrowLength, selectedArrowhead, selectedFletching);

        System.out.println("Your custom arrow : " + customArrow);
        System.out.println("Total cost: " + customArrow.getCost() + " gold ");
    }
}
