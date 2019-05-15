package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import model.Model;
import view.View;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Model model = new Model();

    @FXML
    private Label levelNumberLabel;
    @FXML
    private Label mapNameLabel;
    @FXML
    private Label stepLabel;
    @FXML
    private Label recordStepsLabel;
    @FXML
    private Pane gamePane;
    @FXML
    private Label gameOverLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        handleResetClick();
    }

    public void handleKeyPress(KeyEvent keyEvent){
        if (keyEvent.getText().equals("w")) model.getLevel().move(-1,0);
        else if (keyEvent.getText().equals("a")) model.getLevel().move(0,-1);
        else if (keyEvent.getText().equals("s")) model.getLevel().move(1,0);
        else if (keyEvent.getText().equals("d")) model.getLevel().move(0,1);
        stepLabel.setText(model.getLevel().getStepToString());

        if (model.getLevel().isLevelOver()) {
            if (model.getSave().isNewRecord(stepLabel.getText())) {
                model.getSave().setRecordStep(stepLabel.getText());
                model.saveFileWriter();
                recordStepsLabel.setText(model.getSave().getRecordStep());
            }

            gameOverLabel.setText("GAME OVER");
        }
        View.drowTiles(gamePane, model);
    }

    public void handleResetClick(){
        model.setNewLevel(levelNumberLabel.getText());
        model.getLevel().setStep(0);
        stepLabel.setText(model.getLevel().getStepToString());
        mapNameLabel.setText(model.getLevel().getName());
        recordStepsLabel.setText(model.getSave().getRecordStep());
        gameOverLabel.setText("");
        View.drowTiles(gamePane, model);
    }

    public void handleMinusClick(){
       // levelNumberLabel.setText(model.previousLevel(levelNumberLabel.getText()));
        levelNumberLabel.setText(model.previousLevel());
        handleResetClick();
    }

    public void handlePlusClick(){
      //  levelNumberLabel.setText(model.nextLevel(levelNumberLabel.getText()));
        levelNumberLabel.setText(model.nextLevel());
        handleResetClick();
    }

    public void handleDeleteRecords(){
        model.deleteSaves();
        model.saveFileWriter();
        model.getSave();
        handleResetClick();
    }



}
