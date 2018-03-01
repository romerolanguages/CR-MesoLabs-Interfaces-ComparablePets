package io.zipcoder.petsTest;

import io.zipcoder.pets.Direwolf;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.PetFactory;
import io.zipcoder.pets.PetWarehouse;
import org.junit.Assert;
import org.junit.Test;

public class PetWarehouseTest {

    private Dog dog;
    private Cat cat;
    private Direwolf direwolf;
    private PetFactory petFactory;

    @Test
    public void PetWarehouseConstructorTest() {
        // Given
        int expectedPetArrayListSize = 0;
        // When
        int actualPetArrayListSize = PetWarehouse.INSTANCE.getNumberOfPets();
        // Then
        Assert.assertEquals(expectedPetArrayListSize, actualPetArrayListSize);
    }

    @Test
    public void getPetsTest() {
        // Given
        String expectedDogName = "dogName";
        // When
        dog = new Dog(expectedDogName);
        PetWarehouse.INSTANCE.getPets().add(dog);
        String actualDogName = PetWarehouse.INSTANCE.getPets().get(0).getName();
        // Then
        Assert.assertEquals(expectedDogName, actualDogName);
    }

    @Test
    public void getNumberOfPetsTest() {
        // Given
        int expectedSizeOfPetArrayList = 1;
        // When
        cat = new Cat("catName");
        PetWarehouse.INSTANCE.getPets().add(cat);
        int actualSizeOfPetArrayList = PetWarehouse.INSTANCE.getNumberOfPets();
        // Then
        Assert.assertEquals(expectedSizeOfPetArrayList, actualSizeOfPetArrayList);
    }

    @Test
    public void addPetsTest() {
        // Given
        String expectedNewDogName = "newDogName";
        // When
        dog = new Dog(expectedNewDogName);
        PetWarehouse.INSTANCE.addPets(dog);
        String actualNewDogName = PetWarehouse.INSTANCE.getPets().get(0).getName();
        // Then
        Assert.assertEquals(expectedNewDogName, actualNewDogName);
    }

    @Test
    public void removePetsTest() {
        // Given
        String expectedNewDirewolfName = "newDirewolfName";
        int expectedPetArrayListSize = 0;
        // When
        direwolf = new Direwolf(expectedNewDirewolfName);
        PetWarehouse.INSTANCE.addPets(direwolf);
        PetWarehouse.INSTANCE.removePets(direwolf);
        int actualPetArrayListSize = PetWarehouse.INSTANCE.getNumberOfPets();
        // Then
        Assert.assertEquals(expectedPetArrayListSize, actualPetArrayListSize);
    }

    @Test
    public void printPetNamesAndWhatTheySpeakTest() {
        // Given
        String expectedPetName = "petName";
        String expectedWhatPetSpeaks = "woof";
        Dog pet = new Dog(expectedPetName);
        // When
        PetWarehouse.INSTANCE.addPets(pet);
        String actualPetName = PetWarehouse.INSTANCE.getPets().get(0).getName();
        String actualWhatPetSpeaks = PetWarehouse.INSTANCE.getPets().get(0).speak();
        PetWarehouse.INSTANCE.printPetNamesAndWhatTheySpeak();
        // Then
        Assert.assertEquals(expectedPetName, actualPetName);
        Assert.assertEquals(expectedWhatPetSpeaks, actualWhatPetSpeaks);
    }

    @Test
    public void sortPetNamesByNameThenClassTypeTest() {
        // Given
        petFactory = new PetFactory();
        String expectedFirstPetType = "cat";
        String expectedFirstPetName = "adam";
        String expectedSecondPetType = "dog";
        String expectedSecondPetName = "adam";
        String expectedThirdPetType = "direwolf";
        String expectedThirdPetName = "bobby";
        String expectedFourthPetType = "cat";
        String expectedFourthPetName = "cathy";
        // Created pets in reversed order
        petFactory.createPet(expectedFourthPetType, expectedFourthPetName);
        petFactory.createPet(expectedThirdPetType, expectedThirdPetName);
        petFactory.createPet(expectedSecondPetType, expectedSecondPetName);
        petFactory.createPet(expectedFirstPetType, expectedFirstPetName);
        // When
        PetWarehouse.INSTANCE.sortPetsByNameThenClassType();
        String actualFirstPetName = PetWarehouse.INSTANCE.getPets().get(0).getName();
        String actualSecondPetName = PetWarehouse.INSTANCE.getPets().get(1).getName();
        String actualThirdPetName = PetWarehouse.INSTANCE.getPets().get(2).getName();
        String actualFourthPetName = PetWarehouse.INSTANCE.getPets().get(3).getName();
        // Then
        Assert.assertEquals(expectedFirstPetName, actualFirstPetName);
        Assert.assertEquals(expectedSecondPetName, actualSecondPetName);
        Assert.assertEquals(expectedThirdPetName, actualThirdPetName);
        Assert.assertEquals(expectedFourthPetName, actualFourthPetName);
    }

    @Test
    public void sortPetNamesByClassTypeThenNameTest() {
        // Given
        petFactory = new PetFactory();
        String expectedFirstPetType = "cat";
        String expectedFirstPetName = "adam";
        String expectedSecondPetType = "cat";
        String expectedSecondPetName = "bobby";
        String expectedThirdPetType = "direwolf";
        String expectedThirdPetName = "zack";
        String expectedFourthPetType = "dog";
        String expectedFourthPetName = "summer";
        // Created pets in reversed order
        petFactory.createPet(expectedFourthPetType, expectedFourthPetName);
        petFactory.createPet(expectedThirdPetType, expectedThirdPetName);
        petFactory.createPet(expectedSecondPetType, expectedSecondPetName);
        petFactory.createPet(expectedFirstPetType, expectedFirstPetName);
        // When
        PetWarehouse.INSTANCE.sortPetNamesByClassTypeThenName();
        String actualFirstPetName = PetWarehouse.INSTANCE.getPets().get(0).getName();
        String actualSecondPetName = PetWarehouse.INSTANCE.getPets().get(1).getName();
        String actualThirdPetName = PetWarehouse.INSTANCE.getPets().get(2).getName();
        String actualFourthPetName = PetWarehouse.INSTANCE.getPets().get(3).getName();
        // Then
        Assert.assertEquals(expectedFirstPetName, actualFirstPetName);
        Assert.assertEquals(expectedSecondPetName, actualSecondPetName);
        Assert.assertEquals(expectedThirdPetName, actualThirdPetName);
        Assert.assertEquals(expectedFourthPetName, actualFourthPetName);
    }

}
