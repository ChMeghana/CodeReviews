package NestedException;
public class UserDAO {

    public String getUserFromDB() throws DAOException {
        try {
            // Simulating database crash
            throw new RuntimeException("Database connection failed!");

        } catch (RuntimeException e) {
            // Wrap into DAOException
            throw new DAOException("Error in DAO layer", e);
        }
    }
}

