package pe.edu.upeu.JuegoMichi.control;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.JuegoMichi.modelo.Jgars;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class controlGame {
    String gaming1;
    String gaming2;
    int indexID = 1;
    boolean marca = true;

    @FXML
    Label val1,val2,val3,val4,val5,val6,val7,val8,val9,lblJugador;
    @FXML
    private TextField txtJugador;
    @FXML
    Button btnIniciar,btnval1;
    @FXML
    AnchorPane panelJuego;

    ArrayList<String> ga1= new ArrayList<>();
    ArrayList<String> ga2= new ArrayList<>();
    ArrayList<String> id= new ArrayList<>();
    ArrayList<String> stado= new ArrayList<>();
    private void isert_Jugador(String jugador){
        txtJugador.appendText(jugador);
    }
    private void initcializer(){
        panelJuego.setDisable(true);
       // lblJugador.setText("juagador 1");
    }
    private void startGame(){
        //AgregarJugador
       try{
           String[] tokens = txtJugador.getText().split(" ");
           if (tokens.length < 3) {
               return;
           }
       }catch (Exception e){
           System.out.println("error " + e);
       }
    }
    String valor;
    int nro=0;

    @FXML
    private void controlClick(ActionEvent event){

        //System.out.println("isiste click");
        try {
            Button cambio = (Button) event.getSource();
            String txt = "isiste click";

            //Label cambio=(Label) event.getSource();
            ;
            if(nro==0){valor="O"; nro=1;lblJugador.setText("jugador 1");}else{valor="X"; nro=0;lblJugador.setText("jugador 2");}
            switch (cambio.getId()) {
                case "btnval1":{val1.setText(valor) ;}break;
                case "btnval2":{val2.setText(valor) ;}break;
                case "btnval3":{val3.setText(valor) ;}break;
                case "btnval4":{val4.setText(valor) ;}break;
                case "btnval5":{val5.setText(valor) ;}break;
                case "btnval6":{val6.setText(valor) ;}break;
                case "btnval7":{val7.setText(valor) ;}break;
                case "btnval8":{val8.setText(valor) ;}break;
                case "btnval9":{val9.setText(valor) ;}break;}

        }catch(Exception e){
            System.out.println("error"+e);
        }
    }




}
