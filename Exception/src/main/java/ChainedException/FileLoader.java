package ChainedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileLoader {

    public void loadFile() throws FileNotFoundException {
        // Simulating missing file
        throw new FileNotFoundException("Config file not found: config.json");
    }
}

