package Interfaces;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface ContentProvider {
    List<Character> readFile(File txtFile) throws IOException;
}
