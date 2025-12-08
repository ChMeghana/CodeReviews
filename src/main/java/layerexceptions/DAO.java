package layerexceptions;

class DAO {

    public void fetchData() throws DAOException {
        try {
            throw new RuntimeException("Database crashed!");

        } catch (RuntimeException e) {
            throw new DAOException("DAO Error while fetching data", e);
        }
    }
}
