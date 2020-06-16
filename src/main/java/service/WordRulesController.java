package controller;

import resource.WordResource;
import resource.WordResourceNL;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordRulesController{
    WordRules wordRules = new WordRules();

    public Set<String> wordRulesCheck() throws IOException {
        WordResource wordResourceNL = new WordResourceNL();
        Set<String> allWordsSet =wordResourceNL.nlResource();
        Iterator<String> iterator = allWordsSet.iterator();

        Set<String> filterdWords = new HashSet<String>();
            while (iterator.hasNext()) {
                String nextWord = iterator.next();
                if (wordRules.wordsCheck(nextWord) == true) {
                    filterdWords.add(nextWord);
                }

        }
            // set of words which pass the rules
        return filterdWords;
    }
}
