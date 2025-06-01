package com.devricks.pomodoro.technique.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

import com.devricks.pomodoro.technique.util.TextToSpeech;

public class PomodoroController {

    private static final int WORK_MINUTES = 25;
    private static final int BREAK_MINUTES = 5;

    private int secondsRemaining;
    private boolean isWorkTime = true;
    private Timeline timeline;

    @FXML
    private Label timerLabel;

    @FXML
    private Label statusLabel;

    @FXML
    public void initialize() {
        startSession();
    }

    private void startSession() {
        secondsRemaining = (isWorkTime ? WORK_MINUTES : BREAK_MINUTES) * 60;
        statusLabel.setText("Status: " + (isWorkTime ? "Work" : "Break"));
        if (isWorkTime) {
            StringBuilder workMessage;
            workMessage = new StringBuilder("Time to work for ");
            workMessage.append(WORK_MINUTES)
                       .append(" minutes, come on get going!");
            TextToSpeech.speak(workMessage.toString());
        }
        updateTimerLabel();

        if (timeline != null) timeline.stop();

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            if (e.isConsumed())
            {
                System.out.println("Event already consumed, skipping update.");
                return; // Skip if the event is already consumed
            }
            secondsRemaining--;
            updateTimerLabel();

            if (secondsRemaining <= 0) {
                isWorkTime = !isWorkTime;
                if (!isWorkTime) {
                    StringBuilder breakMessage;
                    breakMessage = new StringBuilder("Get up and take a break for ");
                    breakMessage.append(BREAK_MINUTES)
                               .append(" minutes!");
                    TextToSpeech.speak(breakMessage.toString());
                }
                startSession();
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void updateTimerLabel() {
        int minutes = secondsRemaining / 60;
        int seconds = secondsRemaining % 60;
        timerLabel.setText(String.format("Time Left: %02d:%02d", minutes, seconds));
    }
}
