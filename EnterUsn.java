package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

public class EnterUsn implements Initializable {
    @FXML
    TextField usn;
    @FXML
    Button enter;

    static  String entered_usn;

            @FXML
            public void enter(ActionEvent e) throws Exception
            {
                entered_usn=usn.getText();
                Stage st=(Stage) ((Node)e.getSource()).getScene().getWindow();
                st.close();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                loader.setLocation(getClass().getResource("status_view.fxml"));
                loader.load();
                Parent root=loader.getRoot();
                Scene scene=new Scene(root);
                stage.setScene(scene);

                stage.show();
            }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
