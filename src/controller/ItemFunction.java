package controller;

import db.DBConnection;
import model.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Ushan Gallage <ushansanu@gmail.com> (www.linkedin.com/in/ushan-gallage)
 * @since 09/10/2021
 */
public class ItemFunction {
    public boolean saveItem(Item i) throws SQLException, ClassNotFoundException {
        Connection con= DBConnection.getInstance().getConnection();
        String query="INSERT INTO Item VALUES(?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1,i.getItemCode());
        stm.setObject(2,i.getDiscription());
        stm.setObject(3,i.getPacksize());
        stm.setObject(4,i.getUnitPrice());
        return stm.executeUpdate()>0;
    }
}
