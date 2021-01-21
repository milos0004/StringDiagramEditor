import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{


    @Override
    public void start(Stage homeStage) throws Exception {
        homeStage.setTitle("Home");
        Parent homeRoot = FXMLLoader.load(getClass().getResource("resources/home.fxml"));
        Scene homeScene = new Scene(homeRoot);
        homeStage.setScene(homeScene);
        homeStage.show();

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
