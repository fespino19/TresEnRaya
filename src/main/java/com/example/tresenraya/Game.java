package com.example.tresenraya;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {
    Random random = new Random();
    @FXML
    Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;
    @FXML
    List<Button> buttonList;
    @FXML
    RadioButton playerPlayer, playerMachine, machineMachine;
    @FXML
    ToggleGroup gameMode;
    @FXML
    Button startGame;
    @FXML
    Label gameModeLabel;
    @FXML
    Label buttonsDisabledLabel;
    @FXML

    boolean hayGanador;

    static String turno = "X";

    String XWinner = "Ha ganado la X";
    String OWinner = "Ha ganado la O";


    public void playerPlayer()throws Exception{
        enableButtons();

        for (int i = 0; i < buttonList.size(); i++) {
            buttonList.get(i).setOnAction(e -> {
                Button boton = (Button) e.getSource();
                if (boton.getText().equals("")) {
                    if (turno.equals("X")) {
                        boton.setStyle("-fx-text-fill: rgb(36, 201, 64);");
                    } else {
                        boton.setStyle("-fx-text-fill: rgb(232, 12, 45);");
                    }
                    boton.setText(turno);
                    turno = switchPlayer(turno);

                    try{hayGanador = ComprobarGanador.comprobarX(buttonList, XWinner, hayGanador);}catch (
                            IOException ioException){ioException.printStackTrace();}
                    if (!hayGanador) {
                        try{
                            ComprobarGanador.comprobarO(buttonList, OWinner, hayGanador);}catch(IOException ioException){ioException.printStackTrace(); }
                    }

                }
            });
        }

    }


    /********** PLAYER VS MACHINE MODE **********/

    public void playerMachine() {

        enableButtons();

        for (int i = 0; i < buttonList.size(); i++) {
            buttonList.get(i).setOnAction(e -> {
                Button boton = (Button) e.getSource();
                if (boton.getText().equals("")) {
                    if (turno.equals("X")) {
                        boton.setStyle("-fx-text-fill: rgb(36, 201, 64);");
                    } else {
                        boton.setStyle("-fx-text-fill: rgb(232, 12, 45);");
                    }
                    boton.setText(turno);
                    turno = switchPlayer(turno);

                    try {hayGanador = ComprobarGanador.comprobarX(buttonList, XWinner, hayGanador);}catch (IOException ioException) {ioException.printStackTrace();}

                    if (!hayGanador) {
                        try{hayGanador = ComprobarGanador.comprobarO(buttonList, OWinner, hayGanador);}catch (IOException ioException) {ioException.printStackTrace();}
                    }

                    boolean quedan = false;
                    for (Button button : buttonList) {
                        if (button.getText().equals("")) {
                            quedan = true;
                            break;
                        }
                    }


                    if (quedan && !hayGanador) {
                        int num;

                        for (int j = 0; j < 1; j++) {

                            num = random.nextInt(9);
                            if (buttonList.get(num).getText().equals("")) {

                                if (turno.equals("X")) {
                                    buttonList.get(num).setStyle("-fx-text-fill: rgb(36, 201, 64);");
                                } else {
                                    buttonList.get(num).setStyle("-fx-text-fill: rgb(232, 12, 45);");
                                }
                                buttonList.get(num).setText(turno);
                                turno = switchPlayer(turno);

                                try {hayGanador = ComprobarGanador.comprobarX(buttonList, XWinner, hayGanador);}catch (IOException ioException) {ioException.printStackTrace();}
                                if (!hayGanador) {
                                    try{hayGanador = ComprobarGanador.comprobarO(buttonList, OWinner, hayGanador);}catch (IOException ioException) {ioException.printStackTrace();}
                                }

                            } else {
                                j--;
                            }
                        }
                    }
                }
            });
        }
    }

    /********** MACHINE VS MACHINE MODE **********/
    public void machineMachine() throws IOException {

        enableButtons();
        int num;

        for (int i = 0; i < buttonList.size(); i++) {
            num = random.nextInt(9);
            if (buttonList.get(num).getText().equals("")) {
                if (turno.equals("X")) {
                    buttonList.get(num).setStyle("-fx-text-fill: rgb(36, 201, 64);");
                } else {
                    buttonList.get(num).setStyle("-fx-text-fill: rgb(232, 12, 45);");
                }
                buttonList.get(num).setText(turno);
                turno = switchPlayer(turno);

                hayGanador = ComprobarGanador.comprobarX(buttonList, XWinner, hayGanador);
                if (!hayGanador) {
                    hayGanador = ComprobarGanador.comprobarO(buttonList, OWinner, hayGanador);
                }

                if (hayGanador) {
                    turno = "X";
                    break;
                }

            } else {
                i--;
            }
        }
    }
    /********** Metodo para cambiar la marca que representa a cada jugador **********/
    private String switchPlayer(String turno) {
        turno = turno.equals("X") ? "O" : "X";
        return turno;

    }

    /********** Metodo para resetean todos los botones **********/
    public void reset() {
        buttonList = Arrays.asList(boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9);
        for (Button button : buttonList) {
            button.setText("");
        }
        turno = "X";

        for (Button button : buttonList) {
            button.setStyle("-fx-background-color: rgb(74, 68, 105);");
        }
    }
    /********** Metodo para activar todos los botones **********/

    private void enableButtons() {
        for (Button button : buttonList) {
            button.setDisable(false);
        }
    }

    /********** Metodo para desactivar todos los botones **********/
    public void disableButtons() {
        for (Button button : buttonList) {
            button.setDisable(true);
        }
    }


    @FXML
    protected void initialize() throws IOException {
        buttonsDisabledLabel.setText("Buttons are disabled!");

        buttonList = Arrays.asList(boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9);
        disableButtons();

        gameMode.selectedToggleProperty().addListener((observableValue, toggle, t1) -> {

            if (playerPlayer.isSelected()) {
                startGame.setText("START GAME");
                startGame.setOnAction(e -> {
                    try {
                        startGame.setText("PLAY AGAIN");
                        System.out.println("SE EJECUTA EL MODO PVP");
                        gameModeLabel.setText("Player VS Player");
                        reset();
                        enableButtons();
                        buttonsDisabledLabel.setVisible(false);
                        playerPlayer.setStyle("");
                        playerPlayer();
                    } catch (Exception ioException){ioException.printStackTrace();}
                });
            } else if (playerMachine.isSelected()) {
                startGame.setText("START GAME");
                startGame.setOnAction(e -> {
                    startGame.setText("PLAY AGAIN");
                    System.out.println("SE EJECUTA EL PVM");
                    gameModeLabel.setText("Player VS Machine");
                    reset();
                    enableButtons();
                    buttonsDisabledLabel.setVisible(false);
                    playerMachine();
                });
            } else if (machineMachine.isSelected()){
                startGame.setText("START GAME");
                startGame.setOnAction(e -> {
                    try {
                        System.out.println("SE EJECUTA EL MVM");
                        startGame.setText("PLAY AGAIN");
                        gameModeLabel.setText("Machine VS Machine");
                        reset();
                        enableButtons();
                        buttonsDisabledLabel.setVisible(false);
                        machineMachine();
                    }catch (IOException ioException){ioException.printStackTrace();}
                });
            } else {

            }
        });
    }

    }

