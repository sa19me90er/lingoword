package wordSource;

import java.io.IOException;
import java.util.Set;

public interface IWordSource {
    public Set<String> nlResource () throws IOException, NullPointerException;

}
