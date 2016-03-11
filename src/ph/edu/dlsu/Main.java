package ph.edu.dlsu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    private static int FRAME_WIDTH = 640;
    private static int FRAME_HEIGHT = 360;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        Player player = new Player("file:///home/cobalt/IdeaProjects/PlayVideo3/res/GameofThronesTheme.mp4");
        // Player player = new Player("file:///home/cobalt/IdeaProjects/PlayVideo3/res/HelloWorld.mov"); // not supported
        Scene scene= new Scene(player, FRAME_WIDTH , FRAME_HEIGHT, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
