package org.example;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
@Test
void passwordLength_shouldReturnTrue_whenCalledWithWohnmobil(){
    //GIVEN
    String password = "Wohnmobil";
    boolean expected = true;
    //WHEN
    boolean actual = Main.passwordLength(password);
    //THEN
    assertTrue(actual);
}

    @Test
    void passwordLength_shouldReturnFalse_whenCalledWithAuto(){
        //GIVEN
        String password = "Auto";
        boolean expected = false;
        //WHEN
        boolean actual = Main.passwordLength(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void containsDigits_shouldReturnTrue_whenCalledWithWohnmobil3(){
        //GIVEN
        String password = "Wohnmobil3";
        boolean expected = true;
        //WHEN
        boolean actual = Main.containsDigits(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void containsDigits_shouldReturnFalse_whenCalledWithWohnmobil(){
        //GIVEN
        String password = "Wohnmobil";
        boolean expected = false;
        //WHEN
        boolean actual = Main.containsDigits(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void containsUpperCase_shouldReturnTrue_whenCalledWithWohnmobil(){
        //GIVEN
        String password = "Wohnmobil";
        boolean expected = true;
        //WHEN
        boolean actual = Main.containsUpperCase(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void containsUpperCase_shouldReturnFalse_whenCalledWithcampingplatz(){
        //GIVEN
        String password = "campingplatz";
        boolean expected = false;
        //WHEN
        boolean actual = Main.containsUpperCase(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void containsLowerCase_shouldReturnTrue_whenCalledWithStrandurlaub(){
        //GIVEN
        String password = "Strandurlaub";
        boolean expected = true;
        //WHEN
        boolean actual = Main.containsLowerCase(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void containsLowerCase_shouldReturnFalse_whenCalledWithSTRANDURLAUB(){
        //GIVEN
        String password = "STRANDURLAUB";
        boolean expected = false;
        //WHEN
        boolean actual = Main.containsLowerCase(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void commonPassword_shouldReturnFalse_whenCalledWithadmin(){
        //GIVEN
        String password = "admin";
        boolean expected = false;
        //WHEN
        boolean actual = Main.commonPassword(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void commonPassword_shouldReturnTrue_whenCalledWithCampingplatz(){
        //GIVEN
        String password = "Campingplatz";
        boolean expected = true;
        //WHEN
        boolean actual = Main.commonPassword(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void specialCharacter_shouldReturnTrue_whenCalledWithspecialExplanationMark(){
        //GIVEN
        String password = "special!";
        boolean expected = true;
        //WHEN
        boolean actual = Main.specialCharacters(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void specialCharacter_shouldReturnFalse_whenCalledWithGarden(){
        //GIVEN
        String password = "Garden";
        boolean expected = false;
        //WHEN
        boolean actual = Main.specialCharacters(password);
        //THEN
        assertFalse(actual);
    }

@RepeatedTest(100)
    void randomPassword_shouldReturnTrue_whenCalledWithOverallCheck(){
    //GIVEN
    String safePassword = Main.generatePassword(8);
    boolean expected = true;
    //WHEN
    boolean actual = Main.overallCheck(safePassword);
    //THEN
    assertTrue(actual);

}

}