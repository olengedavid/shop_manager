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

        String  incomingUser = verifyIncomingUser(userId, password);
        if(incomingUser.equals("admin") && password.equals("123")) {

            showAdminPanel();

        }else if (incomingUser.equals("normal") && password.equals("123")){

          showUserPanel();
        }else{

            showError();

        }

    }

    private void showError() {
        JOptionPane.showMessageDialog(null, " user does not exist or wrong credentials ");
    }

    private void showUserPanel() {
        JOptionPane.showMessageDialog(null, "loged in as user ");
    }

    private void showAdminPanel() {
        JOptionPane.showMessageDialog(null, "loged in as admin ");
    }

    /** use  the provided  credentials to check if user exist in the database
     * @Param userId refferes to the userId passed in the login screen
     * @param password refferes to the password  passed in the login screen
     * @return String  the usertype gotten from the database
     **/
    private String verifyIncomingUser(String userId, String password) {


        if(userId.equals("admin") && password.equals("123")) {
          usertype = "admin";
        }else if (userId.equals("normal") && password.equals("123")){

            //redirect  to the  normal  user  panel
          usertype = "normal";
        }else{
            usertype=  "empty";
        }

        return  usertype;
    }
}
