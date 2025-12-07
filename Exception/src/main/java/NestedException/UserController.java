package NestedException;

public class UserController {

    private UserService service = new UserService();

    public void handleRequest() throws ApplicationException {
        try {
            String user = service.fetchUser();
            System.out.println(user);

        } catch (ServiceException e) {
            // Wrap into ApplicationException
            throw new ApplicationException("Error in Controller layer", e);
        }
    }
}
