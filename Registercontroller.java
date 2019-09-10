package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Registercontroller implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField id;

    @FXML
    private PasswordField pass;
    @FXML
    private PasswordField conpass;

    @FXML
    private Label errorpass;

    @FXML
    private Label errorname;

    @FXML
    private Label errorclass;
    @FXML
    private TextField sub1;
    @FXML
    private TextField sub2;
    @FXML
    private TextField sub3;
    @FXML
    private TextField class1;
    @FXML
    private TextField class2;
    @FXML
    private TextField class3;
    @FXML
    private Button submit;
    @FXML
    private Button reset;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void submit(ActionEvent e) throws Exception {

        if (name.getText().isEmpty() || id.getText().isEmpty() || pass.getText().isEmpty() || sub1.getText().isEmpty() || class1.getText().isEmpty()) {
            Alert al = new Alert(Alert.AlertType.WARNING);

            al.setContentText("fill up all details ");
            al.show();
        } else {
            boolean flag = true;
            Connection con = GetConn.getcon();
            Statement statement = con.createStatement();
            ResultSet rs;
            rs = statement.executeQuery("select * from faculty");
            ArrayList<String> n = new ArrayList<>();
            while (rs.next()) {

                n.add(rs.getNString("name"));
            }
            for (int i = 0; i < n.size(); i++) {

                if (name.getText().equals(n.get(i))) {

                    flag = false;
                }
            }
            if (flag) {

                if (conpass.getText().equals(pass.getText())) {


                    PreparedStatement ps;
                    ps = con.prepareStatement("insert into faculty values(?,?,?,?,?,?,?,?,?)");
                    ps.setInt(1, Integer.parseInt(id.getText()));
                    ps.setString(2, name.getText());
                    ps.setString(3, pass.getText());
                    ps.setString(4, sub1.getText());
                    ps.setString(5, sub2.getText());
                    ps.setString(6, sub3.getText());
                    ps.setString(7, class1.getText());
                    ps.setString(8, class2.getText());
                    ps.setString(9, class3.getText());
                    ps.executeUpdate();


                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("login.fxml"));
                    loader.load();
                    Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                    stage.close();
                    Stage st = new Stage();
                    Parent root = loader.getRoot();
                    Scene sc = new Scene(root);
                    st.setScene(sc);
                    st.isResizable();
                    st.show();
                    Alert al = new Alert(Alert.AlertType.CONFIRMATION);
                    al.setContentText("faculty added successfully");
                    al.show();


                } else {
                    errorpass.setText("enter password correctly");
                }
            } else {
                errorname.setText("Name Exist");
                name.setText("");
            }
        }
    }

    @FXML
    public void reset(ActionEvent ev) throws Exception {
        if (ev.getSource().equals(reset)) {
            id.setText("");
            name.setText("");
            pass.setText("");
            conpass.setText("");
            sub1.setText("");
            sub2.setText("");
            sub3.setText("");
            class1.setText("");
            class2.setText("");
            class3.setText("");


        }
    }

    @FXML
    public void checkclass(KeyEvent iev) {
        if (iev.getSource().equals(class1)) {
            errorclass.setText("enter class correctly EX: 4A  (4th sem A section)");
        } else if (iev.getSource().equals(class2)) {
            errorclass.setText("enter class correctly EX: 4A  (4th sem A section)");
        } else if(iev.getSource().equals(class3)){
            errorclass.setText("enter class correctly EX: 4A  (4th sem A section)");
        }
        else if(iev.getSource().equals(sub1))
        {
            errorclass.setText("");
        }
        else if(iev.getSource().equals(sub2))
        {
            errorclass.setText("");
        }
        else if(iev.getSource().equals(sub3))
        {
            errorclass.setText("");
        }
    }
}