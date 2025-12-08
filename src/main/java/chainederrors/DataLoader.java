package chainederrors;

import java.io.FileNotFoundException;

class DataLoader {

    public void load() throws DataLoadException {
        try {
            throw new FileNotFoundException("Config file missing");

        } catch (FileNotFoundException e) {
            throw new DataLoadException("Data Load Error", e);
        }
    }
}
