import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Ushan Gallage <ushansanu@gmail.com> (www.linkedin.com/in/ushan-gallage)
 * @since 09/10/2021
 */
public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/Customer.fxml"))));
        primaryStage.show();
    }
}
