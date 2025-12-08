package Exceptions;


class DatabaseConnection implements AutoCloseable {
    public DatabaseConnection() throws Exception {
        System.out.println("Opening database connection");
        if (Math.random() < 0.3) throw new Exception("DB connection failed");
    }
    public void query() { System.out.println("Querying database"); }
    @Override
    public void close() { System.out.println("Closing database connection"); }
}

class FileResource implements AutoCloseable {
    public FileResource() throws Exception {
        System.out.println("Opening file");
        if (Math.random() < 0.3) throw new Exception("File open failed");
    }
    public void read() { System.out.println("Reading file"); }
    @Override
    public void close() { System.out.println("Closing file"); }
}

class NetworkSocket implements AutoCloseable {
    public NetworkSocket() throws Exception {
        System.out.println("Opening network socket");
        if (Math.random() < 0.3) throw new Exception("Socket failed");
    }
    public void sendData() { System.out.println("Sending data"); }
    @Override
    public void close() { System.out.println("Closing network socket"); }
}

public class ResourceManagement {
    public static void main(String[] args) {
        try (DatabaseConnection db = new DatabaseConnection();
             FileResource file = new FileResource();
             NetworkSocket socket = new NetworkSocket()) {

            db.query();
            file.read();
            socket.sendData();

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
