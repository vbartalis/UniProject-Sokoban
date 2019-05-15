package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.Model;

public class View extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/game.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Sokoban");
        stage.setScene(scene);
        stage.show();
    }

    public static void drowTiles(Pane pane, Model model){
        Image imgBrick = new Image("/image/brick.jpg"); //#
        Image imgCrate = new Image("/image/crate.jpg"); //$
        Image imgCrateDestination = new Image("/image/crateDestination.jpg"); //*
        Image imgRobotTransparent = new Image("/image/robotTransparent.png"); //@
        Image imgDestinationTransparent = new Image("/image/destinationTransparent.png"); //.
        Image imgRobotDestinationTransparent = new Image("/image/robotDestinationTransparent.png"); //+

        pane.getChildren().clear();
        int scale = model.getScale(pane);

        for (int i = 0; i < model.getLevel().getCharMap().size(); i++) {
            for (int j = 0; j < model.getLevel().getCharMap().get(i).size(); j++) {
                Rectangle rectangle = new Rectangle(j*(scale) ,i*(scale),scale,scale);
                if (model.getLevel().getCharMap().get(i).get(j) == '#') rectangle.setFill(new ImagePattern(imgBrick));
                if (model.getLevel().getCharMap().get(i).get(j) == '$') rectangle.setFill(new ImagePattern(imgCrate));
                if (model.getLevel().getCharMap().get(i).get(j) == ' ') rectangle.setFill(Color.TRANSPARENT);
                if (model.getLevel().getCharMap().get(i).get(j) == '@') rectangle.setFill(new ImagePattern(imgRobotTransparent));
                if (model.getLevel().getCharMap().get(i).get(j) == '.') rectangle.setFill(new ImagePattern(imgDestinationTransparent));
                if (model.getLevel().getCharMap().get(i).get(j) == '*') rectangle.setFill(new ImagePattern(imgCrateDestination));
                if (model.getLevel().getCharMap().get(i).get(j) == '+') rectangle.setFill(new ImagePattern(imgRobotDestinationTransparent));
                pane.getChildren().add(rectangle);
            }
        }
    }




}