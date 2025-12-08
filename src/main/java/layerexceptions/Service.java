package layerexceptions;

class Service {
    private DAO dao = new DAO();

    public void performAction() throws DAOException {
        dao.fetchData();
    }
}
