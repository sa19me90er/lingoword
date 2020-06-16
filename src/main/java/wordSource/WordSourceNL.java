package wordSource;


import java.io.IOException;
import java.util.Set;

public class IWordSourceNL implements IWordSource{

    private IWordSourceReader wordResourceReader = new IWordSourceReader();

    @Override
    public Set<String> nlResource () throws IOException, NullPointerException{
        return  wordResourceReader.readFile("wordenlist.txt");
    }
}
