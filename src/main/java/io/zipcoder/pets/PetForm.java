package io.zipcoder.pets;

import java.util.Arrays;
import java.util.Scanner;

public class PetForm {

    private PetFactory petFactory;
    private Scanner scanner;

    public PetForm() {
        this.petFactory = new PetFactory();
        this.scanner = new Scanner(System.in);
    }

    public int howManyPets() {
        int numberOfPets = -1;
        do {
            System.out.println("How many pets do you have?");
            String input = scanner.nextLine();
            try {
                numberOfPets = Integer.parseInt(input);
                if (numberOfPets < 0) {
                    System.out.println("You cannot enter a negative number.");
                    System.out.println("Please enter either zero or a positive number.");
                    System.out.println();
                } else if (numberOfPets == 0) {
                    System.out.println("You said you don't have any pets.");
                    System.out.println("Good-bye.");
                    System.out.println();
                }
            } catch (NumberFormatException nfe) {
                System.out.println("You did not enter a valid number.");
                System.out.println("Please try again.");
                System.out.println();
            }
        } while (numberOfPets < 0);

        return numberOfPets;
    }

    public void sendPetToFactory(int numberOfPets) {
        for (int i = 1; i <= numberOfPets; i++) {
            System.out.println("Pet #" + i);
            String petType = whatKindOfPet();
            String petName = whatIsThePetName();
            petFactory.createPet(petType, petName);
        }
    }

    public String whatKindOfPet() {
        String petType = "";
        do {
            System.out.println("What kind of pets do you have? (Your only choices are: dog, cat, or direwolf).");
            System.out.println("Please enter one at a time:");
            petType = scanner.nextLine().toLowerCase();
            if (! (petType.equals("dog") || petType.equals("cat")
                    || petType.equals("direwolf")) ) {
                System.out.println("We don't accept that kind of pet.");
                System.out.println("Please try again.");
                System.out.println();
                petType = "";
            }
        } while (petType.isEmpty());

        return petType;
    }

    public String whatIsThePetName() {
        String petName = "";
        do {
            System.out.println("What is the name of your pet? (Enter a name with only letters).");
            petName = scanner.nextLine();
            if (! petName.matches("^[a-zA-Z]+$")) {
                System.out.println("Please try again.");
                System.out.println();
                petName = "";
            }
        } while (petName.isEmpty());

        return petName;
    }
}
