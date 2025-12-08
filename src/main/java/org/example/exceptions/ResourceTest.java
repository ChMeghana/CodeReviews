package org.example.exceptions;
class Resource implements AutoCloseable {
    String name;
    Resource(String name) { this.name = name; System.out.println(name + " opened"); }
    void operation() throws Exception {
        if (name.equals("File")) throw new Exception("File operation failed");
        System.out.println(name + " operation done");
    }
    public void close() { System.out.println(name + " closed"); }
}

public class ResourceTest {
    public static void main(String[] args) {
        try (Resource db = new Resource("DB");
             Resource file = new Resource("File");
             Resource socket = new Resource("Socket")) {

            db.operation();
            file.operation();
            socket.operation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

