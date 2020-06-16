package service;

import java.util.regex.*;

public class WordRules{

    public boolean wordsCheck(String word) {
        // words just with small letters with length 5, 6 or 7
        return Pattern.matches("[a-z]{5,7}", word);
    }

}
