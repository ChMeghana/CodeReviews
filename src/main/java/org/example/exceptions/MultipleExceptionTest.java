package org.example.exceptions;
import java.io.*;
import java.sql.SQLException;

public class MultipleExceptionTest {
    public static void main(String[] args) {
        try {
            if (true) throw new IOException("IO Error");
            // else if (true) throw new SQLException("SQL Error");
            // else throw new NullPointerException("NPE");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } //catch (SQLException e) {
            //System.out.println("Caught SQLException: " + e.getMessage());
        //}
        catch (NullPointerException e) {
            System.out.println("Caught NPE: " + e.getMessage());
        }
    }
}

