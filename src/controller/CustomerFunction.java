package controller;

import db.DBConnection;
import model.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * @author Ushan Gallage <ushansanu@gmail.com> (www.linkedin.com/in/ushan-gallage)
 * @since 09/10/2021
 */
public class CustomerFunction {
    public boolean saveCustomer(Customer c) throws SQLException, ClassNotFoundException {
        Connection con= DBConnection.getInstance().getConnection();
        String query="INSERT INTO Customer VALUES(?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1,c.getID());
        stm.setObject(2,c.getName());
        stm.setObject(3,c.getAddress());
        stm.setObject(4,c.getContact());
        return stm.executeUpdate()>0;
    }
}
