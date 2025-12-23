package Com_PlayersGuide_KiersStefan.Challenge_24;
/*
 Stefan Kiers
 23 -12 - '25
 This is my interpretation of the players guide Simulas soup challenge
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner((System.in));

        // statement + input for enums
        System.out.println("Choose soup type : (SOUP, STEW, GUMBO)");
        SoupType soupType = null;
        while (soupType == null){
            try {
                soupType = SoupType.valueOf(userChoice.nextLine().toUpperCase());
            }catch (IllegalArgumentException e ){
                System.out.println("Invalid soup type, try again");
                System.out.println("Choose soup type : (SOUP, STEW, GUMBO)");
            }
        }
        System.out.println("Choose main ingredient : (MUSHROOMS, CHICKEN, CARROTS, POTATOES)");
        MainIngredient mainIngredient = null;
        while (mainIngredient == null){
            try {
                mainIngredient = MainIngredient.valueOf(userChoice.nextLine().toUpperCase());
            }catch (IllegalArgumentException e ){
                System.out.println("Invalid ingredient, try again");
                System.out.println("Choose main ingredient : (SOUP, STEW, GUMBO)");
            }
        }
        System.out.println("Choose seasoning : (SPICY, SALTY, SWEET)");
        Seasoning seasoning = null;
        while (seasoning == null){
            try {
                seasoning = Seasoning.valueOf(userChoice.nextLine().toUpperCase());
            }catch (IllegalArgumentException e ){
                System.out.println("Invalid seasoning choice, try again");
                System.out.println("Choose soup type : (SOUP, STEW, GUMBO)");
            }
        }

        Soup soup = new Soup(soupType, mainIngredient , seasoning);

        System.out.println("You're Choice : " + soup);
    }
}