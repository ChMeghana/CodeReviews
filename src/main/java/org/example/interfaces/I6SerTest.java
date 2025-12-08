package org.example.interfaces;

import java.io.*;

class User implements Serializable {
    String username;
    transient String password;   // will NOT be serialized

    User(String u, String p) { username = u; password = p; }
}

public class I6SerTest {
    public static void main(String[] args) throws Exception {

        User u = new User("John", "secret123");

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("u.ser"));
        oos.writeObject(u); oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("u.ser"));
        User out = (User) ois.readObject();
        ois.close();

        System.out.println(out.username);
        System.out.println(out.password); // null because transient
    }
}
