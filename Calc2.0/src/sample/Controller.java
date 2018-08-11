package sample;
import java.util.*;
import javafx.scene.control.TextInputControl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import java.util.ResourceBundle;
import java.net.URL;

public class Controller {

    float data = 0f;
    int operation = -1;

    @FXML
    private AnchorPane mainPage;
    @FXML
    private Pane notificationBar;
    @FXML
    private Pane display;
    @FXML
    private TextArea screen_2;
    @FXML
    private TextArea screen_1;
    @FXML
    private Pane numbers;
    @FXML
    private Button button_equal;
    @FXML
    private Button button_0;
    @FXML
    private Button button_dot;
    @FXML
    private Button button_1;
    @FXML
    private Button button_2;
    @FXML
    private Button button_3;
    @FXML
    private Button button_4;
    @FXML
    private Button button_5;
    @FXML
    private Button button_6;
    @FXML
    private Button button_7;
    @FXML
    private Button button_8;
    @FXML
    private Button button_9;
    @FXML
    private Pane signs;
    @FXML
    private Button button_AC;
    @FXML
    private Button button_devide;
    @FXML
    private Button button_multiply;
    @FXML
    private Button button_substract;
    @FXML
    private Button button_plus;
    @FXML
    public void action(javafx.event.ActionEvent event) {
        if (event.getSource() == button_1){
            screen_2.setText(screen_2.getText()+ "1");
        }
        else if (event.getSource() == button_2){
            screen_2.setText(screen_2.getText()+ "2");
        }
        else if (event.getSource() == button_3){
            screen_2.setText(screen_2.getText()+ "3");
        }
        else if (event.getSource() == button_4){
            screen_2.setText(screen_2.getText()+ "4");
        }
        else if (event.getSource() == button_5){
            screen_2.setText(screen_2.getText()+ "5");
        }
        else if (event.getSource() == button_6){
            screen_2.setText(screen_2.getText()+ "6");
        }
        else if (event.getSource() == button_7){
            screen_2.setText(screen_2.getText()+ "7");
        }
        else if (event.getSource() == button_8){
            screen_2.setText(screen_2.getText()+ "8");
        }
        else if (event.getSource() == button_9){
            screen_2.setText(screen_2.getText()+ "9");
        }
        else if (event.getSource() == button_0){
            screen_2.setText(screen_2.getText()+ "0");
        }
        else if (event.getSource() == button_dot){
            screen_2.setText(screen_2.getText()+ ".");
        }
        else if (event.getSource() == button_AC){
            screen_2.setText("");
        }

        //operations
        else if (event.getSource() == button_plus){
            screen_2.setText(screen_2.getText()+ "+");
            data = Float.parseFloat(screen_2.getText());
            operation = 1; //addition
        }
        else if (event.getSource() == button_substract){
            screen_2.setText(screen_2.getText()+ "-");
            data = Float.parseFloat(screen_2.getText());
            operation = 2; //subtraction
        }
        else if (event.getSource() == button_multiply){
            screen_2.setText(screen_2.getText()+ "×");
            data = Float.parseFloat(screen_2.getText());
            operation = 3; //Multiplication
        }
        else if (event.getSource() == button_devide){
            screen_2.setText(screen_2.getText()+ "÷");
            data = Float.parseFloat(screen_2.getText());
            operation = 4; //division
        }
        else if (event.getSource() == button_equal){
            Float secondOperand = Float.parseFloat(screen_2.getText());
            switch (operation)
            {
                case 1: //addition
                    Float answer = data + secondOperand;
                    screen_1.setText(String.valueOf(answer));
                    break;
                case 2: //subtraction
                    answer = data - secondOperand;
                    screen_1.setText(String.valueOf(answer));
                    break;
                case 3: //multiplication
                    answer = data * secondOperand;
                    screen_1.setText(String.valueOf(answer));
                    break;
                case 4: //division
                    answer = 0f;
                    try {
                        answer = data / secondOperand;
                    }
                    catch (Exception e){
                        screen_1.setText("Error");
                    }
                    screen_1.setText(String.valueOf(answer));
                    break;
            }
        }
    }

}