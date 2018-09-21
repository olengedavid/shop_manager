package main.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import main.models.User;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class LoginController {

    String usertype;

    @FXML
    private TextField txtusername;

    @FXML
    private TextField txtpassword;

    public void onLoginButtonClicked(){

        String userId = txtusername.getText();
        String password = txtpassword.getText();


        //User incomingUser = verifyIncomingUser(userId, password);
        if(userId.equals("admin") && password.equals("123")) {
            //redirect to  the  admin panel
            JOptionPane.showMessageDialog(null, "loged in as admin ");
        }else if (userId.equals("normal") && password.equals("123")){

            //redirect  to the  normal  user  panel
            JOptionPane.showMessageDialog(null, "loged in as normal user ");
        }else{
            //show  error message on login  screen
            JOptionPane.showMessageDialog(null, " user does not exist or wrong credentials ");
        }
    }
}
