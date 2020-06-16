package wordSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class IWordSourceReader{

    public Set<String> readFile(String fileLink) throws IOException {

        BufferedReader bufferedReader = null;
        Set<String> wordsSet = new HashSet<String>();

        try{
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream istream = classloader.getResourceAsStream(fileLink);
        InputStreamReader isReader = new InputStreamReader(istream);

        bufferedReader = new BufferedReader(isReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equalsIgnoreCase("quit")) {
                break;
            }
            // Here read every line and add it to the set
            wordsSet.add(line);
        }

    }
        catch (IOException ioe) {
            System.out.println("Exception while reading input " + ioe);
        }
        finally {
            // close the streams using close method
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }

        }
        return wordsSet;
    }

}
