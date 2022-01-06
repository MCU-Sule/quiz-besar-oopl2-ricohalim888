package com.rico.controller;
/**
 * Rico Halim 1972014
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MemberManagementController {
    @FXML
    private TextField txname;
    @FXML
    private TextField txid;
    @FXML
    private TextField txphonenum;
    @FXML
    private DatePicker txbirth;
    @FXML
    private DatePicker txentry;
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn colid;
    @FXML
    private TableColumn colname;
    @FXML
    private TableColumn colphone;
    @FXML
    private TableColumn colbirth;
    @FXML
    private TableColumn colentry;

    public void birth(ActionEvent actionEvent) {
    }

    public void entry(ActionEvent actionEvent) {
    }
}
