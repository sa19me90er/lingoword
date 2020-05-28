package controller;

import resource.WordResource;
import resource.WordResourceNL;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class WordRulesController {
    WordRules wordRules = new WordRules();

    public void wordRulesCheck() throws IOException {
        WordResource wordResourceNL = new WordResourceNL();
        Set<String> wordsSet =wordResourceNL.NlResource();
        Iterator<String> iterator = wordsSet.iterator();
            while (iterator.hasNext()) {
                String nextWord = iterator.next();
                if (wordRules.WordsCheck(nextWord) == true) {
                    System.out.println(nextWord);
                }
        }
    }
}
