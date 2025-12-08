package Exceptions;


class ApplicationException extends Exception {
    public ApplicationException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

class Dao {
    public void fetchData() throws Exception {
        throw new Exception("Database connection failed"); // Simulated DB error
    }
}

class Service {
    private Dao dao = new Dao();

    public void getData() throws ApplicationException {
        try {
            dao.fetchData();
        } catch (Exception e) {
            throw new ApplicationException("Service failed to get data", e);
        }
    }
}

class Controller {
    private Service service = new Service();

    public void handleRequest() {
        try {
            service.getData();
        } catch (ApplicationException e) {
            System.out.println("Controller caught: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause().getMessage());
        }
    }
}

public class Nested {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.handleRequest();
    }
}
