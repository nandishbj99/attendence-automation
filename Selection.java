package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

public class Selection  implements Initializable  {

    @FXML
    private TextField date;

    @FXML
    private ComboBox<String> sclass;

    @FXML
    private ComboBox<String> subject;

    @FXML
    private Button take;

    @FXML
    private Button status;
    @FXML
    private TableView<Faculty_data> show_details;

    @FXML
    private TableColumn<Faculty_data,String> sub;

    @FXML
    private TableColumn<Faculty_data,String> Class;

    @FXML
    private ComboBox<String> sclass1;

    @FXML
    private ComboBox<String> subject1;

    @FXML
    private Label fac_name;

    static String selected_sub;
    static String selected_sub1;

    static String selected_class;
    static String selected_class1;
    static String selected_date;



    @FXML
public void take_attendence(ActionEvent e) throws Exception
{
   selected_sub=subject.getValue();
   selected_class=sclass.getValue();

   selected_date=date.getText();

    FXMLLoader loader=new FXMLLoader();
    loader.setLocation(getClass().getResource("attendence_list.fxml"));
    loader.load();
    Parent root=loader.getRoot();
Stage stage=new Stage();

Scene scene=new Scene(root);
stage.setScene(scene);
stage.isResizable();
stage.show();
}

@FXML
public void show_status(ActionEvent e) throws Exception
    {
        selected_sub1=subject1.getValue();
        selected_class1=sclass1.getValue();

        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("enter_usn.fxml"));
        loader.load();
        Parent root=loader.getRoot();
        Stage stage=new Stage();

        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.isResizable();
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

date.setText(String.valueOf(LocalDate.now()));




        try {

            ObservableList<String> list = FXCollections.observableArrayList();
            ObservableList<String> data = FXCollections.observableArrayList();
            ObservableList<Faculty_data> data1=FXCollections.observableArrayList();


            Connection con = GetConn.getcon();
            ResultSet rs;
            String name1 = fxmllogincontroller.n;
            fac_name.setText(name1);


            PreparedStatement ps = con.prepareStatement("select * from faculty where name=? ");
            ps.setString(1, name1);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("sub1"));
                list.add(rs.getString("sub2"));
                list.add(rs.getString("sub3"));
                data.add(rs.getString("class1"));
                data.add(rs.getString("class2"));
                data.add(rs.getString("class3"));
                data1.add(new Faculty_data(rs.getString("sub1"),rs.getString("class1")));
                data1.add(new Faculty_data(rs.getString("sub2"),rs.getString("class2")));
                data1.add(new Faculty_data(rs.getString("sub3"),rs.getString("class3")));
            }
            sclass.setItems(data);
            subject.setItems(list);
            sclass1.setItems(data);
            subject1.setItems(list);
            sub.setCellValueFactory(new PropertyValueFactory<>("Subject"));
            Class.setCellValueFactory(new PropertyValueFactory<>("Class1"));
            show_details.setItems(null);
            show_details.setItems(data1);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    }

