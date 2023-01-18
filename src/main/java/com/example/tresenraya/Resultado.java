package com.example.tresenraya;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import kotlin.Result;

import java.io.IOException;

public class Resultado {
    Game game = new Game();

    @FXML
    Label labelGanador = new Label();

    @FXML
    static Button botonVolver = new Button();

    static String elGanador;

    static Stage windowPopUp = new Stage();

    public static void createPopUpResult(String ganador) throws IOException {

        windowPopUp.setTitle("Resultado");
        windowPopUp.setMinWidth(300);
        windowPopUp.setResizable(false);

        elGanador = ganador;

        Parent root = FXMLLoader.load(Resultado.class.getResource("Winner.fxml"));
        Scene scene = new Scene(root, 350, 250);
        String css = Resultado.class.getResource("Game.css").toExternalForm();
        scene.getStylesheets().add(css);
        windowPopUp.setScene(scene);
        windowPopUp.showAndWait();


    }

    public void initialize() throws IOException {
        labelGanador.setText(elGanador);
    }

    public void closeResultadoWinner() {
        windowPopUp.close();
    }
}
