package ResourceManagement;

class DatabaseConnection implements AutoCloseable {
    public void open() {
        System.out.println("Database connection opened");
    }

    @Override
    public void close() {
        System.out.println("Database connection closed");
    }
}

class FileResource implements AutoCloseable {
    public void open() {
        System.out.println("File opened");
    }

    @Override
    public void close() {
        System.out.println("File closed");
    }
}

class NetworkSocket implements AutoCloseable {
    public void open() {
        System.out.println("Network socket opened");
    }

    @Override
    public void close() {
        System.out.println("Network socket closed");
    }
}

