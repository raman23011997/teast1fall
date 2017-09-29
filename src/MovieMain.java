
    import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author raman
 */
public class MovieMain extends Application{

    public static void main(String[] args)
    {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("movie.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Worlds");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}

   
    

