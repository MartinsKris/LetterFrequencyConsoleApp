package Methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Interfaces.ContentProvider;

public class ContentCharList implements ContentProvider {
    /**
     * Read by line from received text. Removes all symbols that isn't letters and empty space.
     * Each line is splitted to character array, then when iterates through array, chars are converted to uppercase
     * and added to final character array where is stored all letters as characters from text file.
     * @param txtFile as text file (.txt) from provided user directory.
     * @return Character array that consists only of letters that was int parameter .txt file, all converted to upper case.
     * @throws IOException an exceptions if an input or output operation is failed or interpreted.
     */
    public List<Character> readFile(File txtFile) throws IOException {
        String line;
        List<Character> charList = new ArrayList<>();
        BufferedReader txtReader = new BufferedReader(new FileReader(txtFile));

        while ((line = txtReader.readLine()) != null){
            line = line.replaceAll("[^a-zA-Z]", "");

            for (char charValue : line.toUpperCase().toCharArray()){
                charList.add(charValue);
            }
        }
        return charList;
    }
}
