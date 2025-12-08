package chainederrors;

class Initializer {
    DataLoader loader = new DataLoader();

    public void start() throws SystemInitializationException {
        try {
            loader.load();

        } catch (DataLoadException e) {
            throw new SystemInitializationException("System Init Failed", e);
        }
    }
}
