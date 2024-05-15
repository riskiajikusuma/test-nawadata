package com.ajik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortCharacterTest {

    private SortCharacter sortCharacter = new SortCharacter();

    @Test
    public void test1() {
        String input = "Sample Case";
        String resultVowel = sortCharacter.procVowel(input);
        String resultConsonant = sortCharacter.procConsonant(input);
        assertEquals(resultVowel, "aaee");
        assertEquals(resultConsonant, "ssmplc");
    }

    @Test
    public void test2() {
        String input = "Next Case";
        String resultVowel = sortCharacter.procVowel(input);
        String resultConsonant = sortCharacter.procConsonant(input);
        assertEquals(resultVowel, "eea");
        assertEquals(resultConsonant, "nxtcs");
    }
}
