package resource;

import java.io.IOException;
import java.util.Set;

public class WordResourceNL implements WordResource  {
    public Set<String> NlResource () throws IOException {
        WordResourceReader wordResourceReader = new WordResourceReader();
        return  wordResourceReader.readFile("wordenlist.txt");
    }
}
