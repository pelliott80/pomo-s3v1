package com.teamtreehouse.pomodoro.controller;

import com.teamtreehouse.pomodoro.model.Attempt;
import com.teamtreehouse.pomodoro.model.AttemptKind;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Created by pelliott on 10/25/16.
 */
public class Home {
    @FXML
    private VBox container;

    @FXML
    private Label title;

    private Attempt mCurrentAttempt;

    private Attempt prepareAttempt(AttemptKind kind){
        clearAttemptStyles();
        mCurrentAttempt = new Attempt("",kind);
        addAttemptStyle(kind);
        title.setText(kind.getDisplayName() );
        return mCurrentAttempt;
    }

    private void addAttemptStyle(AttemptKind kind) {
        container.getStyleClass().add(kind.toString().toLowerCase());
    }
    private void clearAttemptStyles() {
        for (AttemptKind kind :
                AttemptKind.values()
                )
        {
            container.getStyleClass().remove(kind.toString().toLowerCase());
        }
    }
    public void DEBUG(ActionEvent actionEvent){
        System.out.println("HI MOM");
    }
}
