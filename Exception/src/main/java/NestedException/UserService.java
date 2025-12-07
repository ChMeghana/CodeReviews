package NestedException;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public String fetchUser() throws ServiceException {
        try {
            return userDAO.getUserFromDB();

        } catch (DAOException e) {
            // Wrap into ServiceException
            throw new ServiceException("Error in Service layer", e);
        }
    }
}

