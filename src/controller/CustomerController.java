package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import model.Customer;

import java.sql.SQLException;

/**
 * @author Ushan Gallage <ushansanu@gmail.com> (www.linkedin.com/in/ushan-gallage)
 * @since 09/10/2021
 */
public class CustomerController {
    public JFXTextField txtID;
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
    public Button btnCustomer;

    public void btnCustomerOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String id = txtID.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String contact = txtContact.getText();

        if(new CustomerFunction().saveCustomer(new Customer(id, name, address, contact ))) {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Saved..!").show();
        }  else {
            new Alert(Alert.AlertType.WARNING, "Try Again..!").show();
        }
    }

}
