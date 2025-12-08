package layerexceptions;

public class Controller {
    private Service service = new Service();

    public void process() throws ApplicationException {
        try {
            service.performAction();

        } catch (DAOException e) {
            throw new ApplicationException("Controller: Failed to process request", e);
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();

        try {
            controller.process();
        } catch (ApplicationException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
