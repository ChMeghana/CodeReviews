package org.example.exceptions;

class ApplicationException extends Exception {
    public ApplicationException(String msg, Throwable cause) { super(msg, cause); }
}

class DAO {
    void fetchData() throws Exception {
        throw new Exception("Database error!");
    }
}

class Service {
    DAO dao = new DAO();
    void process() throws ApplicationException {
        try {
            dao.fetchData();
        } catch (Exception e) {
            throw new ApplicationException("Service failed", e);
        }
    }
}

class Controller {
    Service service = new Service();
    void handleRequest() {
        try {
            service.process();
        } catch (ApplicationException e) {
            System.out.println("Controller caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

public class NestedExceptionTest {
    public static void main(String[] args) {
        new Controller().handleRequest();
    }
}
