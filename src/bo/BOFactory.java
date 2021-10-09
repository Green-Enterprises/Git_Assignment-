package bo;

/**
 * @author Ushan Gallage <ushansanu@gmail.com> (www.linkedin.com/in/ushan-gallage)
 * @since 09/10/2021
 */

import bo.custom.impl.*;

public class BOFactory {
    private static BOFactory boFactory;

    public BOFactory() {
    }
    public static BOFactory getInstance() {
        return (boFactory == null) ?
                (boFactory = new BOFactory()) : (boFactory);
    }
    public enum BOType {
        CUSTOMER, ITEM
    }
    public <T> T getBo(BOType type) {
        switch (type) {
            case CUSTOMER:
                return (T) new CustomerBOImpl();
            case ITEM:
                return (T) new ItemBOImpl();
            default:
                return null;
        }
    }
}
