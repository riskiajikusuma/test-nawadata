package com.ajik;

public class SortCharacter {

    private final String charVowel = "aeiou";
    private final String charConsonant = "bcdfghjklmnpqrstvwxyz";

    public String procVowel(String param) {
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < param.length(); i++) {
            char c = param.toLowerCase().charAt(i);
            if (charVowel.indexOf(c) != -1) {
                vowels.append(c);
            }
        }

        return sortResult(vowels.toString());
    }

    public String procConsonant(String param) {
        StringBuilder consonant = new StringBuilder();
        for (int i = 0; i < param.length(); i++) {
            char c = param.toLowerCase().charAt(i);
            if (charConsonant.indexOf(c) != -1) {
                consonant.append(c);
            }
        }

        return sortResult(consonant.toString());
    }

    private String sortResult(String param) {
        StringBuilder result = new StringBuilder();
        char[] charArray = param.toCharArray();

        for (int i = 0; i < charArray.length; ++i) {
            char c = charArray[i];
            String strResult = result.toString();
            if (!strResult.toString().contains(String.valueOf(c))) {
                result.append(c);
                for (int j = i + 1; j < charArray.length; ++j) {
                    if (charArray[j] == c) {
                        result.append(c);
                    }
                }
            }
        }

        return result.toString();
    }
}
