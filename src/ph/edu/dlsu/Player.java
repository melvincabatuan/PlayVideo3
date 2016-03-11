package ph.edu.dlsu;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * Created by cobalt on 3/11/16.
 */
public class Player extends BorderPane {
    Media media;
    MediaPlayer mediaPlayer;
    MediaView mediaView;
    Pane mediaPane;

    public Player (String file){
        media = new Media(file);
        mediaPlayer= new MediaPlayer(media);
        mediaView= new MediaView(mediaPlayer);
        mediaPane=new Pane();
        mediaPane.getChildren().add(mediaView);
        setCenter(mediaPane);
        mediaPlayer.play();
    }

}