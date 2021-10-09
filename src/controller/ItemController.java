package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import model.Item;

import java.sql.SQLException;

/**
 * @author Ushan Gallage <ushansanu@gmail.com> (www.linkedin.com/in/ushan-gallage)
 * @since 09/10/2021
 */
public class ItemController {

    public JFXTextField txtItemCode;
    public JFXTextField txtDics;
    public JFXTextField txtPackSize;
    public JFXTextField txtUnitPrice;
    public Button btnCustomer;

    public void btnItemOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String code = txtItemCode.getText();
        String discription = txtDics.getText();
        String packsize = txtPackSize.getText();
        String price = txtUnitPrice.getText();

        if(new ItemFunction().saveItem(new Item(code, discription, Integer.parseInt(packsize), Double.parseDouble(price)))) {
            new Alert(Alert.AlertType.CONFIRMATION, "Item Saved..!").show();
        }  else {
            new Alert(Alert.AlertType.WARNING, "Try Again..!").show();
        }
    }
}
