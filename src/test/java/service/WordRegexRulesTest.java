package service;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.io.IOException;
import java.util.Set;
import java.util.stream.Stream;


public class WordRegexRulesTest {

    public boolean doesWordContainsOnlyLetters(String word){
        int len = word.length();

        // checks first whether word is longer than 7 ot less than 5 letters
        if (len < 5 || len > 7) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            // checks whether the character is not a letter
            // if it is not a letter ,it will return false
            if (Character.isLetter(word.charAt(i)) == false) {
                return false;
            }
            // checks whether the character is capital letter
             if (Character.isUpperCase(i) == true){
                 return false;
             }
        }
        return true;
    }

    // convert the words set to stream
    public static Stream<String> allWordsStream() throws IOException {
        WordRules wordRuleController = new WordRulesController();
        Set<String> filterdWords = wordRuleController.wordRulesCheck();
        Stream<String> wordStream = filterdWords.stream();
        return wordStream;
    }

    @ParameterizedTest
    @MethodSource("allWordsStream")
    void verifyMovesAndResults (String word){
        assertTrue(doesWordContainsOnlyLetters(word));
    }

}




