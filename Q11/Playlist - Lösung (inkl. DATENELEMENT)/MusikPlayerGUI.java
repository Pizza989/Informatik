import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class MusikPlayerGUI extends Application {
    public MUSIKPLAYER musik_player;

    public MusikPlayerGUI() {
        super();
        this.musik_player = new MUSIKPLAYER();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button start_btn = new Button();
        start_btn.setText("Start");
        start_btn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Starten");
                musik_player.starten("BigBillBroonzy-BabyPleaseDontGo.mp3");
            }
        });

        Button stop_btn = new Button();
        stop_btn.setText("Stop");
        stop_btn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Stoppen");
                musik_player.stoppen();            
            }
        });
        
        Parent root = FXMLLoader.load(getClass().getResource(""));
        primaryStage.setTitle("Spoke");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}