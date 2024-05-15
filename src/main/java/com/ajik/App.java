package com.ajik;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("1. Problem : Sort Character");
        System.out.print("Input one line of words (S) : ");
        String input = scanner.nextLine();
        SortCharacter sortCharacter = new SortCharacter();
        String charVowel = sortCharacter.procVowel(input);
        String charConsonant = sortCharacter.procConsonant(input);
        System.out.println("Vowel Characters : " + charVowel);
        System.out.println("Consonant Characters : " + charConsonant);
        System.out.println("========================================");
        System.out.println("2. PSBB (Pembatasan Sosial Berskala Besar)");
        Psbb psbb = new Psbb();
        psbb.result(scanner);
        System.out.println("========================================");
    }
}
