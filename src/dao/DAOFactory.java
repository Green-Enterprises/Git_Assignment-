package dao;

/**
 * @author Ushan Gallage <ushansanu@gmail.com> (www.linkedin.com/in/ushan-gallage)
 * @since 09/10/2021
 */
import dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;

    public DAOFactory() {
    }
    public static DAOFactory getInstance() {
        return (daoFactory == null) ?
                (daoFactory = new DAOFactory()  ) : (daoFactory);
    }
    public enum DAOType {
        CUSTOMER, ITEM
    }
    public <T> T getDao(DAOType type){
        switch (type) {
            case CUSTOMER:
                return (T) new CustomerDAOImpl();
            case ITEM:
                return (T) new ItemDAOImpl();
            default:
                return null;
        }
    }
}
