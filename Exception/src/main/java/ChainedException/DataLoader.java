package ChainedException;

public class DataLoader {

    private FileLoader fileLoader = new FileLoader();

    public void loadData() throws DataLoadException {
        try {
            fileLoader.loadFile();

        } catch (FileNotFoundException e) {
            throw new DataLoadException("Failed to load data due to missing file", e);
        }
    }
}

