package ChainedException;

public class SystemInitializer {

    private DataLoader dataLoader = new DataLoader();

    public void initializeSystem() throws SystemInitializationException {
        try {
            dataLoader.loadData();

        } catch (DataLoadException e) {
            throw new SystemInitializationException("System initialization failed", e);
        }
    }
}

