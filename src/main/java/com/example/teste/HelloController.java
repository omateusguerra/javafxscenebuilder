package com.example.teste;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    @FXML
    private Label welcomeText;
    @FXML
    private Button btnCalcula;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfN1;
    @FXML
    private TextField tfN2;
    @FXML
    private Double media;
    @FXML
    public void calculaMedia(){
        Double n1 = Double.parseDouble(tfN1.getText());
        Double n2 = Double.parseDouble(tfN2.getText());
        String name = tfNome.getText();
        this.media = (n1+n2)/2;

        if(media<7 && media>4){
            System.out.println(name + " Você está em RECUPERAÇÃO!");
        }else if(media<4){
            System.out.println(name + " Você está REPROVADO!");
        }else{
            System.out.println(name + " Você está em APROVADO!");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}