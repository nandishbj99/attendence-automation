/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;
import np.com.ngopal.control.*;
import jdk.nashorn.internal.runtime.regexp.joni.ast.AnchorNode;

import static java.lang.System.exit;

/**
 * FXML Controller class
 *
 * @author User
 */
public class fxmllogincontroller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
  public  TextField name;


    @FXML
    PasswordField password;

    @FXML
    Button login;

    @FXML
    Button register;

    @FXML
    Button reset;

    @FXML
    Label errormsg;

    @FXML
    AnchorPane AnchorPane;

static String n;
    @Override
    public void initialize(URL url, ResourceBundle rb) {



        // TODO
    }

    public void loginprocess(ActionEvent e) {
        Connection con;
if(e.getSource().equals(login))
{
    try
    {
        String na="";
        String pa="";
                   con=GetConn.getcon();
        Statement st=con.createStatement();
        n=name.getText();
        String pass=password.getText();
        ResultSet rs;
        String sql="select * from faculty";
        rs=st.executeQuery(sql);
        while(rs.next())
        {
            na=rs.getString(2);
            pa=rs.getString(3);
        }
        if (na.equals(n))
        {
            if(pa.equals(pass))
            {


                Stage stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
                stage.close();
                Stage stage1=new Stage();
                FXMLLoader loader=new FXMLLoader();
                loader.setLocation(getClass().getResource("selection.fxml"));
                loader.load();
                Parent root=loader.getRoot();
                Scene scene=new Scene(root);
                stage1.setScene(scene);
                stage1.isResizable();
                stage1.show();

            }
            else {
               Alert al=new Alert(Alert.AlertType.WARNING);
               al.setContentText("password is wrong");
               al.show();
            }
        }
        else {
            Alert al=new Alert(Alert.AlertType.WARNING);
            al.setContentText("username is wrong");
            al.show();
        }


    }catch (Exception e1)
    {
        e1.printStackTrace();
    }
    }
}
public void reset(ActionEvent ae)
{
    if (ae.getSource().equals(reset))
    {
        name.setText("");
        password.setText("");
    }
}
public void register(ActionEvent ae) throws Exception
{
    if (ae.getSource().equals(register))
    {



       Stage stage=(Stage) ((Node)ae.getSource()).getScene().getWindow();
       stage.hide();
       Stage stage1=new Stage();
       FXMLLoader loader=new FXMLLoader();
       loader.setLocation(getClass().getResource("register.fxml"));
       loader.load();
       Parent root=loader.getRoot();
       Scene scene=new Scene(root);
       stage1.setScene(scene);
       stage1.isResizable();
stage1.show();


    }
}

}
