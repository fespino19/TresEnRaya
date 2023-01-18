package com.example.tresenraya;

import javafx.scene.control.Button;

import java.io.IOException;
import java.util.List;

public class ComprobarGanador {
    public static boolean comprobarX(List<Button> botonLista, String xwinner, boolean hayGanador) throws IOException {


        if (botonLista.get(0).getText().equals("X") && botonLista.get(1).getText().equals("X") && botonLista.get(2).getText().equals("X")) {
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(1).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(2).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(xwinner);
        } else if (botonLista.get(0).getText().equals("X") && botonLista.get(3).getText().equals("X") && botonLista.get(6).getText().equals("X")) {
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(3).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(6).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(xwinner);
        } else if (botonLista.get(0).getText().equals("X") && botonLista.get(4).getText().equals("X") && botonLista.get(8).getText().equals("X")) {
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(8).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(xwinner);
        } else if (botonLista.get(6).getText().equals("X") && botonLista.get(7).getText().equals("X") && botonLista.get(8).getText().equals("X")) {
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(6).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(7).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(8).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(xwinner);
        } else if (botonLista.get(8).getText().equals("X") && botonLista.get(5).getText().equals("X") && botonLista.get(2).getText().equals("X")) {
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(8).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(5).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(2).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(xwinner);
        } else if (botonLista.get(2).getText().equals("X") && botonLista.get(4).getText().equals("X") && botonLista.get(6).getText().equals("X")) {
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(2).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(6).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(xwinner);
        } else if (botonLista.get(3).getText().equals("X") && botonLista.get(4).getText().equals("X") && botonLista.get(5).getText().equals("X")) {
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(3).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(5).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(xwinner);
        } else if (botonLista.get(1).getText().equals("X") && botonLista.get(4).getText().equals("X") && botonLista.get(7).getText().equals("X")) {
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(1).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(7).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(xwinner);
        } else if (!botonLista.get(0).getText().equals("") && !botonLista.get(1).getText().equals("") && !botonLista.get(2).getText().equals("") && !botonLista.get(3).getText().equals("")
                && !botonLista.get(4).getText().equals("") && !botonLista.get(5).getText().equals("") && !botonLista.get(6).getText().equals("") && !botonLista.get(7).getText().equals("")
                && !botonLista.get(8).getText().equals("")) {
            System.out.println("Empate");
            hayGanador = true;
            Resultado.createPopUpResult("Empate");
        } else {
            hayGanador = false;
        }

        return hayGanador;

    }

    public static boolean comprobarO(List<Button> botonLista, String owinner, boolean hayGanador) throws IOException {


        if (botonLista.get(0).getText().equals("O") && botonLista.get(1).getText().equals("O") && botonLista.get(2).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(1).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(2).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(owinner);
        } else if (botonLista.get(0).getText().equals("O") && botonLista.get(3).getText().equals("O") && botonLista.get(6).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(3).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(6).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(owinner);
        } else if (botonLista.get(0).getText().equals("O") && botonLista.get(4).getText().equals("O") && botonLista.get(8).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(8).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(owinner);
        } else if (botonLista.get(6).getText().equals("O") && botonLista.get(7).getText().equals("O") && botonLista.get(8).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(6).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(7).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(8).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(owinner);
        } else if (botonLista.get(8).getText().equals("O") && botonLista.get(5).getText().equals("O") && botonLista.get(2).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(8).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(5).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(2).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(owinner);
        } else if (botonLista.get(2).getText().equals("O") && botonLista.get(4).getText().equals("O") && botonLista.get(6).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(2).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(6).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(owinner);
        } else if (botonLista.get(3).getText().equals("O") && botonLista.get(4).getText().equals("O") && botonLista.get(5).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(3).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(5).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(owinner);
        } else if (botonLista.get(1).getText().equals("O") && botonLista.get(4).getText().equals("O") && botonLista.get(7).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(1).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(7).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            Resultado.createPopUpResult(owinner);
        } else if (!botonLista.get(0).getText().equals("") && !botonLista.get(1).getText().equals("") && !botonLista.get(2).getText().equals("") && !botonLista.get(3).getText().equals("")
                && !botonLista.get(4).getText().equals("") && !botonLista.get(5).getText().equals("") && !botonLista.get(6).getText().equals("") && !botonLista.get(7).getText().equals("")
                && !botonLista.get(8).getText().equals("")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
            System.out.println("Empate");
            hayGanador = true;
            Resultado.createPopUpResult("Empate");
        } else {
            hayGanador = false;
        }

        return hayGanador;

    }
}
