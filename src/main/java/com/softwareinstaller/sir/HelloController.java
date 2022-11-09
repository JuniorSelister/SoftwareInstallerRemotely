package com.softwareinstaller.sir;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    ObservableList listHost = FXCollections.observableArrayList();
    ObservableList listSoftware = FXCollections.observableArrayList();

    @FXML
    private Label welcomeText;
    public ListView<String> hostList;
    public ListView<String> softwareList;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        loadData();
        loadSoftware();
    }

    private void loadData() {
        listHost.removeAll(listHost);

        String hostA = "BRCANOHOST1";
        String hostB = "BRCANOHOST2";
        String hostC = "BRCANOHOST3";
        String hostD = "BRCANOHOST4";
        String hostE = "BRCANOHOST5";
        String hostF = "BRCANOHOST6";

        listHost.addAll(hostA, hostB, hostC, hostD, hostE, hostF);
        hostList.getItems().addAll(listHost);
    }

    private void loadSoftware() {
        listSoftware.removeAll(listSoftware);

        String softwareA = "Office 2023";
        String softwareB = "Adobe Reader";
        String softwareC = "Team Viewer";

        listSoftware.addAll(softwareA, softwareB, softwareC);
        softwareList.getItems().addAll(listSoftware);
    }
}