package io.zipcoder.petsTest;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Direwolf;
import org.junit.Assert;
import org.junit.Test;

public class DirewolfTest {

    private Direwolf direwolf;

    @Test
    public void DirewolfDefaultConstructorTest() {
        // Given
        String expectedDirewolfName = "";
        // When
        direwolf = new Direwolf();
        String actualDirewolfName = direwolf.getName();
        // Assert
        Assert.assertEquals(expectedDirewolfName, actualDirewolfName);
    }

    @Test
    public void DirewolfConstructorNameTest() {
        // Given
        String expectedDirewolfName = "direwolfName";
        // When
        direwolf = new Direwolf(expectedDirewolfName);
        String actualDirewolfName = direwolf.getName();
        // Assert
        Assert.assertEquals(expectedDirewolfName, actualDirewolfName);
    }
    @Test
    public void setNameTest() {
        // Given
        String expectedDirewolfName = "Ghost";
        // When
        direwolf = new Direwolf();
        direwolf.setName(expectedDirewolfName);
        String actualDirewolfName = direwolf.getName();
        // Assert
        Assert.assertEquals(expectedDirewolfName, actualDirewolfName);
    }

    @Test
    public void getNameTest() {
        // Given
        String expectedDirewolfName = "Summer";
        // When
        direwolf = new Direwolf(expectedDirewolfName);
        String actualDirewolfName = direwolf.getName();
        // Assert
        Assert.assertEquals(expectedDirewolfName, actualDirewolfName);
    }

    @Test
    public void speakTest() {
        // Given
        String expectedDirewolfName = "Summer";
        String expectedDirewolfSpeak = "ah-ooh";
        // When
        direwolf = new Direwolf(expectedDirewolfName);
        String actualDirewolfSpeak = direwolf.speak();
        // Then
        Assert.assertEquals(expectedDirewolfSpeak, actualDirewolfSpeak);
    }
}
